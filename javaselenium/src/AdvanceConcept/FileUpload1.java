package AdvanceConcept;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("https://leafground.com/file.xhtml");
        driver.manage().window().maximize();
        WebElement upload=driver.findElement(By.id("j_idt88:j_idt89"));
        upload.click();
        Thread.sleep(2000);
        StringSelection selection=new StringSelection("C:\\Users\\Saidev\\Downloads\\TestLeaf Logo.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        
        

	}

}
