package assi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpathfaacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://facebook.com");
	    driver.findElement(By.xpath("//input[contains(@aria-label,'Email')]")).sendKeys("nikki sharma");
	    driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("123qwerds");
	    driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
	    driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile')]")).sendKeys("7527645266");
	    driver.findElement(By.xpath("//input[contains(@data-testid,'royal_email')]")).sendKeys("shubi");
	    driver.findElement(By.xpath("//input[contains(@data-testid,'royal_pass')]")).sendKeys("rajput");

	}

}
