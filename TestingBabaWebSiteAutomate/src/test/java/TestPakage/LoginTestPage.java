package TestPakage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLibraryPackage.BaseLibrary;
import PagePakage.LoginPage;



public class LoginTestPage extends BaseLibrary
{
	LoginPage ob;
	@BeforeTest
	@Parameters("browser")
	public void LunchUrl(String browser)
	{
		lunchURL(browser);
		ob=new LoginPage();
	}
	
	@Test (enabled = true)
	public void clickonclose()
	{
		ob.ClickOnClose();
	}
	@Test (enabled = true)
	public void clickonpractice()
	{
		ob.ClickOnPractice();
	}
	@Test (enabled = true)
	public void Title()
	{
		ob.getTittle();
	}
	@Test (enabled = true)
	public void URL()
	{
		ob.getURL();
	}

}
