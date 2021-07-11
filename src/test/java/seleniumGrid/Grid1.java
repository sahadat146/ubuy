package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid1 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		String url="http://localhost:4444/grid/wd/hub";
	DesiredCapabilities desir=new DesiredCapabilities();
	desir.setBrowserName("chrome");
	desir.setPlatform(Platform.WIN10);
	
	driver=new RemoteWebDriver((new URL(url)),desir);
	
	driver.get("https://www.amazon.in/");
	System.out.println(driver.getCurrentUrl());
	}

}
