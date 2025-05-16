package qedge.feb19;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Item {

	public static void main(String[] args) throws Throwable {
//		String Expected= "baby";
//		boolean Item_Exists=false;
//		String Actual="";
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
//			Actual= each.getText();
//			System.out.println("Actual  "+ Actual);
//			if (Actual.equalsIgnoreCase(Expected)) {
//				Item_Exists=true;
//				break;	
//			}
//		}
//		
//		if (Item_Exists) {
//			System.out.println("Expected "+ Expected + "found in the search listbox.");	
//		}
//		else
//		{
//			System.out.println("Expected "+ Expected + "not found in the search listbox.");
//		}
//		Thread.sleep(4000);
//		driver.quit();
		
		String Excepted= "deals";
		boolean Item_Exist=false;
		String Actual="";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(4000);
		Select searchListBox = new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> listopetions=searchListBox.getOptions();
		
		System.out.println(listopetions.size());
		for (WebElement each : listopetions) 
		{
			Actual= each.getText();
			System.out.println("Actual  "+ Actual);
			if (Actual.equalsIgnoreCase(Excepted)) {
				Item_Exist=true;
				break;	
			}
		}
		
		if (Item_Exist) {
			System.out.println("Expected "+ Excepted + "found in the search listbox.");	
		}		else
			
		{
			System.out.println("Expected "+ Excepted + "not found in the search listbox.");
		}
		Thread.sleep(4000);
		driver.quit();
			
			
		}
		
	}


