package AdvanceConcept;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("https://leafground.com/file.xhtml");
        driver.manage().window().maximize();
        WebElement downloadLink=driver.findElement(By.id("j_idt93:j_idt95"));
        downloadLink.click();
        Thread.sleep(2000);
        
        File filelocation=new File("C:\\Users\\Saidev\\Downloads");
       File[] totalfiles= filelocation.listFiles();
       for(File file:totalfiles) {
    	   if(file.getName().equals("Testleaf logo.png"));
    	   System.out.println("File is download");
    	   break;
    	   
       }
    	   
       }

	}


