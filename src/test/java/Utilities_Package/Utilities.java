package Utilities_Package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Utilities {
   
	public static WebDriver driver;
	
  @Parameters({"browser","urladdress"})
  @BeforeClass()
  public void browserInitialization(String NameOfTheBrowser, String Url) {
	  
	 String UD = System.getProperty("user.dir");
	 
	 if(NameOfTheBrowser.equalsIgnoreCase("chrome")) {
		 System.setProperty("webdriver.chrome.driver", UD+"\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get(Url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		 }
		
		 else if(NameOfTheBrowser.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver", UD+"\\Drivers\\msedgedriver.exe");
			driver= new EdgeDriver();
			driver.get(Url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 }
		 
	 }
  

  @AfterClass
  public void afterClass() {
	  Screenshot("Google");
	  
  }
  
  public void Screenshot(String Folder) {
	  String UD=System.getProperty("user.dir");
			Date Dateformat = new Date();
			String DATE =Dateformat.toString().replace(":","_").replace(" ","_");
			
			File SS =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileHandler.copy(SS,new File(UD+"\\Screenshots\\"+Folder+"\\"+DATE+Folder+".jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); }
  }

}
