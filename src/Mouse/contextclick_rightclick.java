package Mouse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextclick_rightclick {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://facebook.com");
	    WebElement forget= driver.findElement(By.xpath("//a[.='Forgotten password?']"));
        Actions act=new Actions(driver);
        act.contextClick(forget).perform();
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        

	}

}
