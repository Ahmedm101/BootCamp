package POM_Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class ForgetPasswordPage {
     
	WebDriver driver;
	
	@FindBy(xpath="(//input[@name='email'])[2]") WebElement Emailfield;
	@FindBy(css="button[id='did_submit']") WebElement Searchbtn;
	
	public void emailFieldClick(String email) {
		Emailfield.click();
		Emailfield.clear();
		Emailfield.sendKeys(email);
	}
	
	public void searchbtnClick() {
		Searchbtn.click();
	}
	
	public ForgetPasswordPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
}
