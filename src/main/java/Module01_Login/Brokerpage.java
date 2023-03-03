package Module01_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Brokerpage 
{
	//1. Data members/Global Variables should be declared globally with access level private by using @findby Annotation
	
@FindBy(xpath="//h4[text()='saradeg41@gmail.com']")	private WebElement signedinas ;

@FindBy(xpath="//input[@value='Log out']")  private WebElement logout;


	
//2. Initialize within a constructor with access level public using pagefactory
	
	public Brokerpage(WebDriver driver)
	{
  
		PageFactory.initElements(driver, this);
	}

	
//3. Utilize within a method with access level public
	
	public String GetEmail()
	{
	
      
		String Actualmail = signedinas.getText();
		
		return Actualmail;
	}
	
	public void logout()
	{
	logout.click();	
		
	}



	
	
	
	
	

}
