package Module01_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage
{
	//1. Data members/Global Variables should be declared globally with access level private by using @findby Annotation
	 @FindBy(xpath="//input[@id='email'] ")	private WebElement Email;
		
	 @FindBy(xpath="//input[@id='password']")	private WebElement password;
		
	 @FindBy(xpath="//input[@type='submit'] ")	private WebElement login;
		
	 	
	 //2. Initialize within a constructor with access level public using pagefactory
	 	
	 	public Loginpage(WebDriver driver)
	 	{
		  PageFactory.initElements(driver, this);
	 	}
		
	 	
		//3. Utilize within a method with access level public
	 	
	 	
	 	public void enteremail(String Em)
	 	{
	 		Email.sendKeys(Em);
	 		
	 	}

	 	public void enterepassword(String pagar)
	 	{
	 		password.sendKeys(pagar);
	 		
	 	}

	 	public void clicklogin()
	 	{
	 		login.click();
	 		
	 	}


	
   
	
}
