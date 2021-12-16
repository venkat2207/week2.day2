package week2.day2.Assignments;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignmentsLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		
		HttpURLConnection huc = null;
		int respCode = 200;

        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Link.html");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Go to Home Page")).click();
		
		
		//how many links available in this page
		
        //Storing the links in a list and traversing through the links
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // This line will print the number of links and the count of links.
        System.out.println("No of links are "+ links.size()); 
		
		
		
		
		
		
		
		
		
		
		
		
		WebElement brokenLink = driver.findElement(By.linkText("Verify am I broken?"));
		
		
		String url = brokenLink.getAttribute("href");
		
		System.out.println(url);
		
		
		huc = (HttpURLConnection)(new URL(url).openConnection());

		huc.setRequestMethod("HEAD");

		huc.connect();

		respCode = huc.getResponseCode();

		if(respCode >= 400){
		System.out.println(url+" is a broken link");
		}
		else{
		System.out.println(url+" is a valid link");
		}
		
		

	}

}
