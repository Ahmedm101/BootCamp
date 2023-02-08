package POM_Google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	
	
	@FindBy(xpath="//input[@name='q']") WebElement SearchField;
	@FindBy(xpath = "//a[text()='About']") WebElement About;
	
	public void searchSendKeys(String item) {
		SearchField.click();
		SearchField.clear();
		SearchField.sendKeys(item);
		
	}
	
	public void searchfieldClick() {
		SearchField.click();
	} 
	
	public void aboutClick() {
		About.click();
	}
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
