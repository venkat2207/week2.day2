package week2.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignmentsButton {

	public static void main(String[] args) {
		

        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Button.html");
		
		//driver.manage().window().maximize();
		
		//driver.findElement(By.id("home")).click();
		
		
		WebElement element = driver.findElement(By.id("position"));
		  
		Point location = element.getLocation();
		
		int x = location.getX();
		
		int y = location.getY();
		
		System.out.println("Coordinates of an element is : " + x + " and " + y);
		
		String buttonColor = driver.findElement(By.id("color")).getCssValue("background-color");
        
		System.out.println("Button color: " + buttonColor);
		
		
        WebElement Image = driver.findElement(By.id("size"));
        
        //Get width of element.
        int ImageWidth = Image.getSize().getWidth();
        System.out.println("Image width Is "+ImageWidth+" pixels");
        
        //Get height of element.
        int ImageHeight = Image.getSize().getHeight();        
        System.out.println("Image height Is "+ImageHeight+" pixels");
		

	}

}
