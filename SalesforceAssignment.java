package week2.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceAssignment {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("UserFirstName")).sendKeys("venkat");
		
		driver.findElement(By.name("UserLastName")).sendKeys("bala");
		
		driver.findElement(By.name("UserEmail")).sendKeys("ven123@gmail.com");
		
		
        WebElement eleJobTitle=driver.findElement(By.name("UserTitle"));
        
        Select dropdownJobTitle=new Select(eleJobTitle);
        
        dropdownJobTitle.selectByIndex(5);
        
        
        driver.findElement(By.name("CompanyName")).sendKeys("NEXT");
        
        
        WebElement eleEmployees=driver.findElement(By.name("CompanyEmployees"));
        
        Select dropdownEmployees=new Select(eleEmployees);
        
        dropdownEmployees.selectByValue("250");
        
        
        driver.findElement(By.name("UserPhone")).sendKeys("7094142196");
        
        
        WebElement eleCompanyCountry=driver.findElement(By.name("CompanyCountry"));
        
        Select dropdownCompanyCountry=new Select(eleCompanyCountry);
        
        dropdownCompanyCountry.selectByVisibleText("India");
        
        
        driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
        
         driver.close();       	
		

	}

}
