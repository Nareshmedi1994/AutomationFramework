package ObjectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import genericUtilities.SeleniumFileUtility;

public class CreateNewContactPage extends SeleniumFileUtility {//rule 1: create separate POM class for every web page
	
	//Rule 2: Identify web elements using @FindBy
	@FindBy (name="lastname") private WebElement LastNameEdit;
	@FindBy (xpath="//input[@title='Save [Alt+S]']") private WebElement SaveBtn;
	@FindBy(xpath = "//select[@name='leadsource']") private WebElement LeadSourceDropDown;
	
	// Create Constructor
	public CreateNewContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// provide gettors

	public WebElement getLastNameEdit() {
		return LastNameEdit;
	}

	public WebElement getLeadSourceDropDown() {
		return LeadSourceDropDown;
	}
	public WebElement getSaveBtn() {
		return SaveBtn;
	}
	public void SaveBtn() {
		SaveBtn.click();
	}
	// BUSINESS LIBRARY
	/**
	 * this method will create new contact and save 
	 */
	public void CreateNewContact(String LASTNAME) {
		LastNameEdit.sendKeys(LASTNAME);
		SaveBtn.click();
		
	}
	public void CreateNewContact(String LASTNAME, String LEADSOURCE) {
		LastNameEdit.sendKeys(LASTNAME);
		HandleDropDoen(LeadSourceDropDown, LEADSOURCE);
		SaveBtn.click();
	}
}
