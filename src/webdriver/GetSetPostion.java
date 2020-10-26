package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetSetPostion {

	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
    WebDriver driver = new EdgeDriver();
    System.out.println(driver.manage().window().getPosition().getX());
    System.out.println(driver.manage().window().getPosition().getY());
   Point p=new Point(40, 80);
   driver.manage().window().setPosition(p);
   System.out.println(driver.manage().window().getPosition().getX());
   System.out.println(driver.manage().window().getPosition().getY());
}
	
	
}