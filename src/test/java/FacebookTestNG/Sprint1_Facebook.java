package FacebookTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.excel.reader.utility.Xlsx_Reeader_EAL;

import POM_Facebook.LogInPage;
import POM_Facebook.SignUpPage;
import Utilities_Package.Utilities;

public class Sprint1_Facebook extends Utilities {
  @Test(dataProvider="Signup")
  public void SignUp(String Firstname, String Lastname, String Emailaddress, String Phonenumber) throws InterruptedException {
	  
	  LogInPage hp= new LogInPage(driver);
	  hp.createNewAccount();
	  
	  SignUpPage sp = new SignUpPage(driver);
	  sp.firstnameSendKeys(Firstname);
	  Thread.sleep(2000);
	  sp.lastnameSendKeys(Lastname);
	  Thread.sleep(2000);
	  sp.emailSendKeys(Emailaddress);
	  Thread.sleep(2000);
	  sp.passwordSendKeys(Phonenumber);
	  Thread.sleep(2000);
	  sp.monthClick();
	  Thread.sleep(2000);
	  sp.dayClick();
	  Thread.sleep(2000);
	  sp.yearClick();
	  Thread.sleep(2000);
	  sp.femaleClick();
	  Thread.sleep(2000);
	  sp.maleClick();
	  Thread.sleep(2000);
	  sp.customClick();
	  Thread.sleep(2000);
	  sp.signUpClick();
	  sp.crossClick();
	    
	  
  }
  
  @DataProvider(name ="Signup")
  public Object[][] SignupData(){
	  String UD = System.getProperty("user.dir");
	  String ExcelFilePath = UD+"\\EXCEL.xlsx";
	  Xlsx_Reeader_EAL reader = new Xlsx_Reeader_EAL(ExcelFilePath);
	 Object[][] data = reader.getSheetData("SignUp");
	 return data; 
  }
}
