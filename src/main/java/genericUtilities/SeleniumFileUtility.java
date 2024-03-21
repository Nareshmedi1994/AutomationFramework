package genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
/*
 * *
 * this class consists of generic methods related to selenium webDriver
 *@author naresh
 */


public class SeleniumFileUtility {

	
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	
	public void minimizeWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}
	public void addImplicitlyWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	public void WaitforElementToBeVissible(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	
	public void WaitForElementToBeClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * this menthod will handle by dropdown by index
	 * @param index
	 * @param element
	 */
	public void HandleDropDoen(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	/**
	 * this menthod will handle by dropdown by value
	 * @param value
	 * @param element
	 */
	public void HandleDropDoen(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	/**
	 * this menthod will handle by dropdown by vissibleText
	 * @param vissibleText
	 * @param element
	 */
	public void HandleDropDoen(String text, WebElement element) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	/**
	 * this method will  mouseOver Action element
	 */
	public void mouseOverAction(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		
	}
	/**
	 * this method will perform Right Click operation
	 */
	public void RightClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick().perform();
	}
	/**
	 * this method will perform double Click operation
	 */
	public void DoubleClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick().perform();
	}
	/**
	 * this method will perform Drag and Drop operation
	 */
	public void DragandDrop(WebDriver driver, WebElement src, WebElement target) {
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}
		/**
	 * This method will switch to frame based on Index
	 * @param driver
	 * @param frameIndex
	 */
	public void switchToFrame(WebDriver driver , int frameIndex)
	{
		driver.switchTo().frame(frameIndex);
	}
	
	/**
	 * This method will switch to Frame based on name or ID
	 * @param driver
	 * @param index
	 */
	public void switcToFrames(WebDriver driver , String frameNameOrID)
	{
		driver.switchTo().frame(frameNameOrID);
	}
	
	/**
	 * This method will frame based on frame webElement
	 * @param driver
	 * @param default content
	 */
	public void switcToFrames(WebDriver driver , WebElement frameElement)
	{
		driver.switchTo().frame(frameElement);
	}
	
	
	/**
	 * This method will accept the alert pop-up
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	{
	  driver.switchTo().alert().accept();	
	}
	
	/**
	 * This method will  dismiss the alert pop-up
	 * @param driver
	 * @param element
	 */
	public void cancelAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();	
	}
	
	/**
	 * This method will send data into alert pop-up
	 * @param driver
	 * @param element
	 */
	public void sendAlertText(WebDriver driver , String text)
	{
		driver.switchTo().alert().sendKeys(text);
	}
	
	/**
	 * This method will capture the alert text and return value to caller
	 * @param driver
	 * @param element
	 * @return 
	 */
	public String getTextAlert(WebDriver driver)
	{
		return driver.switchTo().alert().getText();
	}
	/**
	 * this method will capture the screenshot and store in location
	 * @throws IOException 
	 */
	 
	public String CaptureScreenshot(WebDriver driver, String screenshotName ) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
	File dist = new File(".\\screenshot\\"+screenshotName+".png");
	Files.copy(src, dist);
	
	return dist.getAbsolutePath();// used in extent report
	}
}

