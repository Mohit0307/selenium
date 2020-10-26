package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetSetSize {

	public static void main(String[] args) {
		   System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
		   WebDriver driver= new EdgeDriver();
		   System.out.println(driver.manage().window().getSize());
		   Dimension d=new Dimension(200, 400);
		   driver.manage().window().setSize(d);
		   System.out.println(driver.manage().window().getSize());
	}

}
