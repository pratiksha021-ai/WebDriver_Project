package qedge.feb19;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelection2 {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("file:///E:/MultiListboxHtmlpage.html");
//		Thread.sleep(5000);
//		
//		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
//		System.out.println("list box is multiple: "+ dropdown.isMultiple());
//		List<WebElement> options=  dropdown.getOptions();
//		//Print number of options
//		System.out.println("Number of options  "+options.size());
//		//Print each option name
//		for (WebElement webElement : options) {
//			System.out.println(webElement.getText());	
//		}
//		Thread.sleep(5000);
//		driver.quit();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/MultiListboxHtmlpage.html");
		Thread.sleep(5000);
		
		Select dropdown =new Select(driver.findElement(By.name("multiselection")));
		System.out.println("list box is multiple:"+ dropdown.isMultiple());
		List<WebElement> options= dropdown.getOptions();
		System.out.println("number of options  "+options.size());
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
			
		}
		Thread.sleep(5000);
		driver.quit();
		

	}

}
