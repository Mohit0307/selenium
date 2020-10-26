package assi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Uploadcv {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.naukri.com/");
         driver.findElement(By.id("wdgt-file-upload")).click();
         StringSelection file=new StringSelection("D:\\class\\pen drive\\Mohit.doc");
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_V);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ENTER);
        }

}
