package POM_Google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage {

	WebDriver driver;
	
	@FindBy(xpath="(//div[@class='hdtb-mitem hdtb-msel']/following-sibling::div/descendant::a)[2]")  WebElement Shopping;
	
	public void shoppingClick() {
		Shopping.click();
	}
	
	public ComputerPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
