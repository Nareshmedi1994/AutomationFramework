package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {//rule 1: create separate POM class for every web page
	
	//Rule 2: Identify web elements using @FindBy
	  @FindBy(name="user_name") private WebElement UserNameEdit;
	  @FindBy(name="user_password") private WebElement PasswordEdit;
	  @FindBy(id="submitButton") private WebElement LoginBtn;
	//Rule 3: create constructor
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//rule4:provide getters
	public WebElement getUserNameEdit() {
		return UserNameEdit;
	}
	public WebElement getPasswordEdit() {
		return PasswordEdit;
	}
	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	/**
	 * bussiness library - Generic Methods related to project
	 * @param USERNAME
	 * @param PASSWORD
	 */
	public void loginToApp(String USERNAME, String PASSWORD) {
		UserNameEdit.sendKeys(USERNAME);
		PasswordEdit.sendKeys(PASSWORD);
		LoginBtn.click();
	}
	

}
