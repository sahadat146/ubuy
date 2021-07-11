package handleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandle {
	static
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\blr-frontdesk-ptt\\Automotion\\AutomotionTe\\driver\\chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://demo.guru99.com/popup.php");
String parent=driver.getWindowHandle();
System.out.println("parent_Window"+parent);

// click on d button which is result opening up new window

WebElement ClickElement=driver.findElement(By.xpath("//*[contains(@href,'popup.php')]"));
for(int i=0;i<17;i++)
{
	ClickElement.click();
	Thread.sleep(3000);
}

Set<String> AllWindow = driver.getWindowHandles();

	for(String handle :AllWindow)
	{
		System.out.println("Child_Window"+AllWindow);
	}
	
	driver.switchTo().window(parent);
	driver.quit();
}
	
	}


