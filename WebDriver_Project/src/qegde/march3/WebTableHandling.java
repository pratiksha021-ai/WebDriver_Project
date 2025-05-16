package qegde.march3;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class WebTableHandling {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://money.rediff.com/tools/forex");
//		Thread.sleep(5000);
//		//store table into webement
//		WebElement webtable = driver.findElement(By.className("dataTable"));
//		/// get collection of rows in webtable
//		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
//		int rowSize = rows.size()-1;
//		System.out.println("No of rows are::"+rowSize);
//		Thread.sleep(5000);
//		//iterate all rows
//		for (WebElement row : rows) {
//			List<WebElement> cols= row.findElements(By.tagName("td"));
//			//Print a row data
//			for (WebElement col : cols) {
//				System.out.print("\t"+ col.getText()+"||");
//			}
//			System.out.println();
//			System.out.println("=============================================================");
//			
//		}
//		Thread.sleep(5000);
//		driver.quit();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/tools/forex");
		Thread.sleep(5000);
		WebElement webtable = driver.findElement(By.className("dataTable"));
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		int rowSize = rows.size()-1;
		System.out.println("no of rows are::+rowSize");
		Thread.sleep(3000);
		for (WebElement row : rows) {
			List<WebElement> cols =row.findElements(By.tagName("td"));
		    for (WebElement col:cols) {
				System.out.println("\t"+col.getText()+"||");
			}
		    System.out.println();
		    System.out.println("=============================================");
		}
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
