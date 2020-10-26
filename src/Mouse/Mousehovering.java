package Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehovering {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	     driver.manage().window().maximize();
	    driver.get("https://www.myntra.com/");
	    WebElement offers= driver.findElement(By.xpath("//a[.='Offers']"));
	    Actions act=new Actions(driver);
	    act.moveToElement(offers).perform();
	    Thread.sleep(2000);
	    WebElement watchs = driver.findElement(By.xpath("//a[.='Watches at Min 60%']"));
	    act.moveToElement(watchs).click().perform();
	   	}
	}
