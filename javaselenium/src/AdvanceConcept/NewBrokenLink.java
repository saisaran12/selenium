package AdvanceConcept;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//this code is used for smoke testing for build process
public class NewBrokenLink {

	public static void main(String[] args)throws InterruptedException,Throwable {
		// TODO Auto-generated method stub
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.flipkart.com/");
		List<WebElement> alllinks=d1.findElements(By.xpath("//a"));
		int broken=0,notbroken=0;
		
		for(WebElement link:alllinks)
		{
			String href=link.getAttribute("href");
			String text=link.getText();
			System.out.println("Link :"+link);
			System.out.println("Href :"+href);
		}
		
		try
		{
			String href="https://www.flipkart.com/";
			URL u1=new URL (href);
			HttpURLConnection con=(HttpURLConnection) u1.openConnection();
			int code=con.getResponseCode();
			if(code==200)
			{
				System.out.println("Link is not broken");
				notbroken++;
			}
			else
			{
				System.out.println("Link is broken");
				broken++;
			}
		}
		catch(Exception e)
		{
			System.out.println("Link is broken");
			broken++;
		}
		System.out.println("Total Num of links :"+alllinks.size());
		System.out.println("Total Num of broken links :"+broken);
		System.out.println("Total Num of Non broken links :"+notbroken);
		
	}

}
