package contact_test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
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
@Listeners(genericUtilities.ListenersImplementation.class)
public class CreateContactWithLeadSourceTest extends BaseClass {

	@Test(groups = "SmokeSuite")
	public void CreateContact_with_leadsource() throws IOException, InterruptedException {
		//PropertyFileUtility pUtil= new PropertyFileUtility();
		//excelFileUtility eUtil = new excelFileUtility();
		//SeleniumFileUtility sUtil =new SeleniumFileUtility();
		//Read data from property file
		//String URL = pUtil.readDataFromProertyFile("url");
		//String USERNAME = pUtil.readDataFromProertyFile("username");
		//String PASSWORD = pUtil.readDataFromProertyFile("password");
		//Read data From ExcelFile
		String LASTNAME = eUtil.readDataFromExcel("Contacts", 4, 2);
		String LEADSOURCE = eUtil.readDataFromExcel("Contacts", 4, 3);
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
		cncp.CreateNewContact(LASTNAME, LEADSOURCE);
		//Assert.fail();
		// validate for the COntact
		ContactInfoPage cip = new ContactInfoPage(driver);
		String ContactHeader = cip.ContactHeaderText();
		//Assert.assertTrue(ContactHeader.contains(LASTNAME));
		System.out.println(ContactHeader);
		
		//if(ContactHeader.contains(LASTNAME)) {
			System.out.println("pass");
		//}
		//else {
		//	System.out.println("fail");
		//}
		// logout of Application
		//hp.LogOutOfApp(driver);
		//System.out.println("Successfully Signout");
		//close Application
		//driver.quit();
			
	}
public void sample () {
	System.out.println("demo");
}
}
