package Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://facebook.com");
	    WebElement forget= driver.findElement(By.xpath("//a[.='Forgotten password?']"));
        Actions act=new Actions(driver);
        act.doubleClick(forget).perform();

	}

}
