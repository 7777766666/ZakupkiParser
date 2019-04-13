package FTPfz;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.SocketException;
import java.util.Arrays;
import java.util.zip.ZipFile;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;


//enum ��������� ������� Singleton
public enum FTPClient223fz implements FTPClientFZ
{
	INSTANCE;
	public static FTPClient223fz getInstance() { return INSTANCE; }
	
	private static FTPClient ftp = new FTPClient();
	final static String SERVER = "ftp.zakupki.gov.ru";
	final static String USER = "fz223free";
	final static String PASSWD = "fz223free";
	private final static String basicWorkspace = "/out/published/";
	private final static String[] parsingFolders = {"contract", "contractInfo", 
			"contractCompleting", "purchaseNotice", "purchaseNoticeAE", "purchaseNoticeAE94", 
			"purchaseNoticeAESMBO", "purchaseNoticeEP", "purchaseNoticeIS", "purchaseNoticeOA",
			"purchaseNoticeOK", "purchaseNoticeZK", "purchaseNoticeZKESMBO", "purchaseProtocol",
			"purchaseProtocolZK", "purchaseProtocolVK", "purchaseProtocolPAEP", "purchaseProtocolPAAE",
			"purchaseProtocolPAAE94", "purchaseProtocolOSZ", "purchaseProtocolRZOK", 
			"purchaseProtocolRZ1AE", "purchaseProtocolRZ2AE"};
	private final static String downloadPath = "D:/Zakupki";
	
	@Override
	public void connect() throws SocketException, IOException 
	{
		ftp.connect(SERVER);
		System.out.println("SERVER: " + ftp.getReplyStrings());
	}

	@Override
	public void login() throws IOException 
	{
		if(ftp.login(USER, PASSWD))
		{
			System.out.println("LOGGED IN SERVER");
			ftp.enterLocalPassiveMode(); //��������� ����� ������� � ��������
		}
		else
		{
			System.out.println("Failed to log into the server");
            return;
		}
	}
	
	@Override
	public void parseFTPServer() throws IOException
	{
		searchRegionsDirectories(basicWorkspace);
	}
	
	private void searchRegionsDirectories(String workspace) throws IOException
	{
		
		System.out.println(workspace); //DEBUG
		FTPFile[] namesDirectories = ftp.listDirectories(workspace);
		for(FTPFile n: namesDirectories)
		{
			if(!n.getName().equals("archive"))
			{
				makeDownloadDirectories(workspace + "/" + n.getName());
				searchInRegions(workspace + "/" + n.getName());
			}
		}
	}
	
	//������� ���������� �� ��������� ����� ��� �������� ������
	private void makeDownloadDirectories(String workspace)
	{
		 for(String s: parsingFolders)
		 {
			 File dir = new File(downloadPath + workspace + "/" + s + "/daily");
			 dir.mkdirs();
		 }
	}
	
	//����� ����������� ���������� �� �������
	private void searchInRegions(String workspace) throws IOException
	{
		FTPFile[] namesDirectories = ftp.listDirectories(workspace);
		for(FTPFile n: namesDirectories)
		{
			if(Arrays.asList(parsingFolders).contains(n.getName()))
			{
				downloadFiles(workspace + "/" + n.getName());
				downloadFiles(workspace + "/" + n.getName() + "/daily");
			}
		}
	}
	
	//��������� zip-������
	private void downloadFiles(String workspace) throws IOException
	{
		System.out.println(workspace); //DEBUG
		FTPFile[] files = ftp.listFiles(workspace);
		for(FTPFile remote: files)
		{
			if(remote.isFile())
			{
				String path = downloadPath + workspace + "/" +remote.getName();
				path.replace("/", "\\");
				File localfile = new File(path);
				localfile.createNewFile();
				OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(localfile));
				if(!ftp.retrieveFile(workspace + "/" + remote.getName(), outputStream))
				{
					System.out.println("�� ������� ��������� " + workspace + "/" + remote.getName());
				}
				outputStream.close();
			}
		}
	}
}
