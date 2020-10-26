package assi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpathnet {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://www.netflix.com/in/");
	    driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
	    driver.findElement(By.xpath("//input[contains(@autocomplete,'email')]")).sendKeys("Mannusharma");
	    driver.findElement(By.xpath("//input[contains(@data-uia,'password-field')]")).sendKeys("kdkhhk");
	    driver.findElement(By.xpath("//span[contains(text(),'Remember me')]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Need help?')]")).click();
	    driver.close();

	}

}
