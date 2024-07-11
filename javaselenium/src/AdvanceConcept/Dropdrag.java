package AdvanceConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdrag {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://leafground.com/drag.xhtml");
	        driver.manage().window().maximize();
	        WebElement drag=driver.findElement(By.id("form:drag_content"));
	        WebElement drop=driver.findElement(By.id("form:drop_content"));
	        Actions actions=new Actions(driver);
//	        actions.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
	        actions.dragAndDrop(drag, drop).build().perform();
	        
	}

}
