package bootstrap;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.core.config.properties.PropertiesConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.SessionId;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BS_DD_selectAllElement {
	
	@Test
	public void selectAllElement() {
		//Here we need tom= pass logger instance so we need to pass class name 
		//using xml file
		//Logger logger = Logger.getLogger("BS_DD_selectAllElement");
		//DOMConfigurator.configure("log4j2.properties");
		
		//Second method using properties file
		PropertyConfigurator.configure("log4j2.properties");
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\blr-frontdesk-ptt\\Automotion\\AutomotionTe\\driver\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	
	
	//How to create Session ID
	//Webdriver uses this session Id to interact with browser launched by them. So a browser window (eg Chrome) launched by a specific driver (chrome driver) will have a unique sessionId
     
	SessionId session = ((ChromeDriver)driver).getSessionId();

	System.out.println("Session id: " + session.toString());
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	//logger.info("open the browser");
	driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	
	driver.findElement(By.xpath("//button[@title='HTML, CSS']")).click();
	
	List<WebElement>elt=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
	for(int i=0;i<elt.size();i++) {
		
		System.out.println(elt.get(i).getText());
		elt.get(i).click();
	  }
	}
 }
