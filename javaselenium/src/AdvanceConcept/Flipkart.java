package AdvanceConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class Flipkart {

	public static void main(String args[]) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.flipkart.com");
        driver.manage().window().maximize();
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("realme");
        search.sendKeys(Keys.RETURN);
        WebElement searchelement = driver.findElement(By.xpath("(//div[@data-id='MOBGSQGGZ7HQMEZD'])[1]"));
        searchelement.click();
        String oldWindow = driver.getWindowHandle();
        System.out.println("Old window handle: " + oldWindow);
        Thread.sleep(3000);
        Set<String> handles = driver.getWindowHandles();
        for (String newWindow : handles) {
            driver.switchTo().window(newWindow);
        }
      WebElement b1=driver.findElement(By.xpath("//button[text()='Add to cart']"));
      b1.click();
        driver.close();
        driver.switchTo().window(oldWindow);

        Thread.sleep(3000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", searchelement);
        driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
//        searchelement2.click();
//        System.out.println(searchelement2);        

       
        
        	}

}
