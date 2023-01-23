package FacebookTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM_Facebook.LogInPage;
import Utilities_Package.Utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class Sprint2_Facebook extends Utilities {
	
  @Test(dataProvider = "FacebookLogIn")
  public void LogIn(String Email , String Password) throws InterruptedException {
	 //verifying the url
	 String Url = driver.getCurrentUrl();
	 String FrsUrl ="https://www.facebook.com/";
	 SoftAssert ob = new SoftAssert();
	 ob.assertNotEquals(Url, FrsUrl);
	 
	  LogInPage sp = new LogInPage(driver);
	  sp.emailfield(Email);
	  Thread.sleep(2000);
	  sp.passwordfield(Password);
	  Thread.sleep(2000);
	  sp.loginClick();
	  Thread.sleep(3000);
	  driver.navigate().back();
	  Thread.sleep(3000);
      
	  //verifying the Link of the page 
	  sp.VerifyLink();
    
	  ob.assertAll();
  }

  @DataProvider(name ="FacebookLogIn")
  public Object[][] facebookLogInData (){
	 return new Object[][] {
		  new Object[] { "abc345@gmail.com", "wer1234" },
	      new Object[] { "hulip90@gmail.com", "b789200!" },
	      new Object[] {"","abcry67"},
	      new Object[] {"hulip90@gmail.com", ""},
	      new Object[] {"abhy", "123adcyt"}
		 
	 };
  }
  
}
