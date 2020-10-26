package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EnterURlEdge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.google.com");

	}

}
