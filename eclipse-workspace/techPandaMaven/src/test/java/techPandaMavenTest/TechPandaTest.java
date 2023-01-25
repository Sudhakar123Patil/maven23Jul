package techPandaMavenTest;

import org.testng.annotations.Test;

import techPandaMavenBase.Base;
import techPandaPom.HomePage;
import techPandaPom.MobilePage;
import techPandaUtility.Utility;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TechPandaTest extends Base 
{
	HomePage home;
	MobilePage mPage;
	
  @Test
  public void sortedByFunctionality() throws InterruptedException, IOException 
  {
	  
	 Assert.assertEquals(home.gettingText(driver), Utility.readDataFromProperyFile("homeText"));
	 home.clickOnMobButton(driver);
	 Assert.assertEquals(mPage.getMobText(driver), Utility.readDataFromProperyFile("mobText"));
	 mPage.selectOptions();
	 Utility.wait(driver, 1);
	 Utility.takesScreenshot(driver, mPage.getMobText(driver));
	  
  }
  

  @BeforeClass
  public void launchingVctc() throws IOException 
  {
	  launchBrowser();
	  home=new HomePage(driver);
	  mPage=new MobilePage(driver);

	  
	  
  }

  @AfterClass
  public void closingBrowser() 
  {
	  closeBrowser();
	  
  }

}
