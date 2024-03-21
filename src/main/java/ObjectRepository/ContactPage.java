package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {//rule 1: create separate POM class for every web page
	
	//Rule 2: Identify web elements using @FindBy
	@FindBy (xpath="//img[@title='Create Contact...']") private WebElement CreateContactLookUpImage;

	// Create Constructor
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// provide gettors

	public WebElement getCreateContactLInk() {
		return CreateContactLookUpImage;
	}
	// business library
	/**
	 * this method will click on create Contact Lookup Image
	 */
public void CreateContactLink() {
	CreateContactLookUpImage.click();
}
	
}
