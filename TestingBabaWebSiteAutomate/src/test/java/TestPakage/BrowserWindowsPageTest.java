package TestPakage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLibraryPackage.BaseLibrary;
import PagePakage.BrowserWindowsPage;



public class BrowserWindowsPageTest extends BaseLibrary
{
	BrowserWindowsPage ob;
	@BeforeTest
	@Parameters("browser")
	public void lunchurl(String browser)
	{
		lunchURL(browser);
		ob=new BrowserWindowsPage();
	}
	@Test (priority=1)
	public void click_on_close()
	{
		ob.ClickOnClose();
	}
	@Test (priority=2)
	public void click_on_practice()
	{
		ob.ClickOnPractice();
	}
	@Test (priority=3)
	public void Click_on_AlertFrameWindows()
	{
		ob.ClickOnAlertFrameWindows();
	}
	@Test(priority=4)
	public void Click_On_Browser_Windows()
	{
		ob.ClickOnBrowserWindows();
	}
	@Test(priority=5)
	public void Click_On_NewTab() throws InterruptedException
	{
		ob.ClickOnNewTab();
	}
	@Test(priority=6)
	public void Click_On_NewWindows()
	{
		ob.ClickOnNewWindows();
	}
	@Test(priority=7)
	public void Click_On_New_Windows_Message() throws InterruptedException
	{
		ob.ClickOnNewWindowsMessage();
	}


}
