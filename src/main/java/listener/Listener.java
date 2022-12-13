package listener;



import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import mavenBase.BaseNew;

public class Listener extends BaseNew implements ITestListener 
    
    {
	
	public void onTestSuccess(ITestResult result) 
	{
	Reporter.log("TC "+result.getName()+" is completed successfuly",true);
	}
	
	public void onTestFailure(ITestResult result) 
	{
	Reporter.log("TC "+result.getName()+" is failed",true);
	}
	
	public void onTestSkipped(ITestResult result) 
	{
	Reporter.log("TC "+result.getName()+" is skipped please check",true);
	}
}
