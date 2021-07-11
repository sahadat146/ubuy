package sortedDropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		      driver.get("http://www.flipkart.com/");
		      driver.findElement(By.name("q")).sendKeys("mobile");
		      //Thread.sleep(5000);
		      String xp="//ul/li//a[contains(text(),'mobile')]";
		      List<WebElement> allMobiles = driver.findElements(By.xpath(xp));
		      for(WebElement mobile:allMobiles)
		      {
		         System.out.println(mobile.getText());
		      }
		      driver.quit();
		   }
		}



