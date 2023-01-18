package GoogleTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM_Google.ComputerPage;
import POM_Google.GoogleHomepage;
import POM_Google.StorePage;
import Utilities_Package.Utilities;

public class Sprint1_Google extends Utilities {
  @Test
  public void Test1() throws InterruptedException {
	String UrlofHomepage =  driver.getCurrentUrl();
	String FrsUrlofHomepage="https://www.google.com/";
	
	SoftAssert ob = new SoftAssert();
	ob.assertEquals(UrlofHomepage, FrsUrlofHomepage);
	
	GoogleHomepage hp = new GoogleHomepage(driver);
	hp.storeClick();
	Thread.sleep(3000);
	
	StorePage sp = new StorePage(driver);
	sp.doorbellClick();
	Thread.sleep(3000);
	
	String UrlofStorepage =  driver.getCurrentUrl();
	String FrsUrlofStorepage="https://store.google.com/us/product/nest_doorbell?hl=en-US";
	ob.assertEquals(UrlofStorepage, FrsUrlofStorepage);
	
    driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	
	hp.searchfieldSendkeys("computer");
	
	hp.googlesearchClick(); 
	
	ComputerPage cp = new ComputerPage(driver);
	cp.shoppingClick();
	
	ob.assertAll();
  }
}
