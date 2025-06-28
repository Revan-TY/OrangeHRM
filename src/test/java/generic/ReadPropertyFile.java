package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ReadPropertyFile implements Application_constants{
	public Properties readData() throws IOException
	{
	FileInputStream fis = new FileInputStream(propertypath);
	Properties p= new Properties();
	p.load(fis);
	return p;

	}
	public String url() throws IOException
	{
		String testUrl = readData().getProperty("TestUrl");
		return testUrl;
	}
	public String usn() throws IOException
	{
		String testUN =readData().getProperty("TestUN");
		return testUN;
	}
	public String psw() throws IOException
	{
		String testPsw = readData().getProperty("TestPsw");
		return testPsw;

	}
}
