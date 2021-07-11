package action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Click_sub_menu_after_mouse_hovering_the_element_using_actions {

	static
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\blr-frontdesk-ptt\\Automotion\\AutomotionTe\\driver\\chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		
		WebDriverManager.chromedriver().setup();
		    WebDriver driver = new ChromeDriver();
		    driver.get("http://automationpractice.com/index.php");  
		    driver.manage().window().maximize();
		   
		    
		    
		    WebElement elt=driver.findElement(By.xpath("//a[@title='Women']"));
		    Actions act=new Actions(driver);
    		act.moveToElement(elt).build().perform();
    		
		    		WebElement buton=driver.findElement(By.xpath("//div[@id='block_top_menu']//ul//li[1]"));
Thread.sleep(3000);
		    		List<WebElement> elt1 =buton.findElements(By.tagName("a"));
		    		System.out.print(elt1.size());
		    		
		    		for(WebElement manu:elt1) {
		    			if(manu.getText().equals("Blouses")) {
		    				manu.click();
		    				break;
		    			}
		    		}
	}
}