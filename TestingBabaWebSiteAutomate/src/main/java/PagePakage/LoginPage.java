package PagePakage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibraryPackage.BaseLibrary;

public class LoginPage extends BaseLibrary
{
	public LoginPage()     //make constructor 
	{
	PageFactory.initElements(driver,this);
			
	}
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	public void ClickOnClose()
	{
		close.click();
	}
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	public void ClickOnPractice()
	{
		practice.click();
	}
	public void getURL()
	{
		String url=driver.getCurrentUrl();
	}
	public void getTittle()
	{
		String title=driver.getTitle();
	}


}
