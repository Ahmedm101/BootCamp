package FacebookTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM_Facebook.SignUpPage;
import Utilities_Package.Utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class Sprint2_Facebook extends Utilities {
  @Test(dataProvider = "signUpDataCollection")
  public void signUpInvalidcredentials(String Email , String Password) throws InterruptedException {
	  
	  SignUpPage sp = new SignUpPage(driver);
	  sp.emailfield(Email);
	  Thread.sleep(2000);
	  sp.passwordfield(Password);
	  Thread.sleep(2000);
	  sp.loginClick();
	  Thread.sleep(3000);
	  errordispalyingScreenshot();
	  driver.navigate().back();
	  Thread.sleep(3000);
      sp.VerifyLink();
    
	  
  }

  @DataProvider
  public Object[][] signUpDataCollection(){
	 return new Object[][] {
		  new Object[] { "abc345@gmail.com", "wer1234" },
	      new Object[] { "hulip90@gmail.com", "b789200!" },
	      new Object[] {"","abcry67"},
	      new Object[] {"hulip90@gmail.com", ""},
	      new Object[] {"abhy", "123adcyt"}
		 
	 };
  }
  
}
