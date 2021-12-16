package week2.day2.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssignment {

	   public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create New Account")).click();
		
	
		Thread.sleep(1000);
		
		
		//driver.findElement(By.name("firstname")).sendKeys("values to send");
		
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("venkat");
		
		driver.findElement(By.name("firstname")).sendKeys("venkat");
		
		driver.findElement(By.name("lastname")).sendKeys("bala");
		
		
		driver.findElement(By.name("reg_email__")).sendKeys("7094142196");
		
		driver.findElement(By.id("password_step_input")).sendKeys("john");
		
		//selecting  Day
		    

        WebElement eleDay=driver.findElement(By.id("day"));
        
        Select dropdownDay=new Select(eleDay);
        
        dropdownDay.selectByValue("28");
        
        
      //selecting Month
        
       WebElement eleMonth=driver.findElement(By.id("month"));
        
       Select dropdownMonth=new Select(eleMonth);
        
       dropdownMonth.selectByIndex(0);
        
      //selecting Year
        
        WebElement eleYear=driver.findElement(By.id("year"));
        
        Select dropdownYear=new Select(eleYear);
        
        dropdownYear.selectByValue("1990");
        
        
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        
        
	
		
		
	}

}
