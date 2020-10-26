package assi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Filehippo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://filehippo.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.id("onesignal-slidedown-cancel-button")).click();
	    driver.findElement(By.xpath("//a[.='Popular software']")).click();
	    driver.findElement(By.xpath("//p[.='VLC Media Player 64-bit']/../../../../..//span[.='Download']")).click();
	    driver.findElement(By.xpath("//h1[.='VLC Media Player 64-bit']/../../../..//a[.='Download Latest Version']")).click();
	    Robot r =new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_TAB);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	}

}
