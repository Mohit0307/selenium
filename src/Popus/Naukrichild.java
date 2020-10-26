package Popus;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Naukrichild {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	     driver.manage().window().maximize();
	    driver.get("https://www.naukri.com/");
	    Set<String> allwindows=driver.getWindowHandles();
	    System.out.println(allwindows.size());
	    ArrayList<String> al=new ArrayList<>();
	    al.addAll(allwindows);
	    System.out.println(al.size());
	    driver.switchTo().window(al.get(1));
	    System.out.println(driver.getTitle());
	    driver.switchTo().window(al.get(2));
	    System.out.println(driver.getTitle());
	    Thread.sleep(2000);
	    driver.close();

	}

}
