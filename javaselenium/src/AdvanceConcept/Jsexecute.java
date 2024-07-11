package AdvanceConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsexecute {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        driver.manage().window().maximize();
	        WebElement email=driver.findElement(By.id("email"));
	        WebElement Signup=driver.findElement(By.id("pass"));
	        JavascriptExecutor js=(JavascriptExecutor) driver;
//	        sendkeys
	        js.executeScript("arguments[0].value='saran'",email);
//	        Hightlight
	        js.executeScript("arguments[0].setAttribute('style','color:red')", email);
//	        scroll
	        js.executeScript("arguments[0].scrollIntoView()",Signup);
//	        click
	        js.executeScript("arguments[0].click()",Signup );


	        

	}

}
