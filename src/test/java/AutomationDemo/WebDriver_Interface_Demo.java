package AutomationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


//We are taking the reference of the interface WebDriver and then creating
//the classes of specific browser.
public class WebDriver_Interface_Demo 
{
public static String browser="chrome"; //From External configuration XLS,CSV
public static WebDriver	driver;
   public static void main(String[] args) 
	{
	
	if(browser.equals("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}else if(browser.equals("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}else if(browser.equals("edge"))
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
		
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        
	}

}






//If we create object for driver classes like this it will be an tedious 
//task.Its not an feasible approach.
//So only we are using WebDriver interface as shown above.
//As we cannot instantiate interface as WebDriver driver=new WebDriver();
//We are instantiating the classes which implemented the WebDriver interface.

/*
public class WebDriver_Interface_Demo 
{
public static String browser="chrome"; //From External configuration XLS,CSV
public static FirefoxDriver	driver;
public static ChromeDriver	driver1;
public static EdgeDriver	driver2;

   public static void main(String[] args) 
	{
	
	if(browser.equals("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}else if(browser.equals("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver1=new ChromeDriver();
	}else if(browser.equals("edge"))
	{
		WebDriverManager.edgedriver().setup();
		driver2=new EdgeDriver();
	}
		
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        
		
		driver1.get("https://www.saucedemo.com/");
		driver1.manage().window().maximize();
		driver1.findElement(By.id("user-name")).sendKeys("standard_user");
		driver1.findElement(By.id("password")).sendKeys("secret_sauce");
		driver1.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		
		driver2.get("https://www.saucedemo.com/");
		driver2.manage().window().maximize();
		driver2.findElement(By.id("user-name")).sendKeys("standard_user");
		driver2.findElement(By.id("password")).sendKeys("secret_sauce");
		driver2.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	
	
	}

}
*/
