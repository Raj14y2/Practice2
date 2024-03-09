package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class Base_Class 
{
	public WebDriver driver;
	
	@BeforeClass
	@Parameters("Browser")
	public void launch(String Browser)
	{
		if(Browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
		}
		else if(Browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/login/");
		}
	}
	@AfterClass
	public void close()
	{
		driver.quit();	
	}
	

}
