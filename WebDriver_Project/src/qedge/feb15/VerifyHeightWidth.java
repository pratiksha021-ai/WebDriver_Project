package qedge.feb15;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyHeightWidth {

	public static void main(String[] args) throws Throwable {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://orangehrm.qedgetech.com/");
//		Thread.sleep(5000);
//		//1. find element
//		//2. find dimensions
//		//3. print dimentsions i.e. height, width
//		
//		WebElement userName=driver.findElement(By.name("txtUsername"));
//		Dimension userNameDim = userName.getSize();
//	System.out.println(userNameDim.height+"  "+userNameDim.width);
//		
//		WebElement button= driver.findElement(By.name("Submit"));
//		Dimension btnDim = button.getSize();
//		System.out.println(btnDim.height+"  "+btnDim.width);
//		driver.quit();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		WebElement userName=driver.findElement(By.name("txtUsername"));
		Dimension userNameDim = userName.getSize();
		System.out.println(userNameDim.height+"  "+userNameDim.width);
		
		WebElement button= driver.findElement(By.id("txtPassword"));
		Dimension bDimension=button.getSize();
		System.out.println(bDimension.height+"     "+bDimension.width);
		driver.quit();
		
		
		

	}

}
