package tstngs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest 
{
	
	@Test
	public void tc_01() 
	{
		Reporter.log("Deepak",true);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Seleniumhq",Keys.ENTER);
	}
	@Test
	public void tc_02() 
	{
		Reporter.log("Selenium",true);
		
	}


}
