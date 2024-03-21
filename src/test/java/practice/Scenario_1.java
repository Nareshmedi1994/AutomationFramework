package practice;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import ObjectRepository.LoginPage;
import genericUtilities.PropertyFileUtility;
import genericUtilities.SeleniumFileUtility;
import genericUtilities.excelFileUtility;

public class Scenario_1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		PropertyFileUtility putil = new PropertyFileUtility();
		excelFileUtility eUtil = new excelFileUtility();
		SeleniumFileUtility sUtil = new SeleniumFileUtility();
		//rEAD DATA FROM Property file
		String URL = putil.readDataFromProertyFile("url");
		String USERNAME = putil.readDataFromProertyFile("username");
		String PASSWORD = putil.readDataFromProertyFile("password");
		//Read data from Excel file
		eUtil.readDataFromExcel("Contacts", 1, 2);
		// launch the browser
		WebDriver driver = new EdgeDriver();
		sUtil.addImplicitlyWait(driver);
		sUtil.maximizeWindow(driver);
		driver.get(URL);
		//driver.get(URL);
		//WebDriver driver = new EdgeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("http://localhost:8888/");
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(USERNAME, PASSWORD );
		//driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		//driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		//driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("NARESH");
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		String con = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		System.out.println(con);
		if(con.contains("NARESH")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("fail");
		}
	//WebElement admin=driver.findElement(By.xpath("//imgd[@src='themes/softed/images/user.PNG']"));
	Thread.sleep(1000);
	Actions act = new Actions(driver);
	//act.moveToElement(admin).perform();
	driver.findElement(By.xpath("(//a[@class='drop_down_usersettings'])[2]")).click();
driver.quit();

	}

}
