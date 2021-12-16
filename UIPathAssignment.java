package week2.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIPathAssignment {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://acme-test.uipath.com/login");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		
		System.out.println(driver.getTitle());

		Thread.sleep(300);
		
		
		driver.findElement(By.linkText("Log Out")).click();
		
	
		
		
		driver.close();
		
	}

}
