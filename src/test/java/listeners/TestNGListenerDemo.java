package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//https://www.youtube.com/watch?v=WAyMslXOkLM&t=459s

//@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo {
    @Test
	public void test1() {
		System.out.println("im inside test 1");
	}
    @Test
	public void test2() {
		System.out.println("im inside test 2");
	//Assert.assertTrue(false);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("btn")).sendKeys(Keys.RETURN);
    }
    @Test
    
	public void test3() {
		System.out.println("im inside test 3");
	throw new SkipException(" this test is skipped");
    }
    
    @Test
	public void test4() {
		System.out.println("im inside test 4");
	}
}



