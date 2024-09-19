package PagePakage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseLibraryPackage.BaseLibrary;

public class SelectMenuPage extends BaseLibrary
{
	public SelectMenuPage() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target=\"#widget\"]")
	private WebElement clickonwidget;
	
	@FindBy(xpath="//a[text()='select menu']")
	private WebElement selectmenu;
	
	@FindBy(xpath="(//select[@class=\"form-control\"])[2]")
	private WebElement selectgroup;
	
	@FindBy(xpath="(//select[@class=\"form-control\"])[3]")
	private WebElement selectone;
	
	@FindBy(xpath="(//select)[4]")
	private WebElement oldselect;
	
	@FindBy(xpath="(//select[@multiple=\"multiple\"])[2]")
	private WebElement multiselect;
	
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
	public void ClickSelectMenu() throws InterruptedException
	{
		Thread.sleep(5000);
		selectmenu.click();
	}
	public void SelectGroup() 
	{
		Select sel=new Select(selectgroup);
		sel.selectByVisibleText("Group 2, Option 2");
		
	}
	public void SelectOne()
	{
		Select sel=new Select(selectone);
		sel.selectByVisibleText("Java");
	}
	
	public void OldSelect() 
	{
		Select sel=new Select(oldselect);
		sel.selectByVisibleText("Java");
		
	}
	
	public void MultiSelect() throws InterruptedException
	{
		Thread.sleep(5000);
		Select sel=new Select(multiselect);
		sel.selectByValue("Java Script");
	}

}
