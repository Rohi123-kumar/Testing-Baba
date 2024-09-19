package TestPakage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import BaseLibraryPackage.BaseLibrary;
import PagePakage.TextBoxPage;



public class TextBoxPageTest  extends BaseLibrary
{
	TextBoxPage ob1;
	@BeforeTest
	@Parameters
	public void lunchurl(String browser)
	{
		lunchURL(browser);
		ob1=new TextBoxPage();
	}
	@Test (priority=1)
	public void click_on_close()
	{
		ob1.ClickOnClose();
	}
	@Test (priority=2)
	public void click_on_practice()
	{
		ob1.ClickOnPractice();
	}
	@Test (priority=3)
	public void click_on_element()
	{
		ob1.ClickOnElement();
	}
	@Test (priority=4)
	public void click_on_text_box()
	{
		ob1.ClickOnTextBox();
	}
	@Test (priority=5)
	public void details()
	{
		ob1.fulldetail();
	}
	@Test(priority = 6)
	public void Copy_Details_Of_List()
	{
		ob1.getvadilate();
	}

}
