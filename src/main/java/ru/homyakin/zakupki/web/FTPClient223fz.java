package ru.homyakin.zakupki.web;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.homyakin.zakupki.web.exceptions.ConnectException;
import ru.homyakin.zakupki.service.ZipService;
import ru.homyakin.zakupki.web.exceptions.LoginException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

//enum implements the pattern Singleton
public enum FTPClient223fz implements FTPClientFZ {
    INSTANCE;

    public final static String SERVER = "ftp.zakupki.gov.ru";
    public final static String USER = "fz223free";
    public final static String PASSWD = "fz223free";
    private final static Logger logger = LoggerFactory.getLogger(FTPClient223fz.class);
    private final static String basicWorkspace = "/out/published";
    /*
     * private final static List<String> parsingFolders = Arrays.asList("contract",
     * "contractInfo", "contractCompleting", "purchaseNotice", "purchaseNoticeAE",
     * "purchaseNoticeAE94", "purchaseNoticeAESMBO", "purchaseNoticeEP",
     * "purchaseNoticeIS", "purchaseNoticeOA", "purchaseNoticeOK",
     * "purchaseNoticeZK", "purchaseNoticeZKESMBO", "purchaseProtocol",
     * "purchaseProtocolZK", "purchaseProtocolVK", "purchaseProtocolPAEP",
     * "purchaseProtocolPAAE", "purchaseProtocolPAAE94", "purchaseProtocolOSZ",
     * "purchaseProtocolRZOK", "purchaseProtocolRZ1AE", "purchaseProtocolRZ2AE");
     */
    private final static List<String> parsingFolders = Arrays.asList("contract");
    private final static String downloadPath = "./zakupki_download";
    private static FTPClient ftp = new FTPClient();
    private final ZipService zipService = new ZipService();

    public static FTPClient223fz getInstance() {
        return INSTANCE;
    }

    @Override
    public void connect() {
        try {
            ftp.connect(SERVER);
        } catch (IOException e) {
            logger.error("Can't connect to the server", e);
            logger.info("Server reply:{}", Arrays.toString(ftp.getReplyStrings()));
            throw new ConnectException("Unable to connect to server: " + SERVER);
        }
        logger.info("Server reply:{}", Arrays.toString(ftp.getReplyStrings()));
    }

    @Override
    public void login() {
        try {

            if (ftp.login(USER, PASSWD)) {
                System.out.println("LOGGED IN SERVER");
                ftp.enterLocalPassiveMode();
                logger.info("Successful login to the ftp server");
            } else {
                logger.error("Unable to login to the ftp server");
                throw new LoginException("Unable to log in " + SERVER +
                        " with login: " + USER + " and password: " + PASSWD);
            }

        } catch (IOException e) {
            logger.error("Server error", e);
            throw new ConnectException("Unable to connect to server: " + SERVER);
        }
    }

    @Override
    public void parseFTPServer() {
        logger.info("Start parsing in: {}", SERVER);
        searchRegionsDirectories(basicWorkspace);
    }

    private void searchRegionsDirectories(String workspace) {
        try {
            FTPFile[] namesDirectories = ftp.listDirectories(workspace);
            for (FTPFile n : namesDirectories) {
                if (!n.getName().equals("archive")) {
                    makeDownloadDirectories(workspace + "/" + n.getName());
                    searchInRegions(workspace + "/" + n.getName());
                }
            }
        } catch (IOException e) {
            logger.error("Something went wrong wile listing {}", workspace);
        }
    }

    private void makeDownloadDirectories(String workspace) {
        for (String s : parsingFolders) { //TODO make it from searchInRegions
            Path dir = Paths.get(downloadPath + workspace + "/" + s + "/daily/unzip");
            try {
                Files.createDirectories(dir);
            } catch (IOException e) {
                logger.error("Unable to create directories");
                //TODO add RTE
            }
        }
    }

    private void searchInRegions(String workspace) {
        try {
            FTPFile[] namesDirectories = ftp.listDirectories(workspace);
            for (FTPFile n : namesDirectories) {
                if (parsingFolders.contains(n.getName())) {
                    searchFiles(workspace + "/" + n.getName() + "/daily", n.getName());
                }
            }
        } catch (IOException e) {
            logger.error("Something went wrong wile listing {}", workspace);
        }
    }

    private void searchFiles(String workspace, String folder) {
        logger.info("Start parsing {}", workspace);
        try {
            FTPFile[] files = ftp.listFiles(workspace);
            for (FTPFile remote : files) {
                if (remote.isFile()) {
                    if (downloadFile(downloadPath + workspace + "/" + remote.getName(),
                            workspace + "/" + remote.getName())) {
                        zipService.unzipFile(downloadPath + workspace + "/" + remote.getName(),
                                downloadPath + workspace, folder);
                    } else {
                        logger.error("Unable to download " + workspace + "/" + remote.getName());
                    }
                }
            }
        } catch (IOException e) {
            logger.error("Something went wrong wile listing {}", workspace);
        }

    }

    private boolean downloadFile(String localPath, String remotePath) {
        logger.info("Start downloading {}", localPath);
        Path localFile = Paths.get(localPath);
        try {
            Files.createFile(localFile);
        } catch (IOException ignored) {
            //TODO check if error is existing file (make validator class)
        }
        boolean isDownload = false;
        try {
            isDownload = ftp.retrieveFile(remotePath, Files.newOutputStream(localFile));
        } catch (IOException e) {
            logger.error("Something went wrong wile downloading {}", remotePath);
        }
        return isDownload;
    }
}
