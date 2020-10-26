package assi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Jspiders 
{
     public static void main(String[] args) throws InterruptedException
	{
    	 System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
 	    WebDriver driver = new EdgeDriver();
 	    driver.get("https://www.jspiders.com/");
 	    Thread.sleep(1000);
 	    driver.findElement(By.xpath("//span[.='Contact']")).click();
 	    Thread.sleep(2000);
 	   joj;k driver.findElement(By.xpath("")).getText();

	}
     

}
