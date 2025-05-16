package qegde.march3;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class Verify_Empid {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://orangehrm.qedgetech.com/");
//		Thread.sleep(3000);
//		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
//		driver.findElement(By.name("txtPassword")).sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		//Click on PIM
//		driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
//		Thread.sleep(2000);
//		//Click on Add button
//		driver.findElement(By.id("btnAdd")).click();
//		Thread.sleep(3000);
//		//Enter new employee details
//		driver.findElement(By.id("firstName")).sendKeys("piku3");
//		driver.findElement(By.id("lastName")).sendKeys("golait");
//		//Reads employee id
//		String empid= driver.findElement(By.id("employeeId")).getAttribute("value");
//		System.out.println(empid);
//		//click on save button
//		driver.findElement(By.id("btnSave")).click();
//		Thread.sleep(3000);
//		//click on employee list
//		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
//		Thread.sleep(3000);
//		//Enter employee id in id search box
//		driver.findElement(By.name("empsearch[id]")).sendKeys(empid);
//		//click on search button
//		driver.findElement(By.id("searchBtn")).click();
//		Thread.sleep(3000);
//		//Store employee table
//		WebElement table= driver.findElement(By.id("resultTable"));
//		//Store rows of the table
//		List<WebElement> rows= table.findElements(By.tagName("tr"));
//		for (int i = 1; i < rows.size(); i++) {
//			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
//			if (cols.get(1).getText().equals(empid)) {
//				System.out.println("Employee Saved Success::"+empid);
//				break;
//			}
//			else
//			{
//				System.out.println("Employee Not Saved Success::"+empid);
//				break;
//			}
//
//		}
//		Thread.sleep(5000);
//		driver.quit();
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("txtPassword")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnAdd")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("pinku");
		driver.findElement(By.id("lastName")).sendKeys("golait");
		String empid=driver.findElement(By.id("employeeId")).getAttribute("value");
		System.out.println(empid);
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empid);
		Thread.sleep(3000);
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(3000);
		WebElement Table= driver.findElement(By.id("resultTable"));
		List<WebElement> rows = Table.findElements(By.tagName("tr"));
		for (int i = 1; i <= rows.size(); i++) {
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			if (cols.get(1).getText().equals(empid)) {
				System.out.println("epmloyee saved succesfull::+empid");
				break;
			}
			else 
			{
				System.out.println("epmloyee not saved successfull::+empid");
				break;
				
			}
		}
		Thread.sleep(5000);
		driver.quit();
		}
		

	}


