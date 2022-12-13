package nopCommercePom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import nopCommerceUtility.UtilityNew;

public class LogInPage 
{
	@FindBy(id="Email") private WebElement emailField;
	@FindBy(id="Password") private WebElement passField;
	@FindBy(xpath="//button[text()='Log in']") private WebElement logInBt;
	
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(WebDriver driver,String email) throws IOException
	{
		emailField.sendKeys(UtilityNew.readDataFromProtyFile(email));
	}
	public void enterPassword(WebDriver driver,String pass) throws IOException
	{
		passField.sendKeys(UtilityNew.readDataFromProtyFile(pass));
	}
	public void clickOnLogInBt(WebDriver driver)
	{
		logInBt.click();
	}

}
