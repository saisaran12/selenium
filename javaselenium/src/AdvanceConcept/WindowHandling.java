package AdvanceConcept;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://leafground.com/window.xhtml");
        driver.manage().window().maximize();

        // Get the handle of the original window
        String oldWindow = driver.getWindowHandle();
        System.out.println("Old window handle: " + oldWindow);

        // Open a new window
        WebElement openNewWindow = driver.findElement(By.id("j_idt88:new"));
        openNewWindow.click();

        // Switch to the new window
        Set<String> handles = driver.getWindowHandles();
        for (String newWindow : handles) {
            driver.switchTo().window(newWindow);
        }

        // Perform actions in the new window
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("abc@gmail.com");
        driver.close(); // Close the new window

        // Switch back to the original window
        driver.switchTo().window(oldWindow);

        // Open multiple windows
        WebElement openMultipleWindows = driver.findElement(By.id("j_idt88:j_idt91"));
        openMultipleWindows.click();

        // Get the number of open windows
        int numberOfWindows = driver.getWindowHandles().size();
        System.out.println("Number of open windows: " + numberOfWindows);

        // Click a button that doesn't close the window
        WebElement dontCloseButton = driver.findElement(By.id("j_idt88:j_idt93"));
        dontCloseButton.click();

        // Close any additional windows (except the original one)
        Set<String> newWindows = driver.getWindowHandles();
        for (String window : newWindows) {
            if (!window.equals(oldWindow)) {
                driver.switchTo().window(window);
                driver.close();
            }
        }
     
        
    }
}
