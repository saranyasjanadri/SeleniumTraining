package AutomationDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


//To upload the files in Selenium Webdriver we use sendKeys() method &
//Robot Class methods.
//We also can use the third party tools like  AutoIT & Sikuli 
//which we can integrate with Selenium Webdriver and we can do that.

public class UploadFile {

	public static void main(String[] args) throws AWTException 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
	    driver.get("https://www.monsterindia.com/");
	    driver.manage().window().maximize();
	    
	    //Locator for Upload Resume Button
	    driver.findElement(By.xpath("//a[@class='btn block resume-btn btn-orange mt20']")).click();
	    
	    
	    //After clicking the button it shows the pop up window for drag
	    //and drop the file.Inspect the whole element, in that the type
	    //attribute is "file".So we can upload the file directly
	    
	    //Using sendKeys approach:
	    driver.findElement(By.cssSelector("body > div:nth-child(4) > section:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > section:nth-child(2) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(5)")).sendKeys("C:\\Selenium Practice\\New.txt");
	
	    
	    
	    
	    //If we don't find type="file" then sendKeys approach doesn't work
	    //and also selenium webdriver cannot identify the window based 
	    //application.So we have to use robot class methods
	    
	    //Using robot class:
	    WebElement button=driver.findElement(By.cssSelector("body > div:nth-child(4) > section:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > section:nth-child(2) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(5)"));
	    //If in case button.click(); doesn't works we have to use the JS to click the element.
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    //This clicks on the button
	    js.executeScript("arguments[0].click();", button);
	    
	    //Create Robot class instance
	    Robot rb=new Robot();
	    rb.delay(2000);
	    
	    
	    //For ex:If we want to copy the file into some location,
	    //First we select the file and press CTRL+C,
	    //then the file will go to the clipboard.
	    //Next if we press CTRL+V the same file will be copied into the
	    //target location.
	    
	    
	    //1)To put/copy the file into the clipborad
	    //(Performs same action as CTRL+C on the file)
	    StringSelection ss=new StringSelection("C:\\Selenium Practice\\New.txt");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	
	    
	    
	    //As soon as we click on the input box 'select file to upload' 
	    //it opens the window and by default cursor is placed on the 
	    //file name text box.
	    //So we have to just press CRTL+V to copy the file path in the
	    //file name text box.
	    //Then press ENTER to click the 'OPEN' button.
	    //And it closes the window and uploads the file
	    
	    
	    
	    //2)To copy the file into the browser window
	    //(Performs CTRL+V action)
	    
	    //For pressing the keys
	    rb.keyPress(KeyEvent.VK_CONTROL);
	    rb.keyPress(KeyEvent.VK_V);
	    rb.delay(2000);
	    
	    
	    //For Releasing the keys
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	    rb.delay(2000);
	    
	    //3)To click the OPEN button(Performs ENTER key action)
	    
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	    
	
	}
	

}
