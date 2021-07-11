package dynamicWebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingDyncWebTable {
	
	
	///html[1]/body[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]
	///html[1]/body[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]
	// /html[1]/body[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[5]
	///html[1]/body[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[8]/td[1]
	///html[1]/body[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[12]/td[1]
			
    // /html[1]/body[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[8]/td[3]
	
	@Test
	public void selectAllElement() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\blr-frontdesk-ptt\\Automotion\\AutomotionTe\\driver\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	driver.get("http://demo.guru99.com/test/web-table-element.php");
	
	String before_xpath="//*[@id='leftcontainer']/table/tbody/tr[";
	String after_xpath="]/td[1]";
	for(int i=2; i<=30; i++) {
    String name=driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
		System.out.println(name);
		if(name.contains("Cera Sanitaryware L ")) {
			driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td[1]")).getText();
	    }
	  }
	}
  }
	
	
	
	
	
	
	
	
	
	
	
	
	
