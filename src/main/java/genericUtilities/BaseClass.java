package genericUtilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;

public class BaseClass {
	public PropertyFileUtility pUtil= new PropertyFileUtility();
	public excelFileUtility eUtil = new excelFileUtility();
	public SeleniumFileUtility sUtil =new SeleniumFileUtility();
	public WebDriver driver;
	
	public static WebDriver sdriver;
	@BeforeSuite(alwaysRun = true)
	public void bsConfig() {
		System.out.println("------DB connection Successfull----");
	}
	@BeforeClass(alwaysRun = true)
	public void bcConfig() throws IOException {
		String URL= pUtil.readDataFromProertyFile("url");
		driver=new EdgeDriver();
		sUtil.maximizeWindow(driver);
		sUtil.addImplicitlyWait(driver);
		driver.get(URL);
	//for listners
	sdriver=driver;
		System.out.println("----Browser Launch Successfull");
		
	}
	@BeforeMethod(alwaysRun = true)
	public void bmConfig() throws IOException {
		String USERNAME = pUtil.readDataFromProertyFile("username");
		String PASSWORD = pUtil.readDataFromProertyFile("password");
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(USERNAME, PASSWORD);
		System.out.println("----Login to App Successfull----");
	}
	@AfterMethod(alwaysRun = true)
	public void amConfig() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.LogOutOfApp(driver);
		System.out.println("---logout of app success full---");
	}
	
	@AfterClass(alwaysRun = true)
	public void acConfig() {
		driver.quit();
		System.out.println("---browser closer successful----");
	}
	
	    
	@AfterSuite(alwaysRun = true)
	public void asConfig() {
		System.out.println("----DB Closed succssfull----");
	}
	

}
