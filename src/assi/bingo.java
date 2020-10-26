package assi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class bingo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://www.bing.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(4000);
	    WebElement ss=driver.findElement(By.xpath("//input[@name='q']"));
	    ss.sendKeys("oneplus");
	    List<WebElement>sus=driver.findElements(By.xpath("//span[contains(text(),'oneplus')]"));
        System.out.println(sus.size());
        for(int i=0;i<2;i++){
        	Thread.sleep(1000);
        	ss.sendKeys(Keys.ARROW_DOWN);
        }
        ss.sendKeys(Keys.ENTER);
	}

}
