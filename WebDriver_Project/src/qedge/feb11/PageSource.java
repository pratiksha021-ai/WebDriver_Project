package qedge.feb11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver =new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.tatamotors.com/");
//		Thread.sleep(5000);
//		String pagesource=driver.getPageSource();
//		System.out.println(pagesource);
//		Thread.sleep(5000);
//		driver.quit();
//		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		Thread.sleep(4000);
		driver.quit();
		
		
		
		

	}

}
