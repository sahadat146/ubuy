package bootstrap;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BS_DD_WithoutSelectTeg {
	@Test(enabled=false)
	public void click()
	{
		System.out.println("only one");
	}
	
	@Test(enabled=true)
	public void click1()
	{
		System.out.println("iengi123");
	}
	
	
	
	@Test
	public void handleBSDropdown() {
		WebDriverManager.chromedriver().setup();
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\blr-frontdesk-ptt\\Automotion\\AutomotionTe\\driver\\chromedriver.exe");	
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.findElement(By.xpath("//button[contains(text(),'Dropdown button')]")).click();
		List<WebElement>elt = driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Another action']"));
		//List<WebElement>elt = driver.findElements(By.xpath("//div[@class='dropdown-menu' and @aria-labelledby='dropdownMenuButton']//a"));
System.out.println(elt.size());

for(int i=0;i<elt.size();i++) {
System.out.println(elt.get(i).getText());

if(elt.get(i).getText().equals("Anather action")) {
	elt.get(i).click();
	break;
}
	
}
}
}