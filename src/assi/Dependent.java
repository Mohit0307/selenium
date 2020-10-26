package assi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Dependent
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://www.selenium.dev/downloads/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
	    

	}

}
