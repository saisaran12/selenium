package AdvanceConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://leafground.com/frame.xhtml");
        driver.manage().window().maximize();
        WebElement b1 = driver.findElement(By.id("Click"));
        b1.click();
        String text = driver.findElement(By.id("Click")).getText();
        System.out.println("Button text: " + text);

    }
}
