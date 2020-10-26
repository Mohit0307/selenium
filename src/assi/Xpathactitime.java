package assi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpathactitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("akkku sharma");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("mnjgffj");
	    driver.findElement(By.xpath("//label[@for='keepLoggedInCheckBox']")).click();
	    driver.close();
	}

}
