package assi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CSS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://facebook.com");
 driver.findElement(By.cssSelector("a[data-testid=open-registration-form-button]")).click();
 Thread.sleep(5000);
     driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Mohit");
     
     driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("shrama03mohit07@gmail.com");
     driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("qazwsx");
     
     
	   
		

	}

}
