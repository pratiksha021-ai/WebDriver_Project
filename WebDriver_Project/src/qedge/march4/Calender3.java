package qedge.march4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender3 {

	public static void main(String[] args) throws Throwable {
		String dob ="25/April/2027";
		String temp[]=dob.split("/");
		String date =temp[0];
		String month =temp[1];
		String year =temp[2];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flights.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("ranga@qedgetech.com");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.id("search-date")).click();
		Thread.sleep(5000);
		//capture calender year
		String calYear =driver.findElement(By.className("ui-datepicker-year")).getText();
		while (!calYear.equals(year)) {
			//click next button until calyear equals to year
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			calYear =driver.findElement(By.className("ui-datepicker-year")).getText();
			
		}
		//capture calender month 
		String calMonth =driver.findElement(By.className("ui-datepicker-month")).getText();
		while (!calMonth.equalsIgnoreCase(month)) {
			//click next button until calyear equals to year
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			calMonth =driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		//store table into webeleent
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		//get rows collection from webtable
		List<WebElement> rows =webtable.findElements(By.tagName("tr"));
			for (WebElement eachrow : rows) {
				//get cell collection from each row
				List<WebElement> cols = eachrow.findElements(By.tagName("td"));
				for (WebElement eachcell : cols) {
					if(eachcell.getText().equals(date))
					{
						//click cell to select date from calender
						Thread.sleep(5000);
						eachcell.click();
					}
				}
			}	
			System.out.println("Selected date: "+ driver.findElement(By.id("search-date")).getAttribute("value"));
			Thread.sleep(5000);
			driver.quit();
	}
	}


