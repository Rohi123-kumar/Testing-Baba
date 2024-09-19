package BaseLibraryPackage;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import ApplicationUtilityPackage.applicationUtility;
import ExcelPakage.ExcelUtility;
import PropertyPackage.PropertyUtility;
import ScreenShotPackage.Screenshot;

public class BaseLibrary implements ExcelUtility,PropertyUtility,applicationUtility , Screenshot
{
	
	public static WebDriver driver=null;
	String path=null;
	public void lunchURL(String browser)
	{
		if (browser.equals("chrome")) 
		{
			String path="../TestingBabaWebSiteAutomate/CromeDriver/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			driver=new ChromeDriver();
		}
		else if (browser.equals("firefox")) 
		{
			String path="../TestingBabaWebSiteAutomate/CromeDriver/geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", path);
			driver = new FirefoxDriver();
		}
		else if (browser.equals("opera")) 
		{
			String path="../TestingBabaWebSiteAutomate/CromeDriver/operadriver.exe";
			System.setProperty("webdriver.opera.driver", path);
			driver = new OperaDriver();
		}
		else if (browser.equals("edge")) 
		{
			String path="../TestingBabaWebSiteAutomate/CromeDriver/msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", path);
			driver = new EdgeDriver();
		}
		driver.get("https://www.testingbaba.com/old/");
		driver.manage().window().maximize();
	}
	@Override
	public String getReadData(int sheetno, int rowno, int colno) {
		String path="C:\\Users\\rohit\\eclipse-workspace\\TestingBabaWebSiteAutomate\\ExcelData\\Full_Data.xlsx";
		String val="";
		try 
		{
			FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheetAt(sheetno);
			val=sheet.getRow(rowno).getCell(colno).getStringCellValue();
		} 
		catch (Exception e) 
		{
			System.out.println("Issue in Get read data from Excel " +e);
		}
		return val;
	}
	@Override
	public String getReadData(String key) {
		String path="C:\\Users\\rohit\\eclipse-workspace\\TestingBabaWebSiteAutomate\\ExcelData\\config.properties";
		String val="";
		try 
		{
			FileInputStream fis=new FileInputStream(path);
			Properties pro=new Properties();
			pro.load(fis);
			val=pro.getProperty(key);
		} 
		catch (Exception e) 
		{
			System.out.println("Issue in Get read data from Excel " +e);
		}
		return val;
	}
	@Override
	public void Doubleclick(WebElement ele) {
		Actions action=new Actions(driver);
		action.doubleClick(ele).perform();
		
	}
	@Override
	public void Rightclick(WebElement ele) {
		Actions action=new Actions(driver);
		action.contextClick(ele).perform();
		
	}
	@Override
	public void Clickonme(WebElement ele) {
		Actions action=new Actions(driver);
		action.click(ele).perform();
		
	}
	@Override
	public void switchtowindows(int index) {
		Set<String> handls=driver.getWindowHandles();
		ArrayList<String> listofHandles=new ArrayList<String>(handls);
		driver.switchTo().window(listofHandles.get(index));
		
	}
	@Override
	public void waitforClick(WebElement ele) {
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		
	}
	@Override
	public void mousehover(WebElement ele) {
		Actions action=new Actions(driver);
		action.moveToElement(ele).build().perform();
		
	}
	@Override
	public void waitforVisibility(WebElement ele) {
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	@Override
	public void waitforAlert(WebElement ele) {
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		
	}
	@Override
	public void getScreenShot(String folder, String filename) {
		java.util.Date date=new java.util.Date();
		SimpleDateFormat sdf=new SimpleDateFormat(" yyyy, MM, dd, hh mm ss");
		String currentdate = sdf.format(date);
	
		String loc=System.getProperty("user.dir");
		String path=loc +"//Screenshot//"+ folder + "//" + filename + currentdate + ".png";
		try 
		{
			EventFiringWebDriver efw=new EventFiringWebDriver(driver);
			File src=efw.getScreenshotAs(OutputType.FILE);
			File des=new File(path);
			FileUtils.copyFile(src, des);	
		} 
		catch (Exception e) 
		{
			System.out.println("Issue in take screenshot" + e);
		}
		
	}
	@AfterMethod
	public void getResultAnalysis(ITestResult result)
	{
		String filename=result.getMethod().getMethodName();
		if (result.getStatus()==ITestResult.SUCCESS) 
		{
			getScreenShot("pass", filename);
		}
		else if (result.getStatus()==ITestResult.FAILURE) 
		{
			getScreenShot("fail", filename);
		}
	}
	@AfterSuite
	public void closure()
	{
		driver.close();
	}
	@Override
	public void uploadFile(String path) {
		try 
		{
			StringSelection str=new StringSelection(path);
			Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();
			clip.setContents(str, null);
			
			Robot rb=new Robot();
			rb.delay(500);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			rb.delay(500);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.delay(500);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			
		} 
		catch (Exception e) 
		{
			System.out.println("Issue in pressing key " + e);
		}
		
	}
	

}
