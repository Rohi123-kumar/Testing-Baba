package PagePakage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import BaseLibraryPackage.BaseLibrary;

public class CheckBoxPage extends BaseLibrary
{
	public CheckBoxPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath="//button[@class=\'btn btn-block p-0 text-left\']")
	private WebElement clickelement;
	@FindBy(xpath="//a[text()='check box']")
	private WebElement clickoncheckbox;
	@FindBy(xpath="//iframe[@src=\"Checkbox.html\"]")
	private WebElement enterinframe;
	@FindBy(xpath="//label[@for=\"myCheck\"]")
	private WebElement clickonmobilebox;
	@FindBy(xpath="//label[@for=\"mylaptop\"]")
	private WebElement clickonlaptop;
	@FindBy(xpath="//input[@id=\"mydesktop\"]")
	private WebElement clickondesktop;
	@FindBy(xpath="//h6[@id=\"text\"]")
	private WebElement mobiletext;
	@FindBy(xpath="//h6[@id=\"text1\"]")
	private WebElement laptoptext;
	@FindBy(xpath="//h6[@id=\"text2\"]")
	private WebElement desktoptext;
	
	public void ClickOnClose() throws InterruptedException
	{
		Thread.sleep(5000);
		close.click();
	}
	public void ClickOnPractice()
	{
		practice.click();
	}
	public void ClickOnElement() throws InterruptedException
	{
		Thread.sleep(5000);
		clickelement.click();
	}
	public void ClickOnCheckBox()
	{
		clickoncheckbox.click();
	}
	public void CheckBoxValidation()
	{
		SoftAssert asse = new SoftAssert();
		driver.switchTo().frame(enterinframe);
		clickonmobilebox.click();
		String actual=mobiletext.getText();
		String expected=getReadData("mobile");
		asse.assertEquals(actual, expected);
		System.out.println("Mobile ValidationDone");
	     
	     
		clickonlaptop.click();
		String actual1=laptoptext.getText();
		String expected1=getReadData("laptop");
		asse.assertEquals(actual1, expected1);
		System.out.println("Laptop ValidationDone");
	    
		
		clickondesktop.click();
		String actual2=desktoptext.getText();
		String expected2=getReadData("desktop");
		asse.assertEquals(actual2, expected2);
		System.out.println("Desktop ValidationDone");
	     asse.assertAll() ;
		
		driver.switchTo().defaultContent();
		
	}


}
