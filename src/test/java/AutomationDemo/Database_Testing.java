package AutomationDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Database_Testing {

	public static void main(String[] args)
	{
		
		//1)UI Validation(We pass some data,click on the Continue
		//and verifies Registration is successful or not
		
		
		//Data
		String cust_firstName="John";
		String cust_lastName="Kenedy";
		String cust_email="john@gmail.com";
		String cust_telPhone="1234567890";
		String cust_password="john123";
		
		
		//User registration from the UI
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.localhost/opencart/upload/");
	    driver.manage().window().maximize();
	    
	    
	    
	    //Locator to click 'My Account'
	    driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
	    
	    //After clicking the My Account we gets 'Register' link
	    //Locator for 'Register' link
	    driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
	    
	    
	    //Enter the data in the registration form
	    driver.findElement(By.name("firstname")).sendKeys(cust_firstName);
	    driver.findElement(By.name("lastname")).sendKeys(cust_lastName);
	    driver.findElement(By.name("email")).sendKeys(cust_email);
	    driver.findElement(By.name("telephone")).sendKeys(cust_telPhone);
	    driver.findElement(By.name("password")).sendKeys(cust_password);
	    
	    
	    
	    driver.findElement(By.name("confirm")).sendKeys(cust_password);
	    driver.findElement(By.name("agree")).click();
	    driver.findElement(By.xpath("//input[@value='Continue']")).click();
	
	    
	    //Once we click the 'Continue' button it gives the 
	    //Acknowledgement message.('Your Account Has Been Created!')
	    
	    try
	    {
	    String confmsg=driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();
	    if(confmsg.equals("Your Account Has Been Created!"))
	    {
	    	System.out.println("Registration successful from the UI/Application");
	    }
	    else
	    {
	    	System.out.println("Registration Not successfull");
	    }
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Some problem in the application");
	    }
	
	
	
	
	
	}
	

}
