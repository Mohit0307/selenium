package assi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Yahhos {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://login.yahoo.com/account/create?src=noSrc&specId=yidReg");
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector("input[class='ureg-fname input-with-icon icon-name ']")).sendKeys("Mohit");
	    driver.findElement(By.cssSelector("input[id='usernamereg-lastName'")).sendKeys("sharma");
	    driver.findElement(By.cssSelector("input[name='yid']")).sendKeys("sharma123mohit");
	    driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("qazwsxedc");
	    driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("9898998787");
	    driver.findElement(By.cssSelector("input[name='freeformGender']")).sendKeys("male");	
	}

}
