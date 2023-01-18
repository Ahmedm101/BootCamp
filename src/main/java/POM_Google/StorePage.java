package POM_Google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorePage {
	

		WebDriver driver;
		
		@FindBy(xpath="(//div[@class='mqn3-template-enrichment-grid-videos__grid__cell__video-content__eyebrow'])[2]/child::font") WebElement Doorbell;
		
		public void doorbellClick() {
			Doorbell.click();
		}
		
		public StorePage (WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	}

