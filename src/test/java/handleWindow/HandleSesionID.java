package handleWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSesionID {
	
	String  parent,child;
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\blr-frontdesk-ptt\\Automotion\\AutomotionTe\\driver\\chromedriver.exe");	
	}


	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		String parent=driver.getWindowHandle();
		System.out.println("parent_Window"+parent);
		WebElement ClickElement=driver.findElement(By.xpath("//*[contains(@href,'popup.php')]"));
		
		String child=driver.getWindowHandles().toString();
		System.out.println("child_Window"+child);
		
		
	}

}
