package ObjectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import genericUtilities.SeleniumFileUtility;

public class HomePage extends SeleniumFileUtility {//rule 1: create separate POM class for every web page
	
	//Rule 2: Identify web elements using @FindBy
	@FindBy(linkText =  "Contacts") private WebElement ContactLink;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']") private WebElement AdministratorImg;
	@FindBy(xpath = "(//a[@class='drop_down_usersettings'])[2]") private WebElement SigoutLink;
	
	//Create Constructor
	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
    // provide gettors

	public WebElement getContactLink() {
		return ContactLink;
	}

	public WebElement getAdministratorImg() {
		return AdministratorImg;
	}

	public WebElement getSigoutBtn() {
		return SigoutLink;
	}
	//Business Library
	/**
	 * This method will click on Contact
	 */
	public void ClickOnContactLink() {
		ContactLink.click();
	}
	/**
	 * This Method Will perform Logout of Application
	 * @param driver
	 * @throws InterruptedException 
	 */
	public void LogOutOfApp(WebDriver driver) throws InterruptedException {
		mouseOverAction(driver, AdministratorImg);
		Thread.sleep(1000);
		SigoutLink.click();
		
	}
	
}
