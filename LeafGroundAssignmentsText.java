package week2.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignmentsText {

	public static void main(String[] args) {
	
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Edit.html");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("email")).sendKeys("abac@123.com");
		
		
		//WebElement element=driver.findElement(By.xpath("//input[@value='Append ']"));
		
		
	
		
		//String previousText = element.getAttribute("value");
		
		//element.clear();
		
		//element.sendKeys(previousText+ "abc");
		
		
		WebElement element = driver.findElement(By.xpath("//input[@value='Append ']"));
		
		element.sendKeys(" abc"+Keys.HOME);
		
		element.sendKeys(Keys.TAB);
		
		
		WebElement eleDefaultText = driver.findElement(By.xpath("//input[@value='TestLeaf']"));
		
		String defName = eleDefaultText.getAttribute("value");
		
		
		System.out.println(defName);
		
	    WebElement elementClear=driver.findElement(By.xpath("//input[@value='Clear me!!']"));
		
	    
	
		
		String textClear = element.getAttribute("value");
		
		elementClear.clear();
		
		//element.sendKeys(previousText + "abc");
		
		
		WebElement elementEnabled = driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input"));
		
		boolean enabled = elementEnabled.isEnabled();
		
		System.out.println(enabled);
		
		

	}

}
