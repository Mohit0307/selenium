package assi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Netflixname {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://www.netflix.com/in/");
	    driver.findElement(By.linkText("Sign In")).click();
	    driver.findElement(By.id("id_userLoginId")).sendKeys("sharma03mohit07@gmail.com");
	    driver.findElement(By.id("id_password")).sendKeys("mannu");

	}

}
