package PagePakage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import BaseLibraryPackage.BaseLibrary;

public class TextBoxPage extends BaseLibrary
{
	public TextBoxPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath="//button[@class=\'btn btn-block p-0 text-left\']")
	private WebElement clickelement;
	@FindBy(xpath="//a[text()='text box']")
	private WebElement textbox;
	@FindBy(xpath="//input[@id=\"fullname1\"]")
	private WebElement fullname;
	@FindBy(xpath="//input[@id=\"fullemail1\"]")
	private WebElement email;
	@FindBy(xpath="//textarea[@id=\"fulladdresh1\"]")
	private WebElement currentaddress;
	@FindBy(xpath="//textarea[@id=\"paddresh1\"]")
	private WebElement parmanettaddress;
	@FindBy(xpath="//input[@type=\"button\"]")
	private WebElement submitbuttom;
	@FindBy(xpath="//div[@class=\"col-md-6 mt-5\"]/label")
	private List<WebElement> list;
	
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
	public void ClickOnTextBox()
	{
		textbox.click();
	}
	public void fulldetail()
	{
		fullname.sendKeys(getReadData(0, 1, 0));
		email.sendKeys(getReadData(0, 1, 1));
		currentaddress.sendKeys(getReadData(0, 1, 2));
		parmanettaddress.sendKeys(getReadData(0, 1, 3));
		submitbuttom.click();
	}
	/* if get details form come and have to look in console
	 * use this method
	 * public void getdetails()
	{
		for(int i=0;i<copydetail.size();i++)
		{
			String out = copydetail.get(i).getText();
			System.out.println(out);
		}
	}
	*/
    public void getvadilate()
     {
        SoftAssert asse = new SoftAssert();
		ArrayList<String> expected = new ArrayList<>();
		ArrayList<String> actual = new ArrayList<>();
		for(int i=0;i<=3;i++)
		{
			expected.add(getReadData(0, 1, i));
		}
		for(int i=1;i<list.size();i=i+2)
		{
			actual.add(list.get(i).getText());
		}
		for(int i=0;i<=3;i++)
		{
		    //for assert (hard assert-Validation)
			//Assert.assertEquals(actual.get(i), expected.get(i));
		    //verify assert (soft assert-validation)
		      asse.assertEquals(actual.get(i), expected.get(i));
		}
		     System.out.println("ValidationDone");
		     asse.assertAll() ;
		}
	

}
