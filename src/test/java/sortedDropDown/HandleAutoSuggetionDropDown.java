package sortedDropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAutoSuggetionDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.bing.com/");
		driver.findElement(By.id("sb_form_q")).sendKeys("hi");
		
		List<WebElement>list=driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
		System.out.println(list.size());
		for(WebElement listitem : list) {
			
			if(listitem.getText().equals("selenium")) {
				listitem.click();
				break;
			}
		}
		driver.close();
	}

}
