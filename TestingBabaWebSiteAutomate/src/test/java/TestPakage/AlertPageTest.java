package TestPakage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLibraryPackage.BaseLibrary;
import PagePakage.AlertPage;



public class AlertPageTest extends BaseLibrary
{
	AlertPage ob;
	@BeforeTest
	@Parameters("browser")
	public void lunchurl(String browser)
	{
		lunchURL(browser);
		ob=new AlertPage();
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
	public void Click_on_AlertFrameWindows()
	{
		ob.ClickOnAlertFrameWindows();
	}
	@Test (priority=4)
	public void Click_On_Alert()
	{
		ob.ClickOnAlert();
	}
	@Test (priority=5)
	public void Click_on_SeeAlert()
	{
		ob.ClickOnSeeAlert();
	}
	@Test (priority=6)
	public void Click_On_5Sec() throws InterruptedException
	{
		ob.ClickOn5Sec();
	}
	@Test (priority=7)
	public void Click_On_ConfirmBox()
	{
		ob.ClickOnConfirmBox();
	}
	@Test (priority=8)
	public void Click_On_PromteBox()
	{
		ob.ClickOnPromteBox();
		
	}

}
