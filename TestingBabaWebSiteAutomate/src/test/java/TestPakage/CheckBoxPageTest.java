package TestPakage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLibraryPackage.BaseLibrary;
import PagePakage.CheckBoxPage;



public class CheckBoxPageTest extends BaseLibrary
{
	CheckBoxPage ob2;
	@BeforeTest
	@Parameters("browser")
	public void lunchurl(String browser)
	{
		lunchURL(browser);
		ob2=new CheckBoxPage();
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
	public void click_on_element() throws InterruptedException
	{
		ob2.ClickOnElement();
	}
	@Test(priority=4)
	public void click_on_check_box()
	{
		ob2.ClickOnCheckBox();
	}
	@Test(priority=5)
	public void Validate_Check_box()
	{
		ob2.CheckBoxValidation();
	}

}
