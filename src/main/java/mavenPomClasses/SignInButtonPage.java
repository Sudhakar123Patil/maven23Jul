package mavenPomClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import mavenUtility.UtilityNew;



public class SignInButtonPage 
{
	@FindBy(xpath="(//a[text()='Sign In'])[1]") private WebElement signinButton;
	
	public SignInButtonPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnSigninButton(WebDriver driver)
    {
		signinButton.click();
		UtilityNew.wait(driver, 4000);
		Reporter.log("clicking on signin button", true);
	}

}
