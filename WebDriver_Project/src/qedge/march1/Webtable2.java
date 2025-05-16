package qedge.march1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class Webtable2 {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://money.rediff.com/losers");
//		Thread.sleep(5000);
//		//store table into webelement
//		WebElement table = driver.findElement(By.className("dataTable"));
//		
//		//get collection of rows in atable
//		List<WebElement>  rows= table.findElements(By.tagName("tr"));
//		//Print number of rows
//		System.out.println("Number of rows: "+ (rows.size()-1));
//		
//		//Loop over each row to print number of columns in a row
//		for (int i = 1; i < rows.size(); i++) {
//			List<WebElement> cols= rows.get(i).findElements(By.tagName("td"));
//			System.out.println("Row number "+i+"Number of columns "+ (cols.size()-1));
//		}
//		Thread.sleep(5000);
//		driver.quit();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/losers");
		Thread.sleep(5000);
		WebElement table =driver.findElement(By.className("dataTable"));
		List<WebElement>  rows= table.findElements(By.tagName("tr"));
		System.out.println("Number of rows:"+ (rows.size()-1));
		for (int i = 1; i < rows.size(); i++) {
			List<WebElement> cols= rows.get(i).findElements(By.tagName("td"));
			System.out.println("Row number"+i+"number of columns"+(cols.size()-1));	
		}
		Thread.sleep(5000);
		driver.quit();
		

	}

}
