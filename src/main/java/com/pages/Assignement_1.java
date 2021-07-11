package com.pages;

import com.base.TestBase;

public class Assignement_1 extends TestBase {
	
	//open browser and maxmize d browser window negavate to url
	//Write a methord to print PASS if d title page match " " else FAIL
	//Negavite to facebook page
	//Negavate back to the QA Tech url and print Current URl of the page
	//Negavite forword and Relode d page and close browser

	public static void verifypageTitle() {
		String expectedTitle= "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
	    String actualTitle=driver.getTitle();
	    System.out.println(actualTitle);
	    if(actualTitle.equals(expectedTitle)) {
	    	System.out.println("pass");
	    }
	    else {
	    	System.out.println("Fail");
	    }
	}
	
	public void navigateBrowser() throws InterruptedException {
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		String urlFromWebpage=driver.getCurrentUrl();
		System.out.println(urlFromWebpage);
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
				
	}
}
