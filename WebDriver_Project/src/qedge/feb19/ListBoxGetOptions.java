package qedge.feb19;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxGetOptions {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.navigate().to("https://www.amazon.in/");
//		Thread.sleep(4000);
//		
//		Select searchListBox = new Select(driver.findElement(By.id("searchDropdownBox")));
//		List<WebElement> listOptions=searchListBox.getOptions();
//		
//		System.out.println(listOptions.size());
//		for(WebElement each:listOptions)
//		{
//			System.out.println(each.getText());
//		}
//		Thread.sleep(4000);
//		driver.quit();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		Select searchListBox =new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> listoptions=searchListBox.getOptions();
		
		System.out.println(listoptions.size());
		{
			for (WebElement each : listoptions) 
			{
				System.out.println(each.getText());	
			}
			Thread.sleep(5000);
			driver.quit();
			
		}
		
		
		
		
		
	

	}

}
