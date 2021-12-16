package week2.day2.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignmentsDropdown {

	public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		

        WebElement programIndex=driver.findElement(By.id("dropdown1"));
        
        Select dropdownIndex=new Select(programIndex);
        
        dropdownIndex.selectByIndex(1);
        
        
        
        WebElement programText=driver.findElement(By.name("dropdown2"));
        
        Select dropdownText=new Select(programText);
        
        dropdownText.selectByVisibleText("UFT/QTP");
        
        
        WebElement programValue=driver.findElement(By.id("dropdown3"));
        
        Select dropdownValue=new Select(programValue);
        
        dropdownValue.selectByValue("1");
        
        
        WebElement programOptions = driver.findElement(By.className("dropdown"));
        
        Select dropdownOptions=new Select(programOptions);
        
        List<WebElement> l = dropdownOptions.getOptions();
        
        System.out.println(l.size());
        
        
        driver.findElement(By.xpath(" //option[text()='You can also use sendKeys to select']/parent::select")).sendKeys("Loadrunner");
        
      //option[text()='Select your programs']/following-sibling::option[1]
        
        Actions builder=new Actions(driver);
        
        WebElement item1 = driver.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option[1]"));
        
        WebElement item3 = driver.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option[3]"));
        
        builder.keyDown(Keys.CONTROL).click(item1).click(item3).keyUp(Keys.CONTROL).perform();
        
        
        
        
        
		
		
		
	}

}
