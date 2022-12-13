package nopCommercePom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import nopCommerceUtility.UtilityNew;

public class RegistrationPage 
{
	@FindBy(id="gender-male") private WebElement gender;
	@FindBy(id="FirstName") private WebElement fNameField;
	@FindBy(id="LastName") private WebElement lNameField;
	@FindBy(id="Email") private WebElement emailField;
	@FindBy(id="Password") private WebElement passField;
	@FindBy(id="ConfirmPassword") private WebElement cPassField;
	@FindBy(xpath="//a[text()='Register']") private WebElement registerBt;
	@FindBy(xpath="//a[text()='Continue']") private WebElement continueBt;
	
	public RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterFName(WebDriver driver,String fName) throws IOException
	{
		gender.click();
		fNameField.sendKeys(UtilityNew.readDataFromProtyFile(fName));
	}
	public void enterLName(WebDriver driver,String lName) throws IOException
	{
		lNameField.sendKeys(UtilityNew.readDataFromProtyFile(lName));
	}
	public void enterEmail(WebDriver driver,String email) throws IOException
	{
		UtilityNew.scrollIntoView(driver, emailField);
		emailField.sendKeys(UtilityNew.readDataFromProtyFile(email));
		
	}
	public void createPassword(WebDriver driver,String password) throws IOException
	{
		passField.sendKeys(UtilityNew.readDataFromProtyFile(password));
	}
	public void conformPassword(WebDriver driver,String cPassword) throws IOException
	{
		cPassField.sendKeys(UtilityNew.readDataFromProtyFile(cPassword));
	}
	public void clickOnRegisterButton(WebDriver driver)
	{
		registerBt.click();
		Reporter.log("registration is completed", true);
		UtilityNew.wait(driver, 2000);
	}
	public void clickOnContinueBt(WebDriver driver)
	{
		continueBt.click();
		UtilityNew.wait(driver, 2000);
	}

}
