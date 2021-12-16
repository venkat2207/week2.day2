package week2.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignmentsRadio {

	public static void main(String[] args) {
		
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/radio.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("yes")).click();
		
		
		WebElement btn1 = driver.findElement(By.xpath("(//label[text()='Find default selected radio button']/following::input)[1]"));
		
		WebElement btn2 = driver.findElement(By.xpath("(//label[text()='Find default selected radio button']/following::input)[2]"));
		
		WebElement btn3 = driver.findElement(By.xpath("(//label[text()='Find default selected radio button']/following::input)[3]"));
		
		WebElement btn4 = driver.findElement(By.xpath("(//label[text()='Find default selected radio button']/following::input)[4]"));
		
		//btn1.click();
		
       if ( btn1.isSelected())
    	   
       {
    	   System.out.println("Unchecked is selected by default");
    	   
       }

       
      if ( btn2.isSelected())
    	   
       {
    	   System.out.println("Checked is selected by default");
    	   
       }
		
	
      if (! btn3.isSelected())
    	  
      {
    	  btn3.click();
    	  
      }
		
		

	}

}
