package assi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://login.yahoo.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input[autocomplete='username']")).sendKeys("Mohit sharma");
	    driver.close();

	}

}
