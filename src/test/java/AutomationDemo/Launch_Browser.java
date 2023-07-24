package AutomationDemo;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Browser {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
	    driver.get("https://www.hdfcbank.com/");
	    driver.manage().window().maximize();
	}

}
