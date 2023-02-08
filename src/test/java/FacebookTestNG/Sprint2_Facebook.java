package FacebookTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM_Facebook.ForgetPasswordPage;
import POM_Facebook.LogInPage;
import Utilities_Package.Utilities;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

public class Sprint2_Facebook extends Utilities {
	
  @Test(priority=1,dataProvider = "FacebookLogIn")
  public void LogIn(String Email , String Password) throws InterruptedException {
	 //verifying the url
	 String Url = driver.getCurrentUrl();
	 String FrsUrl ="https://www.facebook.com//";
	 SoftAssert ob = new SoftAssert();
	 ob.assertEquals(Url, FrsUrl);
	 
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
  
  
  @Test(priority=2, dependsOnMethods="LogIn")
  public void forgetPassword() throws InterruptedException {
	  LogInPage lp = new LogInPage(driver);
	  lp.forgotPasswordClick();
	Set<String> SessionIDs = driver.getWindowHandles();
	Iterator <String> it= SessionIDs.iterator();
	String ParentID =it.next();
	String ChildID = it.next();
	driver.switchTo().window(ChildID);
	Thread.sleep(5000);
	
	// i am having to do assert here for text how can we do on pom and call the method and assert it here ? please show 
   String url =	driver.getCurrentUrl(); 
   String FrsURL ="https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0";
   SoftAssert ob = new SoftAssert();
   ob.assertEquals(url,FrsURL);
  WebElement Text = driver.findElement(By.cssSelector("h2[class='uiHeaderTitle'"));
   String text =Text.getText();
	String FRS = "Find your account";
	ob.assertEquals(text, FRS);
	
	ForgetPasswordPage fp = new ForgetPasswordPage(driver);
	fp.emailFieldClick("tulips");
	Thread.sleep(2000);
	fp.searchbtnClick();
	Thread.sleep(2000);
	driver.navigate().back();
	driver.close();
	driver.switchTo().window(ParentID);

   
   ob.assertAll();
  }

  @DataProvider(name ="FacebookLogIn")
  public Object[][] facebookLogInDataInvalid (){
	 return new Object[][] {
		  new Object[] { "abc345@gmail.com", "wer1234" },
	      new Object[] { "hulip90@gmail.com", "b789200!" },
	      new Object[] {"","abcry67"},
	      new Object[] {"hulip90@gmail.com", ""},
	      new Object[] {"abhy", "123adcyt"}
		 
	 };
  }
  
}
