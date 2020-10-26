package assi;

import org.bouncycastle.asn1.DERApplicationSpecific;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demoactitime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	    driver.findElement(By.xpath("//div[.='Login ']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//div[@class='menuTable']//div[contains(@class,'topMenuButton')])[2]")).click();
	    driver.findElement(By.xpath("//a[.='Types of Work']")).click();
	    driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
	    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("shubi");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[.='ankita']/../../td[@class='listtblcell lastInRow']")).click();	    
	}
}
