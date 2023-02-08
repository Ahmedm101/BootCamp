package POM_Google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {
 
	WebDriver driver;
	
	@FindBy(xpath ="(//ul[@id='list-1']/descendant::a)[3]") WebElement Product;
	
	
	public void productClick() {
		Product.click();
	}
	
	
	
	
	public  AboutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
}
