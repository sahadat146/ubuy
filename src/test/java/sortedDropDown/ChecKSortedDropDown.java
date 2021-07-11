package sortedDropDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChecKSortedDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get(" https://www.twoplugs.com/ ");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();
	WebElement elt=driver.findElement(By.name("category_id"));
	Select sel=new Select(elt);
	
	List<WebElement> option=sel.getOptions();
	
	ArrayList originalList=new ArrayList();
	
	ArrayList tempList=new ArrayList();
	
	for(WebElement options:option) {
		
		originalList.add(options.getText());
		
		tempList.add(options.getText());
	}
	System.out.println("original list;"+originalList);
	System.out.println("templorary list"+tempList);
	
	Collections.sort(tempList);
	System.out.println("original list;"+originalList);
	System.out.println("templorary list"+tempList);
	
	if( originalList.equals(tempList)) {
		System.out.println("Drop down is sorted");
		
	}
	else {
		System.out.println("Drop down is not sorted");
	}
	}
	

}
