package PagePakage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibraryPackage.BaseLibrary;

public class ToolTipsPage extends BaseLibrary
{
	public ToolTipsPage() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target=\"#widget\"]")
	private WebElement clickonwidget;
	
	@FindBy(xpath="//a[text()='tool tips']")
	private WebElement clickontooltips;
	
	@FindBy(xpath="//button[@data-toggle=\"tooltip\"]")
	private WebElement hovermetext;
	
	public void ClickOnClose() throws InterruptedException
	{
		Thread.sleep(2000);
		close.click();
	}
	public void ClickOnPractice()
	{
		practice.click();
	}
	public void ClickOnWidget()
	{
		clickonwidget.click();
	}
	public void ClickOnToolTips() throws InterruptedException
	{
		Thread.sleep(2000);
		clickontooltips.click();
	}
	public void getattributeshoverText()
	{
		mousehover(hovermetext);
		String Title=hovermetext.getAttribute("title");
		System.out.println(Title);
	}

}
