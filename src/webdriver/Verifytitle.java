package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Verifytitle {

	public static void main(String[] args) {
		  System.setProperty("webdriver.edge.driver","E:/msedgedriver.exe");
		   WebDriver driver=new EdgeDriver();
		   driver.get("https://www.facebook.com");
		   String acutaltitle = driver.getTitle();
		   if(acutaltitle.equalsIgnoreCase("facebook"))
		   {
			   System.out.println("title are matching");
		   }
		   else
		   {
			   System.out.println("title are not Matching");
		   }
          driver.close();
	}

}
