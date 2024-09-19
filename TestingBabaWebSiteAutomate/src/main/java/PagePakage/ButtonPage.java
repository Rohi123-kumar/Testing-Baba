package PagePakage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import BaseLibraryPackage.BaseLibrary;

public class ButtonPage extends BaseLibrary
{
	public ButtonPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath="//button[@class=\'btn btn-block p-0 text-left\']")
	private WebElement clickelement;
	@FindBy(xpath="//a[text()='buttons']")
	private WebElement clickbutton;
	@FindBy(xpath="//button[@ondblclick=\"doubletext()\"]")
	private WebElement doubleclick;
	@FindBy(xpath="//button[@oncontextmenu=\"righttext()\"]")
	private WebElement rightClick;
	@FindBy (xpath="//button[@onclick=\"clicktext()\"]")
	private WebElement clickme;
	@FindBy(xpath="//p[text()='you have done a double click']")
	private WebElement doubleclicktext;
	@FindBy(xpath="//p[text()='you have done a right click']")
	private WebElement rightclicktext;
	@FindBy(xpath="//p[text()='you have done a dynamic click']")
	private WebElement clickmektext;
	
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
	public void ClickOnButton() throws InterruptedException
	{
		Thread.sleep(3000);
		clickbutton.click();
	}
//	public void Clicks()
//	{
//		Actions action=new Actions(driver);
//		action.doubleClick(doubleclick).perform();
//		action.contextClick(rightClick).perform();
//		action.click(clickme).perform();
//		
//	}
	public void ValidateClickData()
	{
		SoftAssert asse=new SoftAssert();
		Actions action=new Actions(driver);
		
		//action.doubleClick(doubleclick).perform();
		Doubleclick(doubleclick);
		String actual=doubleclicktext.getText();
		String expected=getReadData("doubleclick");
		asse.assertEquals(actual, expected);
		System.out.println("Validation of Double Click");
		
		//action.contextClick(rightClick).perform();
		Rightclick(rightClick);
		String actual1=rightclicktext.getText();
		String expected1=getReadData("rightclick");
		asse.assertEquals(actual1, expected1);
		System.out.println("Validation of Right Click");
		
		//action.click(clickme).perform();
		Clickonme(clickme);
		String actual2=clickmektext.getText();
		String expected2=getReadData("clickme");
		asse.assertEquals(actual2, expected2);
		System.out.println("Validation of ClickMe");
		
		asse.assertAll();
		
	}

}
