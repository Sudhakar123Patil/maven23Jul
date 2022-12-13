package mavenPomClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mavenUtility.UtilityNew;



public class PasswordPage 
{
	@FindBy(id="txt_accesspin") private WebElement passwordField;	
	
	@FindBy(xpath="//a[text()='Submit']") private WebElement submitButton;
	
	public PasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPassword(WebDriver driver,String password)
	{
		UtilityNew.wait(driver, 2000);
		passwordField.sendKeys(password);
		
	}
	public void clickOnSubmitButton(WebDriver driver)
	{
		submitButton.click();
		
	}

}
