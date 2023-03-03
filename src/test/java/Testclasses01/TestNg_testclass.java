package Testclasses01;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_files.Baseclass;
import Library_files.UtilityClass;
import Module01_Login.Brokerpage;
import Module01_Login.Loginpage;

public class TestNg_testclass extends Baseclass
{
	
	// public WebDrivar driver;
	// Launchbrowser();
	
	Loginpage login;
	Brokerpage broker;
	
	int TestcaseID;
	
	@BeforeClass
	public void openbrowser()
	{
		Launchbrowser();
		
	     login = new Loginpage(driver);
		
		 broker = new Brokerpage(driver);
		
		
	}
	
	
	@BeforeMethod
	public void logintoapp() throws IOException
	{
		login.enteremail(UtilityClass.getdatafromPF("EM") );
		
		login.enterepassword(UtilityClass.getdatafromPF("PSW"));
		
		login.clicklogin();
	}
	
	
	@Test
	public void VerifyEmail() throws IOException
	{
		TestcaseID=200;
		
		 Assert.fail();
		
		String Actualmail = broker.GetEmail();
		
		String Expectedmail = UtilityClass.getdatafromExcel(0, 0);
		
		Assert.assertEquals(Actualmail , Expectedmail );
		
	}
	
	@Test
	public void verifyAddress() throws IOException
	{
		TestcaseID=201;
		
		String ActualTitle = driver.getTitle();
		
		String Expectedtitle = UtilityClass.getdatafromExcel(5, 0);
		
	}
	
	
	
	
	@AfterMethod
	public void logouttoapp(ITestResult Result) throws IOException, InterruptedException
	{
		
		if(Result.getStatus()== ITestResult.FAILURE)
		{
			UtilityClass.takescreenshot(driver , TestcaseID);
			
			
		}
		
		Thread.sleep(5000);
		
		
		broker.logout();
	}
	
	
	@AfterClass
	public void closebrowser()
	{
	driver.close();
		
	}
	
	
	
	

}
