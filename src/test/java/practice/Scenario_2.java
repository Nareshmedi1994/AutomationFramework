package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.name("lastname")).sendKeys("Naresh");
		driver.findElement(By.name("company")).sendKeys("LTI MindTree");
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		String lead = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		System.out.println(lead);
		if(lead.contains("Naresh")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		WebElement admin=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.moveToElement(admin).perform();
		driver.findElement(By.xpath("(//a[@class='drop_down_usersettings'])[2]")).click();
	driver.quit();

	}

}
