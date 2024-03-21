package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class Scenario_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeOptions option=new EdgeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new EdgeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		WebElement more = driver.findElement(By.linkText("More"));
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.moveToElement(more).perform();
		driver.findElement(By.name("Vendors")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.name("vendorname")).sendKeys("TATA MOTORS");
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		String vendor = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		System.out.println(vendor);
		if(vendor.contains("TATA MOTORS")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");

	}
		WebElement admin=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Thread.sleep(1000);
		Actions act1 = new Actions(driver);
		act.moveToElement(admin).perform();
		driver.findElement(By.linkText("Sign Out")).click();
	driver.quit();

}
}
