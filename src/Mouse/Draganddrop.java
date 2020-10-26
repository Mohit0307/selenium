package Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	     driver.manage().window().maximize();
	    driver.get("http://demo.guru99.com/test/drag_drop.html");
	    WebElement source= driver.findElement(By.xpath("//a[.=' BANK ']"));
	   WebElement target= driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']"));
	   Actions act= new Actions(driver);
	   act.dragAndDrop(source, target).perform();
	   WebElement ser= driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	   WebElement tat= driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	   Actions acct= new Actions(driver);
	   act.dragAndDrop(ser, tat).perform();
	}	
}
