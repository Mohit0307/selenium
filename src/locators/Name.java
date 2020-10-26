package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Name {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://facebook.com");
	    driver.findElement(By.name("email")).sendKeys("Taniya");
	    driver.close();

	}

}
