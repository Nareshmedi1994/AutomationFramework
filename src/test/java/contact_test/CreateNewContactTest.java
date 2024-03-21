package contact_test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.ContactInfoPage;
import ObjectRepository.ContactPage;
import ObjectRepository.CreateNewContactPage;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import genericUtilities.BaseClass;
import genericUtilities.PropertyFileUtility;
import genericUtilities.SeleniumFileUtility;
import genericUtilities.excelFileUtility;

public class CreateNewContactTest extends BaseClass {
@Test(groups = "SmokeSuite")
public void create_contact() throws IOException, InterruptedException {
	
		//PropertyFileUtility pUtil= new PropertyFileUtility();
		//excelFileUtility eUtil = new excelFileUtility();
		//SeleniumFileUtility sUtil =new SeleniumFileUtility();
		//Read data from property file
		//String URL = pUtil.readDataFromProertyFile("url");
		//String USERNAME = pUtil.readDataFromProertyFile("username");
		//String PASSWORD = pUtil.readDataFromProertyFile("password");
		//Read data From ExcelFile
		String LASTNAME = eUtil.readDataFromExcel("Contacts", 1, 2);
		//WebDriver driver = new ChromeDriver();
		//sUtil.maximizeWindow(driver);
		//sUtil.addImplicitlyWait(driver);
		//driver.get(URL);
		// login to application
		//LoginPage lp= new LoginPage(driver);
		//lp.loginToApp(USERNAME, PASSWORD);
		//navigate to Contact Link
		HomePage hp =new HomePage(driver);
		hp.ClickOnContactLink();
		//click on contact lookup image
		ContactPage cp= new ContactPage(driver);
		cp.CreateContactLink();
		// Create Contact with mandatory fields and save
		CreateNewContactPage cncp = new CreateNewContactPage(driver);
		cncp.CreateNewContact(LASTNAME);
		// validate for the COntact
		ContactInfoPage cip = new ContactInfoPage(driver);
		String ContactHeader = cip.ContactHeaderText();
		System.out.println(ContactHeader);
		if(ContactHeader.contains(LASTNAME)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		// logout of Application
		//hp.LogOutOfApp(driver);
		//System.out.println("Successfully Signout");
		//close Application
		driver.quit();
		
	}
	

}
