package handleWindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowhanbdebrowserStak {
	
	
	static {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\blr-frontdesk-ptt\\Automotion\\AutomotionTe\\driver\\chromedriver.exe");	
	}
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	// Load the website
	driver.get("http://www.naukri.com/");

	// It will return the parent window name as a String
	String parent=driver.getWindowHandle();
	
	System.out.println("parent window"+parent);

	Set<String>s=driver.getWindowHandles();

	// Now iterate using Iterator
	Iterator<String> I1= s.iterator();

	while(I1.hasNext())
	{

	String child_window=I1.next();
	System.out.println("Child Window"+child_window);

	
	
		
	if(!parent.equals(child_window))
	{
	driver.switchTo().window(child_window);

	System.out.println(driver.switchTo().window(child_window).getTitle());

	driver.close();
	}

	}
	//switch to the parent window
	driver.switchTo().window(parent);

	}
}
