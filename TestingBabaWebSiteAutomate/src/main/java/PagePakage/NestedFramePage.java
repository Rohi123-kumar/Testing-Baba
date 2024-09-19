package PagePakage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import BaseLibraryPackage.BaseLibrary;

public class NestedFramePage extends BaseLibrary
{
	public NestedFramePage() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target=\"#alerts\"]")
	private WebElement clickonalertframewindows;
	
	@FindBy(xpath="//a[@href='#tab_14']")
	private WebElement nestedframe;
	
	@FindBy(xpath="//iframe[@src=\"target1.html\"]")
	private WebElement grandparentframe;
	
	@FindBy(xpath="(//iframe[@src=\"text.html\"])[1]")
	private WebElement parentframe;
	
	@FindBy(xpath="//iframe[@src=\"example.html\"]")
	private WebElement childframe;
	
	@FindBy(xpath="//a[text()='Click Here']")
	private WebElement clickonclickhere;
	
	public void ClickOnClose() throws InterruptedException
	{
		Thread.sleep(2000);
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
	public void ClickNestedFrame() throws InterruptedException
	{
		Thread.sleep(2000);
		nestedframe.click();
	}
	
	public void EnterInParentChildFrame()
	{
		SoftAssert ase=new SoftAssert();
		driver.switchTo().frame(grandparentframe);
		driver.switchTo().frame(parentframe);
		driver.switchTo().frame(childframe);
		clickonclickhere.click();
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		System.out.println("rohit");
		ase.assertAll();	
	}
	

}
