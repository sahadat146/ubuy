package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridDemo {
	

	WebDriver driver;
	@Test(priority=1)
	void setup() throws MalformedURLException
	{
	String nodeURL="http://10.85.7.11:4444/wd/hub";
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WIN10);
	System.setProperty("Webdriver.chrome.driver","chrome_location_chromedriver.exe");
	driver=new RemoteWebDriver(new URL(nodeURL),cap);
	}
	@Test(priority=2)
	public void logHome()
	{
	driver.get("https://www.youtube.com/watch?v=P8yq37Qr4eo&pbjreload=101");
	//WebElement elt=driver.findElement(By.id("svcso");
	//elt.click();
	}} 


