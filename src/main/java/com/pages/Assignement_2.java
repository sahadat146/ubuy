package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.TestBase;

public class Assignement_2 extends TestBase {
	//Open browser n nevagate to url
	//verify dat d page is deriected to 'http://facebook.com"
	//verify that there is a create an account section on d page
	//Fill d text box and update d date of birth in drop-down
	//select gender
	//click on "create account
	//Verify dat d accouint is created successfuly

	public static void getUrl() {
		String browserUrl=driver.getCurrentUrl();
		if(browserUrl.equals("https://www.facebook.com/")) {
			System.out.println("browser url test pass");}
			else {
				System.out.println("browser url test fail");
		}}
	
	public static void signUp() {
		WebElement elt=driver.findElement(By.cssSelector("div[class='mbs _52lq fsl fwb fcb']"));
		if(elt.isDisplayed()) {
			System.out.println("Verify create acnt page pass");
		}
		else {
			System.out.println("Verify create acnt page fail");
		}
		driver.findElement(By.xpath("#u_0_n_Tu")).sendKeys("keysToSend");
		driver.findElement(By.xpath("#u_0_p_Qk")).sendKeys("Send");
		driver.findElement(By.xpath("//input[@id='u_0_r_/f']")).sendKeys("28358");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("28323454");
		//input[@id='u_0_r_/f']
		
		WebElement dateElement=driver.findElement(By.id("day"));
		WebElement monthElement=driver.findElement(By.id("month"));
		WebElement yearElement=driver.findElement(By.id("year"));
		
		Select dataDropDown=new Select(dateElement);
		Select monthDropDown=new Select(monthElement);
		Select yearDropDown=new Select(yearElement);
		
		dataDropDown.selectByIndex(4);
		monthDropDown.selectByVisibleText("May");
		yearDropDown.selectByVisibleText("2004");
		
		
		driver.findElement(By.xpath("//input[@id='u_0_5_hi']"));
		//driver.findElement(By.xpath("//button[@id='u_0_13_57']")).submit();
	}
	}

