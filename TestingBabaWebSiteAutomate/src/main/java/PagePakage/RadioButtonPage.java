package PagePakage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import BaseLibraryPackage.BaseLibrary;

public class RadioButtonPage extends BaseLibrary
{
	public RadioButtonPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath="//button[@class=\'btn btn-block p-0 text-left\']")
	private WebElement clickelement;
	@FindBy(xpath="//a[text()='radio buttons']")
	private WebElement clickonradiobutton;
	@FindBy (xpath="//label[@class=\"form-check-label\"]")
	private WebElement clickonyes;
	@FindBy(xpath="//p[text()='You have selected yes']")
	private WebElement yestext;
	public void ClickOnClose()
	{
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
	public void ClickOnRadioButton()
	{
		clickonradiobutton.click();
	}
	public void ClickOnYes()
	{
		SoftAssert asse=new SoftAssert();
		clickonyes.click();
		String actual=yestext.getText();
		String expected=getReadData("yes");
		asse.assertEquals(actual, expected);
		System.out.println("Yes Radio Button ValidationDone");
		asse.assertAll();
	}
	

}
