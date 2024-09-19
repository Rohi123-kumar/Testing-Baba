package PagePakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibraryPackage.BaseLibrary;

public class LinkPage extends BaseLibrary
{
	public LinkPage()
	{
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath="//button[@class=\'btn btn-block p-0 text-left\']")
	private WebElement clickelement;
	@FindBy(xpath="//a[text()='links']")
	private WebElement clicklinks;
	@FindBy(xpath="//a[text()='Demo Page']")
	private WebElement clickondemopage;
	
	public void ClickOnClose() throws InterruptedException
	{
		Thread.sleep(3000);
		close.click();
	}
	public void ClickOnPractice()
	{
		practice.click();
	}
	public void ClickOnElement()
	{
		clickelement.click();
	}
	public void ClickOnLinks() throws InterruptedException
	{
		Thread.sleep(3000);
		clicklinks.click();
	}
	public void ClickOnDemopage()throws InterruptedException
	{
		clickondemopage.click();
		switchtowindows(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='×']")).click();
		switchtowindows(0);	
	}


}
