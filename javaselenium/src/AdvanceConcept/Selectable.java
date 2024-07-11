package AdvanceConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/selectable");
        driver.manage().window().maximize();
        WebElement selectable = driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(selectable)
               .clickAndHold(selectable)
               .clickAndHold(selectable)
               .build()
               .perform();
    }
}
