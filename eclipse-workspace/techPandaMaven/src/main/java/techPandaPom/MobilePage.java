package techPandaPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import techPandaUtility.Utility;

public class MobilePage 
{
	@FindBy(xpath="//h1[text()='Mobile']") private WebElement testOnMobPg;
	@FindBy(xpath="(//select[@title='Sort By'])[1]") private WebElement options;
	public MobilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getMobText(WebDriver driver)
	{
		Utility.wait(driver, 4);
		return testOnMobPg.getText();
		
		
	}
	public void selectOptions()
	{
		Select se=new Select(options);
		se.selectByVisibleText("Name");
		
	}
	

}
