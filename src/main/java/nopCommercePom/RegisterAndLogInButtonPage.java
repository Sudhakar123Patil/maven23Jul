package nopCommercePom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import nopCommerceUtility.UtilityNew;

public class RegisterAndLogInButtonPage
{
	@FindBy(xpath="//a[text()='Register']") private WebElement registerButton;
	@FindBy(xpath="//a[text()='Log in']") private WebElement logInButton;
	

	public RegisterAndLogInButtonPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnRegisterButton(WebDriver driver)
	{
		registerButton.click();
		UtilityNew.wait(driver, 2000);
		Reporter.log("clicked on register button", true);
	}
	
	public void clickOnLogInButton(WebDriver driver)
	{
		logInButton.click();
		UtilityNew.wait(driver, 2000);
		Reporter.log("clicked on log in button", true);
	}
}
