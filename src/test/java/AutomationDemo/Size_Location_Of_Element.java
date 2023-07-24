package AutomationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Size_Location_Of_Element {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
	    
	    
	    //Locator for the logo
	    WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']//img"));
	    
	    
	    //To find the location of the element(method1)
	    System.out.println("Location(x,y):"+logo.getLocation());
	    System.out.println("Location(x):"+logo.getLocation().getX());
	    System.out.println("Location(y):"+logo.getLocation().getY());
	    
	    
	    //To find the location of the element(method2)
	    System.out.println("Location(x):"+logo.getRect().getX());
	    System.out.println("Location(y):"+logo.getRect().getY());
	   
	    
	    
	    
	    
	    
	    //To find the size of the element(method1)
	    //To get the Width & Height
	    System.out.println("Size(Width,Height):"+logo.getSize());
	    System.out.println("Size(Width):"+logo.getSize().getWidth());
	    System.out.println("Size(Height):"+logo.getSize().getHeight());
	
	    
	    //To find the size of the element(method2)
	    System.out.println("Size(Width):"+logo.getRect().getDimension().getWidth());
	    System.out.println("Size(Height):"+logo.getRect().getDimension().getHeight());
	
	}

}
