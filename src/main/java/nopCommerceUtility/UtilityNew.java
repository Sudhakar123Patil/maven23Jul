package nopCommerceUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class UtilityNew 
{
	public static String readDataFromProtyFile(String key) throws IOException
	{
		//create object of properties class
		Properties prop=new Properties();
		//create object of FileInputStream class
		FileInputStream myFile=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\maven23Jul\\nopCommerce.properties");
		prop.load(myFile);
		String value = prop.getProperty(key);
		return value;
	}
	public static void takeScreenshot(WebDriver driver,String element) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\screen\\scshot"+element+".jpg");
		FileHandler.copy(src, dest);
	}
	
	public static void scrollIntoView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	public static void wait(WebDriver driver,int waitTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
	}
	public static String readDataFromExel(int Row,int Cell) throws EncryptedDocumentException, IOException
	{
		File f=new File("D:\\Jul23B\\Sheet1.xlsx");
		Sheet mySheet = WorkbookFactory.create(f).getSheet("Sheet4");
		String value = mySheet.getRow(Row).getCell(Cell).getStringCellValue();
		return value;
		
	}


}
