package dynamicWebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Followinf_Sebling_Ansistor {
	
	
	
		@Test
		public void selectAllElement() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\blr-frontdesk-ptt\\Automotion\\AutomotionTe\\driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		
		//h4/a[contains(text(),'SAP MM')] (Ansistor)
		//h2[contains(text(),'A few of our most popular courses')]/parent::div//div[//a[text(),'SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']
		//h2[contains(text(),'A few of our most popular courses')]/parent::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']


		List <WebElement> elt = driver.findElements(By.xpath("//h2[contains(text(),'A few of our most popular courses')]/parent::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));
     
	
      for (WebElement element : elt) {
                                                                                                                                                            //following-sibling::
    	  System.out.println(element.getText());
    	       
    	 
      }
      driver.quit();
		
		}
}
		

		
		
		
		
		
		
		
		
		
		
		