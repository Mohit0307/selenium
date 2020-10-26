package Popus;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Windowhandels {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	     driver.manage().window().maximize();
	    driver.get("https://www.naukri.com/");
	   System.out.println(driver.getWindowHandle());
	   Set<String> allwindows= driver.getWindowHandles();
	   System.out.println(allwindows);
	   

	}

}
