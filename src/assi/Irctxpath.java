package assi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Irctxpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://www.irctc.co.in/nget/profile/user-registration");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
	    driver.findElement(By.cssSelector("//input[@formcontrolname='userName']")).sendKeys("Mannu sharma");
	    driver.findElement(By.cssSelector("//input[@formcontrolname='usrPwd']")).sendKeys("qwaszx");
	    driver.findElement(By.cssSelector("//input[@formcontrolname='cnfUsrPwd']")).sendKeys("qwaszx");
	    driver.findElement(By.cssSelector("//input[@formcontrolname='secAns']")).sendKeys("kaku");
	    driver.findElement(By.cssSelector("//input[@formcontrolname='firstName']")).sendKeys("Mannu");
	    driver.findElement(By.cssSelector("//input[@formcontrolname='middleName']")).sendKeys("pandit");
	    driver.findElement(By.cssSelector("//input[@formcontrolname='lastname']")).sendKeys("sharma");

	}

}
