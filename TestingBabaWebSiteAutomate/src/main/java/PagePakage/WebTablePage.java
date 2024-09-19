package PagePakage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibraryPackage.BaseLibrary;

public class WebTablePage extends BaseLibrary
{
	public WebTablePage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath="//button[@class=\'btn btn-block p-0 text-left\']")
	private WebElement clickelement;
	@FindBy(xpath="//a[@href=\"#tab_4\"]")
	private WebElement clickonwebtable;
	
	@FindBy(xpath="//iframe[@src=\"Webtable.html\"]")
	private WebElement frame;
	
	@FindBy(xpath="//input[@pattern=\"^[a-zA-Z][\\sa-zA-Z]{2,32}\"]")
	private WebElement entername;
	@FindBy(xpath="//input[@pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$\"]")
	private WebElement entermail;
	@FindBy(xpath="//button[@class=\"btn btn-success save-btn\"]")
	private WebElement clickonsave;
	
	@FindBy(xpath="//button[text()='Edit']")
	private List<WebElement> clickonedit;
	@FindBy(xpath="//input[@name=\"edit_name\"]")
	private WebElement clickoneditname;
	@FindBy(xpath="//input[@name=\"edit_email\"]")
	private WebElement clickoneditmail;
	@FindBy(xpath="//button[text()='Update']")
	private WebElement clickonupdate;
	
	public void ClickOnClose() throws InterruptedException
	{
		Thread.sleep(5000);
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
	public void ClickOnWebTable() throws InterruptedException
	{
		Thread.sleep(5000);
		clickonwebtable.click();
	}
	public void fulldetails()
	{
		driver.switchTo().frame(frame);
		for(int i=1;i<=3;i++)
		{
			entername.sendKeys(getReadData(1,i,0));
			entermail.sendKeys(getReadData(1,i,1));
			clickonsave.click();
		}
		
		driver.switchTo().defaultContent();
	}
	public void editdetails()
	{
		int i=1;
		driver.switchTo().frame(frame);
		for(WebElement edit:clickonedit)
		{
			edit.click();
			clickoneditname.clear();
			clickoneditname.sendKeys(getReadData(1, i, 2));
			clickoneditmail.clear();
			clickoneditmail.sendKeys(getReadData(1, i, 3));
			clickonupdate.click();
			i++;
		}
		driver.switchTo().defaultContent();
		
	}

}
