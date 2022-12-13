package mavenBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import mavenUtility.UtilityNew;



public class BaseNew 
{
	protected static WebDriver driver;
	public void launchNeostox() throws IOException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Jul23B\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(UtilityNew.readDataFromProtyFile("url"));
	Reporter.log("launching url on chrome browser", true);
	UtilityNew.wait(driver, 2000);
	}
	
	public void closeBrowser()
	{
		UtilityNew.wait(driver, 2000);
		Reporter.log("closing browser", true);
		driver.close();
		
	}

}
