package javaScriptExecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleJavaScript {
	
	@Test
	public void ansisterXpath() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\blr-frontdesk-ptt\\Automotion\\AutomotionTe\\driver\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	driver.get("http://demo.guru99.com/test/guru99home/");
	 //Declare and set the start time		
    long start_time = System.currentTimeMillis();	 
    
	js.executeScript("window.setTimeout(arguments[arguments.length-1],5000);");
	//js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");		
	
	 //Get the difference (currentTime - startTime)  of times.		
    System.out.println("Passed time: " + (System.currentTimeMillis() - start_time));	
    
	}}
