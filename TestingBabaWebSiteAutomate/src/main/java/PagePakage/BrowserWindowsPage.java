package PagePakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibraryPackage.BaseLibrary;

public class BrowserWindowsPage extends BaseLibrary
{
	public BrowserWindowsPage()
	{
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath="//button[@data-target=\"#alerts\"]")
	private WebElement clickonalertframewindows;
	@FindBy(xpath="//a[@href=\"#tab_11\"]")
	private WebElement clickonbrowserwindows;
	@FindBy(xpath="//a[@href=\"https://www.google.co.in/\"]")
	private WebElement clickonnewtab;
	@FindBy(xpath="(//a[@class=\"btn btn-primary\"])[2]")
	private WebElement clickonnewwindows;
	@FindBy(xpath="(//a[@class=\"btn btn-primary\"])[3]")
	private WebElement clickonnewwindowsmessage;
	public void ClickOnClose()
	{
		close.click();
	}
	public void ClickOnPractice()
	{
		practice.click();
	}
	public void ClickOnAlertFrameWindows()
	{
		waitforClick(clickonalertframewindows);
	}
	public void ClickOnBrowserWindows()
	{
		clickonbrowserwindows.click();
	}
	public void ClickOnNewTab() throws InterruptedException
	{
		clickonnewtab.click();
		switchtowindows(1);
		driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("cid khoofnak raat on you tube");
		Thread.sleep(20000);
		switchtowindows(0);
	}
	public void ClickOnNewWindows()
	{
		
		clickonnewwindows.click();
		switchtowindows(1);
		driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("youtube.com");
		switchtowindows(0);
	}
	public void ClickOnNewWindowsMessage() throws InterruptedException
	{
		clickonnewwindowsmessage.click();
		switchtowindows(1);
		Thread.sleep(10000);
		switchtowindows(0);
	}

}
