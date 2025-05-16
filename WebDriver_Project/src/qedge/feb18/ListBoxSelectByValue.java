package qedge.feb18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxSelectByValue {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.navigate().to("https://www.facebook.com/r.php?entry_point=login");
//		Thread.sleep(4000);
//		Select listBoxDay = new Select(driver.findElement(By.id("day")));
//		Select listBoxMonth = new Select(driver.findElement(By.id("month")));
//		Select listBoxYear = new Select(driver.findElement(By.id("year")));
//		
//		listBoxDay.selectByValue("8");
//		Thread.sleep(5000);
//		System.out.println(listBoxDay.getFirstSelectedOption().getText());
//		
//		listBoxMonth.selectByValue("11");
//		Thread.sleep(5000);
//		System.out.println(listBoxMonth.getFirstSelectedOption().getText());
//		
//		listBoxYear.selectByValue("1999");
//		Thread.sleep(5000);
//		System.out.println(listBoxYear.getFirstSelectedOption().getText());
//		
//		Thread.sleep(5000);
//		driver.quit();

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(5000);
		Select listBoxDay = new Select(driver.findElement(By.id("day")));
		Select listBoxMonth =new Select(driver.findElement(By.id("month")));
		Select listBoxYear =new Select(driver.findElement(By.id("year")));
		Thread.sleep(5000);
		
		listBoxDay.selectByValue("9");
		Thread.sleep(5000);
		System.out.println(listBoxDay.getFirstSelectedOption().getText());
		
		listBoxMonth.selectByValue("12");
		Thread.sleep(5000);
		System.out.println(listBoxMonth.getFirstSelectedOption().getText());
		
		listBoxYear.selectByValue("1999");
		Thread.sleep(5000);
		System.out.println(listBoxYear.getFirstSelectedOption().getText());
		
		driver.quit();
		

	}

}
