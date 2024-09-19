package TestPakage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLibraryPackage.BaseLibrary;
import PagePakage.FramePage;



public class FramePageTest extends BaseLibrary
{
	FramePage ob;
	@BeforeTest
	@Parameters("browser")
	public void lunchurl(String browser)
	{
		lunchURL(browser);
		ob=new FramePage();
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
	public void Frame() throws InterruptedException
	{
		ob.ClickOnframe();
	}
	@Test (priority=5)
	public void Move_Small_To_BigFrame()
	{
		ob.MoveSmallToBigFrame();
	}
	

}
