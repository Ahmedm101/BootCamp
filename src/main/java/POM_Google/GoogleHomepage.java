package POM_Google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomepage {
    
	WebDriver driver;
	
	@FindBy(xpath= "//a[text()='Store']") WebElement Store;
	@FindBy(css= "input[class='gLFyf']") WebElement Searchfield;
	@FindBy(xpath= "(//input[@class='gNO89b'])[1]") WebElement GoogleSearch;
	
	public void storeClick() {
		Store.click();
	}
	
	public void searchfieldSendkeys(String item) {
		Searchfield.click();
		Searchfield.clear();
		Searchfield.sendKeys(item);
	}
	
	public void googlesearchClick() {
		GoogleSearch.click();
	}
	
	public GoogleHomepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
