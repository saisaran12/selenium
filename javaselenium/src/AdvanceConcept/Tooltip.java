package AdvanceConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.globalsqa.com/demo-site/tooltip/#Forms%20Based");
	        driver.manage().window().maximize();
	        WebElement formsbased=driver.findElement(By.id("Forms Based"));
	        formsbased.click();
	        WebElement name=driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
	        name.click();
	        String tooltip=name.getAttribute("Please provide your firstname.");
	        System.out.println(tooltip);

	}

}
