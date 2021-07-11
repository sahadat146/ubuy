package frameHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexOfIFrame {
	static
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\blr-frontdesk-ptt\\Automotion\\AutomotionTe\\driver\\chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

		    WebDriver driver = new ChromeDriver();
		    driver.get("http://demo.guru99.com/test/guru99home/");  
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		    int size = driver.findElements(By.tagName("iframe")).size();

		    for(int i=0; i<=size; i++){
			driver.switchTo().frame(i);
			Thread.sleep(4000);
			int total=driver.findElements(By.xpath("html/body/a/img")).size();
			System.out.println(total);
			Thread.sleep(4000);
		    driver.switchTo().defaultContent();
		    }}

	}

/*
 Switching back to Main Page
The main page is where all the iframes are embedded. After operating on a particular iframe,  use switchTo().parentFrame 
to move back to the page page.  Use switchTo().defaultContent to shift to the primary/first parent frame. Refer to the sample code below:

WebDriver driver = new ChromeDriver();
driver.get("URL");// URL OF WEBPAGE HAVING FRAMES
//First finding the element using any of locator strategy
WebElement iframeElement = driver.findElement(By.id("iFrameResult"));
//now using the switch command to switch to main frame.
driver.switchTo().frame(0);
//Perform all the required tasks in the frame 0
//Switching back to the main window
driver.switchTo().defaultContent();
driver.quit();


*/
