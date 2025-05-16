package qedge.feb19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelection1 {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("file:///E:/MultiListboxHtmlpage.html");
//		Thread.sleep(5000);
//		
//		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
//		System.out.println("list box is multiple: "+ dropdown.isMultiple());
//		List<WebElement> options=  dropdown.getOptions();
//		//Select 0 to 8 items
//		for (int i = 0; i < 8; i++) {
//			dropdown.selectByIndex(i);
//			Thread.sleep(2000);
//		}
//		
//		List<WebElement> selectedOptions = dropdown.getAllSelectedOptions();
//		//Print number of selected options
//		System.out.println("Selected options number: "+ selectedOptions.size());
//		for (WebElement each : selectedOptions) {
//			System.out.println(each.getText());
//		}
//		
//		//Deselect option
//		 dropdown.deselectByVisibleText("Yellow");
//		 Thread.sleep(3000);
//		 dropdown.deselectByIndex(2);
//		 Thread.sleep(3000);
//		 dropdown.deselectAll();
//		 Thread.sleep(5000);
//		 driver.quit();
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///E:/MultiListboxHtmlpage.html");
		Thread.sleep(5000);
		
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		System.out.println("list Box is multiple:"+dropdown.isMultiple());
		List<WebElement> opetions =dropdown.getOptions();
		for (int i = 0; i <6; i++) {
			dropdown.selectByIndex(i);
			Thread.sleep(3000);	
		}
		List<WebElement> selectedoption =dropdown.getAllSelectedOptions();
		System.out.println("selected option number:"+ selectedoption.size() );
		for (WebElement each : selectedoption) {
			System.out.println(each.getText());	
		}
		dropdown.deselectByVisibleText("black");
		Thread.sleep(5000);
		dropdown.deselectByIndex(4);
		Thread.sleep(5000);
		dropdown.deselectAll();
		Thread.sleep(5000);
		driver.quit();	

	}

}
