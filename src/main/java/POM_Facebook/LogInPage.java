package POM_Facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
    
	WebDriver driver;
	
	@FindBy(css="input[id='email']") WebElement Email;
	@FindBy(css= "input[id='pass']") WebElement Password;
	@FindBy(xpath="//button[contains(@id, 'u_0_5')]") WebElement Login;
	@FindBy(xpath ="//a[contains(@id,'u_0_0')]")  WebElement CreateNewAccount;
	@FindBy(xpath ="//a[text()='Forgot password?']") WebElement ForgotPassword;
	
	
	public void emailfield(String emailaddress) throws InterruptedException {
		Email.click();
		Email.clear();
		Thread.sleep(2000);
		Email.sendKeys(emailaddress);
	}
	
	public void passwordfield(String password) throws InterruptedException {
		Password.click();
		Password.clear();
		Thread.sleep(2000);
		Password.sendKeys(password);
	}
	
	public void loginClick() {
		Login.click();
	}
	
	public void VerifyLink() {
		 List<WebElement> alllink = driver.findElements(By.tagName("a"));
		int links = alllink.size();
		System.out.println(links);
	}
	
	public void createNewAccount() {
		CreateNewAccount.click();
	}
	
	public void forgotPasswordClick() {
		Actions act = new Actions(driver);
		act.moveToElement(ForgotPassword).build().perform();
		act.keyDown(Keys.SHIFT).click().build().perform();
		act.keyUp(Keys.SHIFT).build().perform();
		
	}
	
	public LogInPage(WebDriver driver ) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
}
