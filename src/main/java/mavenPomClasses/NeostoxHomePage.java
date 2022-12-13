package mavenPomClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import mavenUtility.UtilityNew;



public class NeostoxHomePage 
{
	@FindBy(xpath="(//a[text()='OK'])[2]") private WebElement okButton;
	@FindBy(xpath="(//a[text()='Close'])[5]") private WebElement closeButton;
	@FindBy(id="lbl_username") private WebElement userName;
	@FindBy(id="lbl_curbalancetop") private WebElement balance;
	@FindBy(xpath="//span[text()='Logout']") private WebElement logoutButton;
	
	public NeostoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void popupHandling(WebDriver driver)
	{
		if(okButton.isDisplayed())
		{
		UtilityNew.wait(driver, 1000);
		okButton.click();
		UtilityNew.scrollIntoView(driver, closeButton);
		UtilityNew.wait(driver, 1000);
		closeButton.click();
		Reporter.log("handling poup",true);
		}
		else
		{
			UtilityNew.wait(driver, 1000);
			Reporter.log("there is no poup to handle",true);
		}
	}
	
	public String getUserName(WebDriver driver)
	{
		UtilityNew.wait(driver, 1000);
		String actualUn = userName.getText();
		return actualUn;
	}
	public String checkBlance(WebDriver driver)
	{
		UtilityNew.wait(driver, 1000);
		String actualBalance = balance.getText();
		Reporter.log("actual balance is "+actualBalance,true);
		return actualBalance;
	}
	public void logoutFromNeostox(WebDriver driver) throws InterruptedException
	{
		UtilityNew.wait(driver, 1000);
//		Thread.sleep(2000);
		userName.click();
		UtilityNew.wait(driver, 1000);
//		Thread.sleep(2000);
		logoutButton.click();
		Reporter.log("Loggoing out from neoStox",true);
	}

}
