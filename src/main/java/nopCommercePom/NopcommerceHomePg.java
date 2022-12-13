package nopCommercePom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import nopCommerceUtility.UtilityNew;

public class NopcommerceHomePg 
{
	@FindBy(xpath="(//a[text()='Digital downloads '])[1]") private WebElement digiDownBt;
	@FindBy(id="products-orderby") private WebElement dropDownField;
	@FindBy(xpath="//a[text()='Log out']") private WebElement logOutBt;
	public NopcommerceHomePg(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void selectOption(WebDriver driver)
	{
		UtilityNew.wait(driver, 2000);
		Select sl=new Select(dropDownField);
		sl.selectByVisibleText("Price: Low to High");
	}
	public void logOutFromApplication(WebDriver driver)
	{
		UtilityNew.wait(driver, 2000);
		logOutBt.click();
	}

}
