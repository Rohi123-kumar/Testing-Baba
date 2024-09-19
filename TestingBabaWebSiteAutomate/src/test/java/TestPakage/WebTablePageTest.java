package TestPakage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLibraryPackage.BaseLibrary;
import PagePakage.WebTablePage;



public class WebTablePageTest extends BaseLibrary
{
	WebTablePage ob2;
	@BeforeTest
	@Parameters
	public void lunchurl(String browser)
	{
		lunchURL(browser);
		ob2=new WebTablePage();
	}
	@Test (priority=1)
	public void click_on_close() throws InterruptedException
	{
		ob2.ClickOnClose();
	}
	@Test (priority=2)
	public void click_on_practice()
	{
		ob2.ClickOnPractice();
	}
	@Test (priority=3)
	public void click_on_element()
	{
		ob2.ClickOnElement();
	}
	@Test(priority=4)
	public void Click_On_WebTable() throws InterruptedException
	{
		ob2.ClickOnWebTable();
	}
	@Test(priority=5)
	public void Get_Details()
	{
		ob2.fulldetails();
	}
	@Test(priority=6)
	public void Edit_Details()
	{
		ob2.editdetails();
	}


}
