package PagePakage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibraryPackage.BaseLibrary;

public class AlertPage extends BaseLibrary
{
	public AlertPage()
	{
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath="//button[@data-target=\"#alerts\"]")
	private WebElement clickonalertframewindows;
	@FindBy(xpath="//a[text()='alerts']")
	private WebElement clickonalert;
	@FindBy(xpath="//button[@onclick=\"myalert()\"]")
	private WebElement clickonSeeAlertClickMe;
	@FindBy(xpath="//button[@onclick=\"aftersec5()\"]")
	private WebElement clickon5SecClickMe;
	@FindBy(xpath="//button[@onclick=\"myconfirm()\"]")
	private WebElement clickonConfirmBoxClickMe;
	@FindBy(xpath="//button[@onclick=\"myprompt()\"]")
	private WebElement clickonPromteBoxClickMe;
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
	public void ClickOnAlert()
	{
		waitforClick(clickonalert);
	}
	public void ClickOnSeeAlert()
	{
		waitforClick(clickonSeeAlertClickMe);
		driver.switchTo().alert().accept();
	}
	public void ClickOn5Sec() throws InterruptedException
	{
		clickon5SecClickMe.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
	}
	public void ClickOnConfirmBox()
	{
		clickonConfirmBoxClickMe.click();
		driver.switchTo().alert().dismiss();
	}
	public void ClickOnPromteBox()
	{
		clickonPromteBoxClickMe.click();
		driver.switchTo().alert().sendKeys("Rohit");
		driver.switchTo().alert().accept();
	}

}
