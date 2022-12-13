package nopCommerceBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import nopCommerceUtility.UtilityNew;

public class NopcommerceBase 
{  
	 protected static WebDriver driver;
 
	public void launchNopcommerce() throws IOException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Jul23B\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(UtilityNew.readDataFromProtyFile("url"));
	
	}
	
	public void closeBrowser()
	{
		UtilityNew.wait(driver, 2000);
		driver.close();
	}
	

}
