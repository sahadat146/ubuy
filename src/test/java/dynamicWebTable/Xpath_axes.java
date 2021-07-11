package dynamicWebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Xpath_axes {
	
	@Test
	public void Xpathaxis() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\blr-frontdesk-ptt\\Automotion\\AutomotionTe\\driver\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 driver.get("https://www.guru99.com/");
	 
	 Thread.sleep(5000);
	//Search the element by using Following method
	 WebElement elt=driver.findElement(By.xpath("//*[@type='text']//following::input"));
 	elt.sendKeys("Selenium");
 	
	//Print the text of the searched element
	 System.out.println(elt.getText());

//Close the browser
driver.quit();
}


}
