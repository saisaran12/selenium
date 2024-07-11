package AdvanceConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://demoqa.com/auto-complete");
	        driver.manage().window().maximize();
	        WebElement input=driver.findElement(By.id("autoCompleteMultipleInput"));
	        input.sendKeys("g");
//	        WebElement optionslist = driver.findElement(By.xpath(""));

	}

}
