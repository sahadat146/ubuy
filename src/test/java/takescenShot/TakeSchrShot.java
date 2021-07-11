package takescenShot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSchrShot {
	WebDriver driver=new ChromeDriver();
	
	//Call getScreenshotAs method to create image file

    File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

//Move image file to new destination

    File DestFile=new File("fileWithPath");

    //Copy file at destination

    FileUtils.copyFile(SrcFile, DestFile);

}
