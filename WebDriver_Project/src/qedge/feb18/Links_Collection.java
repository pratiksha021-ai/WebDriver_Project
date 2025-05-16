package qedge.feb18;
import java.net.PortUnreachableException;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_Collection {

	public static void main(String[] args) throws Throwable {
//		 WebDriver driver=new ChromeDriver();
//		    driver.manage().window().maximize();
//		    driver.get("https://www.facebook.com");
//		    Thread.sleep(5000);
//		    List<WebElement> list_link=  driver.findElements(By.tagName("a"));
//		    System.out.println(list_link.size());
//		    for(WebElement each : list_link)
//		    {
//		    	System.out.println(each.getText());
//		    }
//		    Thread.sleep(5000);
//		    driver.quit();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		List<WebElement> list_link= driver.findElements(By.tagName("a"));
		System.out.println(list_link.size());
		for (WebElement each : list_link) 
		{
			System.out.println(each.getText());	
		}
			Thread.sleep(5000);
			driver.quit();
		}

	
	
		
		
			
		
		    
	}


