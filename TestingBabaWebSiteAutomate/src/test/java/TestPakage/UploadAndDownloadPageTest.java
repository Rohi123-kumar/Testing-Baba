package TestPakage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLibraryPackage.BaseLibrary;
import PagePakage.UploadAndDounloadPage;

public class UploadAndDownloadPageTest extends BaseLibrary
{
	UploadAndDounloadPage ob;
	@BeforeTest
	@Parameters("browser")
	public void Launchurl(String browser)
	{
		lunchURL(browser);
		ob=new UploadAndDounloadPage();
	}
	@Test (priority=1)
	public void click_on_close() throws InterruptedException
	{
		ob.ClickOnClose();
	}
	@Test (priority=2)
	public void click_on_practice()
	{
		ob.ClickOnPractice();
	}
	@Test (priority=3)
	public void click_on_element()
	{
		ob.ClickOnElement();
	}
	@Test(priority=4)
	public void Click_On_Upload_And_Download()
	{
		ob.ClickOnUploadAndDownload();
	}
	@Test(priority=5)
	public void Click_On_Choose_File()
	{
		ob.ClickOnChooseFile();
	}
	

}
