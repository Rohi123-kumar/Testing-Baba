package PagePakage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import BaseLibraryPackage.BaseLibrary;

public class FramePage extends BaseLibrary
{
	public FramePage() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target=\"#alerts\"]")
	private WebElement clickonalertframewindows;
	
	@FindBy(xpath="//a[text()='frames']")
	private WebElement clickonframe;
	
	@FindBy(xpath="(//iframe[@src=\"Framelink.html\"])[1]")
	private WebElement bigframe;
	
	@FindBy(xpath="(//iframe[@src=\"Framelink.html\"])[2]")
	private WebElement smallframe;
	
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
	public void ClickOnframe() throws InterruptedException
	{
		Thread.sleep(3000);
		clickonframe.click();
	}
	public void MoveSmallToBigFrame()
	{
		SoftAssert as=new SoftAssert();
		driver.switchTo().frame(bigframe);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(smallframe);
		driver.switchTo().defaultContent();
		System.out.println("This is a sample page of big frame");
		System.out.println("This is a sample page of small frame");
		as.assertAll();
	}

}
