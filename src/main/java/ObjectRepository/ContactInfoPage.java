package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInfoPage {////rule 1: create separate POM class for every web page
	
	//Rule 2: Identify web elements using @FindBy
	@FindBy(xpath ="//span[@class='dvHeaderText']") private WebElement ContactHeaderText;
	
	//Create Constructor
	public ContactInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// provide gettors

	public WebElement getHeader() {
		return ContactHeaderText;
	}
	// Business Library
	
	public String ContactHeaderText() {
		return ContactHeaderText.getText();
		
	}
	

}
