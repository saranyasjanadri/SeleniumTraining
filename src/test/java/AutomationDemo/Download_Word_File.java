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

public class Download_Word_File {

	public static void main(String[] args) 
	{
		
		//user.dir-->This will return the current working project
		//Downloads-->Actual location to download the files
		String location=System.getProperty("user.dir")+"\\Downloads\\";
		
		
		
		
		
		
		//Downloading word/document file using Chrome browser
		//Browser settings for Chrome Browser(To set this location):
		
		
		/*
		//Step1:Create HashMap to store the different preferences
		//HashMap is an collection from Java to store key & value
		HashMap preferences=new HashMap();
		preferences.put("download.default_directory", location);
		
		
		//Step2:Create ChromeOptions to set Chrome browser settings
		//These preferences will be automatically added to the browser
		//when it is launched.
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);
		
		
		
		//Step3:Pass this ChromeOptions while creating the driver instance
		//Otherwise the above preferences will not be applicable for the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver(options);
	    */
		
		
		
		
		
		//Downloading word/document file using Edge browser
		/*
		HashMap preferences=new HashMap();
		preferences.put("download.default_directory", location);
		
		EdgeOptions options=new EdgeOptions();
		options.setExperimentalOption("prefs", preferences);
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver(options);
		*/
		
		
		
		
		//Downloading word/document file using Firefox browser
		
		FirefoxProfile profile=new FirefoxProfile();
		
		
		//To disable the confirmation popup window for downloading the file 
		//Key--->browser.helperApps.neverAsk.saveToDisk
		//Value--->We have to specify what kind of file we are going to download
		//application/msword--->MIME Type for doc/word file
		//https://www.sitepoint.com/mime-types-complete-list/---->
		//This URL gives the list of MIME Types
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/msword");
		
		
		//Value could be 0 or 1 or 2
		//0-->File will be downloaded on the desktop
		//1-->File will be downloaded on the downloads folder
		//which is specified in the browser level as default.
		//2-->File will be downloaded in the desired/custom location
		profile.setPreference("browser.download.folderList", 2);
		
		
		//If we specify 2 as the value then have to specify the location
		//For 0 & 1 we don't need to specify the location
		profile.setPreference("browser.download.dir", location);
		
		FirefoxOptions options =new FirefoxOptions();
		options.setProfile(profile);
				
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver(options);
				
		
		
		
		
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
	    driver.manage().window().maximize();
	    
	    
	    //Locator for 'download doc file button' link
	    driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
	  

	}

}
