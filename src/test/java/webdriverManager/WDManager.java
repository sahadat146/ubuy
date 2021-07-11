package webdriverManager;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDManager {
	WebDriver driver;
	
	//https://github.com/bonigarcia/webdrivermanager
	
	//WebDriverManager.chromedriver().setup();
	//WebDriverManager.firefoxdriver().setup();
	//WebDriverManager.edgedriver().setup();
	//WebDriverManager.operadriver().setup();
	//WebDriverManager.phantomjs().setup();
	//WebDriverManager.iedriver().setup();
	//WebDriverManager.chromiumdriver().setup();
	
	
	@BeforeMethod
	public void setUp() {
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
		 driver=new FirefoxDriver();
		//driver=new ChromeDriver();
	}
		 @Test
		 public void loginAmazon() throws InterruptedException {
			 
			
		 driver.get("https://www.amazon.in/");
		// JavascriptExecutor js=(JavascriptExecutor)driver;
			
			//WebElement button=driver.findElement(By.xpath("//input[@id='buy-now-button']/parent::span//input[@aria-labelledby='submit.buy-now-announce']"));
			//js.executeScript("arguments[0].click()",button);
		 //Thread.sleep(4000);
		 
 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple");
		 
		
			
			
			//JavascriptExecutor js=(JavascriptExecutor)driver;
			
			WebElement elt= driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
			elt.sendKeys(Keys.RETURN);
		 
	}
	

}
