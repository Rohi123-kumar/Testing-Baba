package TestPakage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLibraryPackage.BaseLibrary;
import PagePakage.ButtonPage;



public class ButtonPageTest extends BaseLibrary
{
	ButtonPage ob;
	@BeforeTest
	@Parameters("browser")
	public void lunchurl(String browser)
	{
		lunchURL(browser);
		ob=new ButtonPage();
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
	public void Click_on_Button() throws InterruptedException
	{
		ob.ClickOnButton();
	}
	@Test(priority=5)
	public void Click_Demo()
	{
		ob.ValidateClickData();
	}


}
