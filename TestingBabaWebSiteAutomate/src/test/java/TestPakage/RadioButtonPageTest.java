package TestPakage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLibraryPackage.BaseLibrary;
import PagePakage.RadioButtonPage;

public class RadioButtonPageTest extends BaseLibrary
{
	RadioButtonPage ob2;
	@BeforeTest
	@Parameters("browser")
	public void lunchurl(String browser)
	{
		lunchURL(browser);
		ob2=new RadioButtonPage();
	}
	@Test (priority=1)
	public void click_on_close()
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
	public void click_on_radio_button()
	{
		ob2.ClickOnRadioButton();
	}
	@Test(priority=5)
	public void click_on_yes()
	{
		ob2.ClickOnYes();
	}

}
