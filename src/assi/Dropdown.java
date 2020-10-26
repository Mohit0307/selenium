package assi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://facebook.com");
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mohit sharma");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("shfhhidhdo");
	    driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	    //Thread.sleep(2000);
	    //WebElement dropdownlist=driver.findElement(By.xpath("//span[@data-type='selectors']"));
	    //Select sel=new Select(dropdownlist);
	    //sel.selectByValue("3");
	    //Select mon=new Select(dropdownlist);
	    //mon.selectByVisibleText("Jul");
	    //Select year=new Select(dropdownlist);
	    //year.selectByVisibleText("1996");//
	}
}
