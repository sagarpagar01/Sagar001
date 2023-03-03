package Library_files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class UtilityClass 
{
	
	//Test engineer = sagar
	
	@Test
	public static String getdatafromPF(String key) throws IOException
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\sagar pagar\\eclipse-workspace\\1_Oct_Maven\\PropFile.properties");
		
		Properties prop = new Properties();
		
		prop.load(file);
		
		 String value1 = prop.getProperty(key);
		
		return value1;
		
		
	}
	
	
	@Test
	public static String getdatafromExcel(int rowindex , int cellindex) throws IOException
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\sagar pagar\\eclipse-workspace\\1_Oct_Maven\\Testdata01\\POM with TestNg.xlsx ");
		
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	
	String value2 = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
	
	return value2;
	
	}
	
	@Test
	public static void takescreenshot(WebDriver driver, int TestcaseID) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	File destination = new File("C:\\Users\\sagar pagar\\eclipse-workspace\\1_Oct_Maven\\Screenshot\\."+TestcaseID+".jpg");
	
	FileHandler.copy(source, destination);
		
		
		
		
	}
	
}
