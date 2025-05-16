package qegde.march3;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender1 {

	public static void main(String[] args) throws Throwable {
//		String dob ="30-Aug-1954";
//		String temp[]=dob.split("-");
//		String date =temp[0];
//		String month =temp[1];
//		String year = temp[2];
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://flights.qedgetech.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Register")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.name("dob")).click();
//		//select year from calender
//		new Select(driver.findElement(By.className("ui-datepicker-year"))).selectByVisibleText(year);
//		Thread.sleep(2000);
//		//select month from calender
//		new Select(driver.findElement(By.className("ui-datepicker-month"))).selectByVisibleText(month);
//		Thread.sleep(2000);
//		//store table into webelement
//		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
//		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
//		for (WebElement eachrow : rows) {
//			List<WebElement> cols = eachrow.findElements(By.tagName("td"));
//			for (WebElement eachcell : cols) {
//				if(eachcell.getText().equals(date))
//				{
//					Thread.sleep(5000);
//					//click date
//					eachcell.click();
//				}
//				}
//		}
//		Thread.sleep(7000);
//		driver.quit();
		
		String dob = "08-Nov-1999";
		String temp[] = dob.split("-");
		String date= temp[0];
		String Month = temp [1];
		String Year = temp [2];
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://flights.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("dob")).click();
		Thread.sleep(2000);
		new Select(driver.findElement(By.className("ui-datepicker-year"))).selectByVisibleText(Year);
		Thread.sleep(2000);
		new Select(driver.findElement(By.className("Month"))).selectByVisibleText(Month);
		Thread.sleep(2000);
	    WebElement webTable=driver.findElement(By.className("ui-datepicker-calendar"));
	    List<WebElement> rows =webTable.findElements(By.tagName("tr"));
	    for (WebElement eachrow:rows) {
	    	List<WebElement> cols =eachrow.findElements(By.tagName("td"));
	    	for (WebElement eachcell:cols) {
	    		if (eachcell.getText().equals(date)) 
	    		{
	    			Thread.sleep(5000);
	    			eachcell.click();
				}
			}
		}
		Thread.sleep(5000);
		driver.quit();
		
		
	}
}


