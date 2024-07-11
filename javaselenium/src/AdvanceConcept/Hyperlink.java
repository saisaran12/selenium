package AdvanceConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.navigate().to("https://leafground.com/link.xhtml");
	        driver.manage().window().maximize();
	        WebElement homepage=driver.findElement(By.linkText("Go to Dashboard"));
	        homepage.click();
	        driver.navigate().back();
	        WebElement whereto=driver.findElement(By.partialLinkText("Find the URL"));
	       String where= whereto.getAttribute("href");
	       System.out.println("link for not click:"+where);
	       WebElement brokenlink=driver.findElement(By.linkText("Broken?"));
	       brokenlink.click();
	       String title=driver.getTitle();
	       if(title.contains("404")) {
	    	   System.out.println("Link is broken");
	       }
driver.navigate().back();
WebElement homepage1=driver.findElement(By.linkText("Go to Dashboard"));
homepage1.click();
driver.navigate().back();
List <WebElement> totalLinks=driver.findElements(By.tagName("a"));
int linkcount=totalLinks.size();
System.out.println(linkcount);

	}

}
