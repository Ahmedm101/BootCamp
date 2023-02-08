package GoogleTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import POM_Google.AboutPage;
import POM_Google.Homepage;
import POM_Google.ProductPage;
import Utilities_Package.Utilities;

public class Sprint2_Google extends Utilities {
  @Test
  public void f() throws InterruptedException {
	  
	  Homepage hp = new Homepage(driver);
	  hp.searchSendKeys("computer");
	  Actions mouse=new Actions(driver);
	  mouse.sendKeys(Keys.ENTER).build().perform();
	  driver.navigate().back();
	  hp.aboutClick();
	  AboutPage ap=new AboutPage(driver);
	  Thread.sleep(3000);
	  ap.productClick();
	  driver.navigate().back();
	 
	  
	  Thread.sleep(3000);
  List <WebElement> allLinks=  driver.findElements(By.tagName("a"));
  
  System.out.println(allLinks.size());
	
	  
	  
	
	  
	  
  }
}
