package assi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpathyahho {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("sharma03mohit07@gmail.com");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("zxasqw");
	    driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
	    
	}

}
