package qedge.feb18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HanlingListbox1 {
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
//		listBoxDay.selectByVisibleText("16");
//		System.out.println(listBoxDay.getFirstSelectedOption().getText());
//		Thread.sleep(5000);
//		listBoxMonth.selectByVisibleText("Dec");
//		System.out.println(listBoxMonth.getFirstSelectedOption().getText());
//		Threda.sleep(5000);
//		listBoxYear.selectByVisibleText("1988");
//		System.out.println(listBoxYear.getFirstSelectedOption().getText());
//		Thread.sleep(5000);
//		
//		driver.quit();
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().to("https://www.facebook.com/r.php?entry_point=login");
	Thread.sleep(5000);
	Select listBoxDay =new Select(driver.findElement(By.name("birthday_day")));
	Select listBoxMonth =new Select(driver.findElement(By.id("month")));
	Select listBoxYear =new Select(driver.findElement(By.name("birthday_year")));
	
	listBoxDay.selectByVisibleText("8");
	System.out.println(listBoxDay.getFirstSelectedOption().getText());
	Thread.sleep(5000);
	
	listBoxMonth.selectByVisibleText("Nov");
	System.out.println(listBoxMonth.getFirstSelectedOption().getText());
	Thread.sleep(5000);
	
	listBoxYear.selectByVisibleText("1999");
	System.out.println(listBoxYear.getFirstSelectedOption().getText());
	Thread.sleep(5000);
	
	driver.quit();
	
	
		
		

	}

}
