package extentreport;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_Usage_Example {

	public static void main(String[] args) {
		
		//private static WebDriver driver=null;
		// TODO Auto-generated method stub

		 // start reporters
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
    
     // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        
        // log(Status, details)
        test.log(Status.INFO, "Starting test cases");
        
        driver.get("https://www.google.com/");
        
        test.pass("Nevegate to google.com");
        
        

	driver.findElement(By.name("q")).sendKeys("Automation");
	
	test.pass("Enter text on scerch fields");
	
	driver.findElement(By.name("btn")).sendKeys(Keys.RETURN);
	
	test.pass("Press enter on keybord");
	
	driver.close();
	driver.quit();
        
	test.pass("close d browser");
  
    test.info("Test completed");
    
    // calling flush writes everything to the log file
    extent.flush();
        
	}

}
