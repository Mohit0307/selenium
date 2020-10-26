package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Id 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://facebook.com");
	    /*WebElement username= driver.findElement(By.id("email"));
	    username.sendKeys("Mohit");*/
	    driver.findElement(By.id("email")).sendKeys("Mannu");
	    driver.close(); 

	}

}
