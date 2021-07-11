package dynamicWebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleDWguru99 {
	@Test
	public void selectAllElement() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\blr-frontdesk-ptt\\Automotion\\AutomotionTe\\driver\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	driver.get("http://demo.guru99.com/test/web-table-element.php");
	
	 WebElement elt=driver.findElement(By.tagName("table"));
	System.out.println(elt.getText());
	System.out.println("The size of the table is :"+elt.getSize());
	WebElement elt1=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[9]/th"));
System.out.println("Company name is:"+elt1.getText());
System.out.println("No of col is:"+elt1.getSize());

WebElement elt2=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[9]/td[1]"));

System.out.println("Single Company name is:"+elt2.getText());
System.out.println("No of rows is:"+elt2.getSize());


WebElement elt3=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[9]/td[2]"));
System.out.println("Single group name is:"+elt3.getText());

driver.close();
	}
}