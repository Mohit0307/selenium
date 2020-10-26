package assi;

import java.security.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Googleautoseggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://www.google.com/?gws_rd=ssl");
	    WebElement ss= driver.findElement(By.xpath("//input[@type='text']"));
	    ss.sendKeys("cristiano");
	    Thread.sleep(2000);
	    List<WebElement>suss=driver.findElements(By.xpath("//span[contains(text(),'cristiano')]"));
        System.out.println(suss.size());
        for(int i=0;i<2;i++){
        	Thread.sleep(1000);
        	ss.sendKeys(Keys.ARROW_DOWN);
        }
        ss.sendKeys(Keys.ENTER);
	}

}
