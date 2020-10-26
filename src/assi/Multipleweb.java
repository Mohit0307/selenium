package assi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Multipleweb
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://www.myntra.com/");
	    Thread.sleep(10000);
	    List<WebElement> links=driver.findElements(By.xpath("//a"));
	   System.out.println(links.size());
	   for(int i=0;i<links.size();i++)
	   {
	   //System.out.println(links.get(i).getText());//
	   System.out.println(links.get(i).getAttribute("herf"));
	   }
	   driver.close();
	}
}
