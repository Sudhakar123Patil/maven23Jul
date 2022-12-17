package mavenNeostoxTest;

import org.testng.annotations.Test;

import mavenBase.BaseNew;
import mavenPomClasses.NeoStoxLogin;
import mavenPomClasses.NeostoxHomePage;
import mavenPomClasses.PasswordPage;
import mavenPomClasses.SignInButtonPage;
import mavenUtility.UtilityNew;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
@Listeners(listener.Listener.class)
public class ValidateUnAndBalance extends BaseNew

  {
//	WebDriver driver;
	SignInButtonPage sign;
	NeoStoxLogin login;
	PasswordPage pass;
	NeostoxHomePage home;
	
	
	
	//test case is running
	
	
  @Test
  public void verifyUn() throws EncryptedDocumentException, IOException, InterruptedException 
  {
	  UtilityNew.wait(driver, 5000);
	  Assert.assertEquals(home.getUserName(driver), UtilityNew.readDataFromProtyFile("userName"));
	  UtilityNew.takeScreenshot(driver, home.getUserName(driver));
	  Reporter.log("verifying un", true);
  }
  @Test
  public void CheckBalance() throws InterruptedException
  {
  Thread.sleep(2000);
  home.checkBlance(driver);
  Reporter.log("verifying un", true);
  }
  @BeforeMethod
  public void loginToNeostox() throws EncryptedDocumentException, IOException, InterruptedException 
  {
	  sign.clickOnSigninButton(driver);
	  login.enterMobNum(driver, UtilityNew.readDataFromProtyFile("mobNum"));
	  login.clickOnSignInButton(driver);
	  Thread.sleep(2000);
	  pass.enterPassword(driver, UtilityNew.readDataFromProtyFile("password"));
	  pass.clickOnSubmitButton(driver);
	  Thread.sleep(2000);
	  home.popupHandling(driver);
	  
  }

  @BeforeClass
  public void launchBrowser() throws IOException 
  {
	  launchNeostox();
	  sign=new SignInButtonPage(driver);
	  login=new NeoStoxLogin(driver);
	  pass=new PasswordPage(driver);
	  home=new NeostoxHomePage(driver);
  }
  @AfterMethod
  
  public void logoutFromApp() throws InterruptedException
  {
	  home.logoutFromNeostox(driver);
  }
  @AfterClass
  
  public void CloseBrowser() 
  {
	  closeBrowser();
  }

}
