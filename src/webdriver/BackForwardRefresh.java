package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BackForwardRefresh {

	public static void main(String[] args) {
		   System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
		   WebDriver driver=new EdgeDriver();
		   driver.navigate().to("https://www.flipkart.com");
		   driver.navigate().to("https://www.myntra.com");
		   driver.navigate().back();
		   driver.navigate().refresh();
		   driver.navigate().forward();
		   
	}

}
