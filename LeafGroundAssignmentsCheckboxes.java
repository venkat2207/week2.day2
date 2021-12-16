package week2.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignmentsCheckboxes {
	
	
	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
			
		ChromeDriver driver=new ChromeDriver();
			
		driver.get("http://leafground.com/pages/checkbox.html");
			
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		
		
		WebElement checked = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
		
		if(checked.isSelected())
		{
			
			System.out.println("its checked");
			
		}
		
		WebElement deselectOne = driver.findElement(By.xpath("(//input[@type='checkbox'])[7]"));
		
		WebElement deselectTwo = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
		
		if (deselectOne.isSelected())
			
		{
			deselectOne.click();
			
		}
		
       if (deselectTwo.isSelected())
			
		{
			deselectTwo.click();
			
		}
		
       driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
       driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
       driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
       driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
       driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
		
	}

}
