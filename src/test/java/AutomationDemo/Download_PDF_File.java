package AutomationDemo;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;



//Basically pdf file will be opened in the browser itself in the view mode
//We have download if necessary
//To avoid it and to download the file directly, we have to add 
//one additional preference as shown below
public class Download_PDF_File {

	public static void main(String[] args)
	{
		
		String location=System.getProperty("user.dir")+"\\Downloads\\";
		
		
		//For Chrome Browser
		/*
		HashMap preferences=new HashMap();
		
		//By default the value is false,so we have to make it as true
		//Otherwise the file will be open in the browser itself 
		//in the view mode,later we have to download it.
		preferences.put("plugins.always_open_pdf_externally",true);
		
		preferences.put("download.default_directory", location);
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver(options);
		*/
		
		
		
		
		
		
		//For Edge Browser
		/*
		HashMap preferences=new HashMap();
		preferences.put("plugins.always_open_pdf_externally",true);
		preferences.put("download.default_directory", location);
		
		EdgeOptions options=new EdgeOptions();
		options.setExperimentalOption("prefs", preferences);
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver(options);
		*/
		
		
		
		
		
		
		//For Firefox Browser
		
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("pdfjs.disabled",true);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
		profile.setPreference("browser.download.folderList", 2);
        profile.setPreference("browser.download.dir", location);
		
		FirefoxOptions options =new FirefoxOptions();
		options.setProfile(profile);
				
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver(options);
		
		
		
		
		
		
		
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");
	    driver.manage().window().maximize();
	    
	    
	    //Locator for 'download sample pdf file button' link
	    driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
	}

}
