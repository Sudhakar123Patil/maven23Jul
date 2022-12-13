package mavenPomClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import mavenUtility.UtilityNew;



public class NeoStoxLogin 
{
	@FindBy(id="MainContent_signinsignup_txt_mobilenumber")  private WebElement mobileNumField;
	@FindBy(xpath ="(//a[text()='Sign In'])[2]") private WebElement signInButton;
	
	public NeoStoxLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterMobNum(WebDriver driver,String num)
	{
		mobileNumField.sendKeys(num);
		
	}
	public void clickOnSignInButton(WebDriver driver)
	{
		signInButton.click();
		UtilityNew.wait(driver, 2000);
		Reporter.log("mobile number sent to mobNumField",true);
	}

}
