package POM_Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class SignUpPage {
     
	WebDriver driver;
	Select ob;
	
	
	@FindBy(xpath ="//input[@name='firstname']") WebElement FirstName;
	@FindBy(xpath ="//input[@name='lastname']") WebElement LastName;
	@FindBy(xpath ="//input[@name='reg_email__']") WebElement Email;
	@FindBy(xpath="//input[@name='reg_passwd__']") WebElement Password;
	@FindBy(xpath="//select[@id='month']") WebElement Month;
	@FindBy(xpath ="//select[@id='day']") WebElement Day;
	@FindBy(xpath="//select[@id='year']") WebElement Year;
	@FindBy(xpath="(//input[@name='sex'])[1]") WebElement Female;
	@FindBy(xpath="(//input[@name='sex'])[2]") WebElement Male;
	@FindBy(xpath ="(//input[@name='sex'])[3]") WebElement Custom;
	@FindBy(xpath="//button[@name='websubmit']") WebElement SignUp;
	@FindBy(xpath="//div[@class='_8ien']/child::img") WebElement Cross;
	
	public void firstnameSendKeys(String name) {
		FirstName.click();
		FirstName.clear();
		FirstName.sendKeys(name);
	}
	
	public void lastnameSendKeys(String name) {
		LastName.click();
		LastName.clear();
		LastName.sendKeys(name);
	}
	
	public void emailSendKeys(String email) {
		Email.click();
		Email.clear();
		Email.sendKeys(email);
		
	}
	
	public void passwordSendKeys(String password) {
		Password.click();
		Password.clear();
		Password.sendKeys(password);
	}
	
	public void monthClick() {
		ob= new Select(Month);
		ob.selectByIndex(5);
	}
	
	public void dayClick() {
		ob = new Select(Day);
		ob.selectByValue("20");
	}
	
	public void yearClick() {
		ob= new Select(Year);
		ob.selectByVisibleText("1971");
	}
	
	public void femaleClick() {
		Female.click();
	}
	
	public void maleClick() {
		Male.click();
	}
	
	public void customClick() {
		Custom.click();
	}
	
	public void signUpClick() {
		SignUp.click();
	}
	
	public void crossClick() {
		Cross.click();
	}
	
	public SignUpPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
