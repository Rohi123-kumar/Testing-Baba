package TestPakage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLibraryPackage.BaseLibrary;
import PagePakage.LinkPage;



public class LinkPageTest extends BaseLibrary
{
	LinkPage ob;
	@BeforeTest
	@Parameters("browser")
	public void lunchurl(String browser)
	{
		lunchURL(browser);
		ob=new LinkPage();
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
	@Test (priority=4)
	public void click_on_links() throws InterruptedException
	{
		ob.ClickOnLinks();
	}
	@Test (priority=5)
	public void Click_On_DemoPage()throws InterruptedException
	{
		ob.ClickOnDemopage();
	}
	

}
