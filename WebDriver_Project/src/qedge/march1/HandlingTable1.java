package qedge.march1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable1 {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://money.rediff.com/losers");
//		Thread.sleep(5000);
//		String column1= driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[1]")).getText();
//		String column2= driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[2]")).getText();
//		String column3= driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[3]")).getText();
//		String column4= driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[4]")).getText();
//		String column5= driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[5]")).getText();
//		System.out.print(column1+" "+column2+" "+column3+" "+column4+" "+column5);
//        Thread.sleep(5000);
//        driver.quit();
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/losers");
		Thread.sleep(5000);
		String column1= driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr[1]/td[1]")).getText();
		String column2=driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr[1]/td[2]")).getText();
		String column3= driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[3]")).getText();
		String column4= driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[4]")).getText();
		String column5= driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[5]")).getText();
		System.out.println(column1+"  "+column2+ "  "+column3+" "+column4+ "  "+column5);
		Thread.sleep(5000);
		driver.quit();
	}

}
