package AdvanceConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Petshop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("https://petstore.octoperf.com/actions/Account.action?signonForm=");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement uname=driver.findElement(By.name("username"));
        uname.sendKeys("saran");
        Thread.sleep(2000);
        WebElement pass=driver.findElement(By.name("password"));
        pass.clear();
        pass.sendKeys("12345");
        Thread.sleep(2000);
        WebElement signin=driver.findElement(By.name("signon"));
        signin.click();
        Thread.sleep(2000);
        WebElement dogs=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[2]/img"));
        dogs.click();
        Thread.sleep(2000);
        WebElement variant=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[6]/td[1]/a"));
        variant.click();
        Thread.sleep(2000);
        WebElement addtocart=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
        addtocart.click();
        Thread.sleep(2000);
        WebElement proceed=driver.findElement(By.xpath("//*[@id=\"Cart\"]/a"));
        proceed.click();
        Thread.sleep(2000);
        WebElement order=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input"));
        order.click();
        Thread.sleep(2000);
        WebElement orderconfirm=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a"));
        orderconfirm.click();
        
        
		

	}

}
