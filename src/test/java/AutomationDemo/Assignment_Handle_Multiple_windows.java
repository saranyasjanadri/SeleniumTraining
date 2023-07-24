package AutomationDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




//Open one url and click the link in that browser window
//to open another browser window and enter the details in the
//form given there.(Switching between windows)
public class Assignment_Handle_Multiple_windows {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
	    driver.get("https://www.salesforce.com/au/");//(Parent Window)
	    driver.manage().window().maximize();
	    
	    
	    
	    driver.findElement(By.xpath("//*[@id='main']/div[5]/div/div[6]/div[1]/div[2]/div[2]/div/div[1]/div/a")).click();
	    Thread.sleep(3000);
	    
	    Set<String> windowhandles=driver.getWindowHandles();
	    System.out.println(windowhandles);
	    
	    Iterator<String> iterate= windowhandles.iterator();
	    String parentwindow=iterate.next();
	    System.out.println(parentwindow);
	    String childwindow=iterate.next();
	    System.out.println(childwindow);
	    
	    driver.switchTo().window(childwindow);
	    driver.findElement(By.name("UserFirstName")).sendKeys("saranya");
	    driver.findElement(By.name("UserLastName")).sendKeys("SJ");
	    

	}

}
