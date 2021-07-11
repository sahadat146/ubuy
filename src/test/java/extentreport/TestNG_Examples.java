package extentreport;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Examples {
	
	ExtentHtmlReporter htmlReporter;
	 ExtentReports extent;
	 ExtentTest test;
	 WebDriver driver;
	
	@BeforeSuite
	//Before suit will run only once before all d test
	public void setUp() {
		
		// start reporters
        htmlReporter = new ExtentHtmlReporter("extent.html");
    
        // create ExtentReports and attach reporter(s)
       extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
	
	}
	@BeforeTest
	public void setUpTest() {
		 WebDriverManager.chromedriver().setup();
	}
	
	@Test
	public void test1() throws IOException {
		
		
		//driver.findElement(By.name("q")).sendKeys("Automation");
		// creates a toggle for the given test, adds all log events under it    
          test = extent.createTest("MyFirstTest", "Sample description");
          
          driver.get("https://www.google.com/");
          test.pass("Nevegated to the google");
		
       // log(Status, details)
          test.log(Status.INFO, "This step shows usage of log(status, details)");

          // info(details)
          test.info("This step shows usage of info(details)");
          
          // log with snapshot
          test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
          
          // test with snapshot
          test.addScreenCaptureFromPath("screenshot.png"); 
	}
	
	@Test
	public void test2() throws IOException {
          test = extent.createTest("MyFirstTest", "Sample description");
          test.log(Status.INFO, "This step shows usage of log(status, details)");
          test.info("This step shows usage of info(details)");
          test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
          test.addScreenCaptureFromPath("screenshot.png"); 
	}
	
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		test.pass("Close the browser");
	}
	
	
	@AfterSuite
	public void tearDown() {
		// calling flush writes everything to the log file
        extent.flush();
		
	}

}
