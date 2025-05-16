package qedge.march4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender2 {

	public static void main(String[] args) throws Throwable {
//		String dob ="25/April/2024";
//		String temp[]=dob.split("/");
//		String date =temp[0];
//		String month =temp[1];
//		String year =temp[2];
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://jqueryui.com/datepicker/");
//		Thread.sleep(5000);
//		driver.switchTo().frame(0);
//		Thread.sleep(3000);
//		driver.findElement(By.id("datepicker")).click();
//		Thread.sleep(5000);
//		String calYear=driver.findElement(By.className("ui-datepicker-year")).getText();
//		while (!calYear.equals(year)) {
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[@title='Prev']")).click();
//			calYear= driver.findElement(By.className("ui-datepicker-year")).getText();
//		}
//		
//		//select month
//		String calMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
//		while (!calMonth.equalsIgnoreCase(month)) {
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[@title='Prev']")).click();
//			calMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
//		}
//		
//		//select date
//		WebElement calTable = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
//		//get rows of the table
//		List<WebElement> rows = calTable.findElements(By.tagName("tr"));
//		for (WebElement row : rows) {
//			List<WebElement> cols=row.findElements(By.tagName("td"));
//			for (WebElement col : cols) {
//				if (date.equals(col.getText())) {
//					//click cell to select date from calender
//					Thread.sleep(5000);
//					col.click();
//				}
//				
//			}
//			
//		}
//		
//		System.out.println("Selected date: "+ driver.findElement(By.id("datepicker")).getAttribute("value"));
//		Thread.sleep(5000);
//		driver.quit();
		String dob ="08/jan/2025";
		String temp[]=dob.split("/");
		String Date=temp[0];
		String Month=temp[1];
		String Year=temp[2];
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(5000);
		String calyear=driver.findElement(By.className("ui-datepicker-calendar")).getText();
		while (!calyear.equals(Year)) {
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//a[@title='Prev']")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		   String calMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		   while (!calMonth.equalsIgnoreCase(Month)) {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@title='Prev']")).click();
			driver.findElement(By.className("ui-datepicker-month")).getText();
			
		}
		   WebElement calTable = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
		   List<WebElement> rows = calTable.findElements(By.tagName("tr"));
		   for (WebElement row : rows) {
				List<WebElement> cols=row.findElements(By.tagName("td"));
				for (WebElement col : cols) {
					if (Date.equals(col.getText())) {
						Thread.sleep(5000);
						col.click();
					}
					
				}
				
			}
		   System.out.println("Selected date: "+ driver.findElement(By.id("datepicker")).getAttribute("value"));
			Thread.sleep(5000);
			driver.quit();
		
		

	}

}
