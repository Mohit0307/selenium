package assi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Instname {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://www.instagram.com/");
	    Thread.sleep(5000);
	    driver.findElement(By.name("username")).sendKeys("mohit sharma");
	    driver.findElement(By.name("password")).sendKeys("mannu");
	    driver.findElement(By.linkText("Sign up")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.name("emailOrPhone")).sendKeys("akku");
	    driver.findElement(By.name("fullName")).sendKeys("akku sharma");
	    driver.findElement(By.name("username")).sendKeys("akku@93");
	    driver.findElement(By.name("password")).sendKeys("qwaszx");
	    driver.close();

	}

}
