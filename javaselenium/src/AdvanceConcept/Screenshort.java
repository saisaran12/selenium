package AdvanceConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshort {

	public static void main(String[] args) throws IOException {
		 WebDriver driver = new ChromeDriver();
	        driver.navigate().to("https://leafground.com/link.xhtml");
	        driver.manage().window().maximize();
	        TakesScreenshot ts =(TakesScreenshot) driver;
	        File source=ts.getScreenshotAs(OutputType.FILE);
	        File des=new File("C:\\Users\\Saidev\\eclipse-workspace\\selenium1\\snaps\\leaf.png");
	       FileUtils.copyFile(source, des);
	       

	}

}
