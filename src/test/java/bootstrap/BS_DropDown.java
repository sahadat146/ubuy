package bootstrap;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BS_DropDown {
	
	
	
	//Hi Dushyant, SearchContext is the super interface of the Webdriver. SearchContext is the super most interface in selenium, which is extended by another interface called WebDriver.
	//All the abstract methods of SearchContext and WebDriver interfaces are implemented in RemoteWebDriver class.

	//Select one element in boot strap
	@Test
	public void handleBSDropdown() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\blr-frontdesk-ptt\\Automotion\\AutomotionTe\\driver\\chromedriver.exe");	
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
	driver.findElement(By.xpath("//button[@title='HTML, CSS']")).click();;
//driver.findElement(By.xpath("//button[contains(@class='multiselect')]")).click();;

	List<WebElement>list=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
	System.out.println(list.size());
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).getText());
		if(list.get(i).getText().contains("Angular")) {
			list.get(i).click();
			break;
		}
	}
	}
}
