package PagePakage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibraryPackage.BaseLibrary;

public class UploadAndDounloadPage extends BaseLibrary
{
	String path="C:\\Users\\rohit\\eclipse-workspace\\TestingBabaWebSiteAutomate\\UploadData\\Book1.xlsx";
	public UploadAndDounloadPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath="//button[@class=\'btn btn-block p-0 text-left\']")
	private WebElement clickelement;
	@FindBy(xpath="//a[text()='upload and download']")
	private WebElement clickonuploadanddownload ;
	@FindBy(xpath = "//label[text()='Select a file']")
	private WebElement clickonchoosefile;
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
	public void ClickOnUploadAndDownload()
	{
		clickonuploadanddownload.click();
	}
	public void ClickOnChooseFile()
	{
		clickonchoosefile.click();
		uploadFile(path);
	}

}
