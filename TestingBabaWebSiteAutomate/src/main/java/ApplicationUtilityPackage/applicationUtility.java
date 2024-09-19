package ApplicationUtilityPackage;

import org.openqa.selenium.WebElement;

public interface applicationUtility 
{
	public void Doubleclick(WebElement ele);
	public void Rightclick(WebElement ele);
	public void Clickonme(WebElement ele);
	public void switchtowindows(int index);
	public void waitforClick(WebElement ele);
	public void waitforVisibility(WebElement ele);
	public void waitforAlert(WebElement ele);
	public void mousehover(WebElement ele);
	public void uploadFile(String path);

}
