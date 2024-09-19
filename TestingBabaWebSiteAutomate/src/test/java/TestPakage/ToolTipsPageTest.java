package TestPakage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLibraryPackage.BaseLibrary;
import PagePakage.ToolTipsPage;



public class ToolTipsPageTest extends BaseLibrary
{
	ToolTipsPage ob;
	@BeforeTest
	@Parameters
	public void lunchurl(String browser)
	{
		lunchURL(browser);
		ob=new ToolTipsPage();
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
	public void click_on_widget()
	{
		ob.ClickOnWidget();
	}
	@Test(priority=4)
	public void click_on_tooltips() throws InterruptedException
	{
		ob.ClickOnToolTips();
	}
	@Test(priority=5)
	public void getattribute_hover_text()
	{
		ob.getattributeshoverText();
	}


}
