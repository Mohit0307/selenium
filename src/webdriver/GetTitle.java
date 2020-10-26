package webdriver;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitle {

	public static void main(String[] args) {
		   System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
		   WebDriver driver = new EdgeDriver();
           driver.get("https://www.facebook.com");
           System.out.println(driver.getTitle());
           
	}

}
