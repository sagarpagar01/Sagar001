package Library_files;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass
{
	public WebDriver driver;
	
	public  void Launchbrowser()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar pagar\\eclipse-workspace\\1_Oct_Maven\\Browser\\chromedriver.exe");
	
	
	 driver = new ChromeDriver();
	
	//To Enter URL
	driver.get("https://demo.guru99.com/insurance/v1/index.php");
		
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

	
	}

}
