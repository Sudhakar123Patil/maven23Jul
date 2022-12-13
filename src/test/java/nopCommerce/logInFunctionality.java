package nopCommerce;

import org.testng.annotations.Test;

import nopCommerceBase.NopcommerceBase;
import nopCommercePom.LogInPage;
import nopCommercePom.NopcommerceHomePg;
import nopCommercePom.RegisterAndLogInButtonPage;
import nopCommercePom.RegistrationPage;
import nopCommerceUtility.UtilityNew;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class logInFunctionality extends NopcommerceBase 
{
	RegisterAndLogInButtonPage rlbp;
	RegistrationPage rgPage;
	NopcommerceHomePg home;
	LogInPage login;
  @Test
  public void verifying() 
  {
	  home.selectOption(driver);
	  Reporter.log("verifying list box", true);
  }
  @BeforeMethod
  public void login() throws IOException, InterruptedException 
  {
	  rlbp.clickOnRegisterButton(driver);
	  rgPage.enterFName(driver, "firstName");
	  rgPage.enterLName(driver, "lastName");
	  rgPage.enterEmail(driver, "email");
	  rgPage.createPassword(driver, "password");
	  rgPage.conformPassword(driver, "cPassword");
	  rgPage.clickOnRegisterButton(driver);
	  Thread.sleep(3000);
//	  rgPage.clickOnContinueBt(driver);
	  rlbp.clickOnLogInButton(driver);
	  login.enterEmail(driver, UtilityNew.readDataFromProtyFile("email"));
	  login.enterPassword(driver, UtilityNew.readDataFromProtyFile("password"));
	  login.clickOnLogInBt(driver);
	  
  }
  @AfterMethod
  public void logout()
  {
	  home.logOutFromApplication(driver);
  }

 

  @BeforeClass
  public void launchUrl() throws IOException 
  {
	  launchNopcommerce();
	  rlbp=new RegisterAndLogInButtonPage(driver);
	  rgPage=new RegistrationPage(driver);
	  home=new NopcommerceHomePg(driver);
	  login=new LogInPage(driver);
  }

  @AfterClass
  public void closingBrowser() 
  {
	  closeBrowser();
  }

}
