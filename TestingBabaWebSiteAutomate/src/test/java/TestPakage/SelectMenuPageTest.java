package TestPakage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLibraryPackage.BaseLibrary;
import PagePakage.SelectMenuPage;



public class SelectMenuPageTest extends BaseLibrary
{
	SelectMenuPage ob;
	@BeforeTest
	@Parameters
	public void lunchurl(String browser)
	{
		lunchURL(browser);
		ob=new SelectMenuPage();
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
	@Test (priority=4)
	public void click_on_selectmenu() throws InterruptedException
	{
		ob.ClickSelectMenu();
	}
	@Test (priority=5)
	public void select_group()
	{
		ob.SelectGroup();
	}
	@Test(priority=6)
	public void Select_One()
	{
		ob.SelectOne();
	}
	
	@Test(priority=7)
	public void Old_Select()
	{
		ob.OldSelect();
	}
	
	@Test(priority=8)
	public void Multi_Select() throws InterruptedException
	{
		ob.MultiSelect();
	}

}
