package testCase;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

import pages.LoginPage;

public class BaseTest {

	static WebDriver driver;
	LoginPage lp;

	
	@BeforeSuite
	public void initBrowser() throws IOException
	{
		//System.setProperty("webdriver.chrome.driver",
			//"E:\\Desktop\\Katraj\\May 21\\selenium download\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		ChromeOptions op = new ChromeOptions();
		   
	       op.addArguments("--disable-notifications");
	     
//		ChromeOptions options= new ChromeOptions();
//		
//		
//		options.addArguments("--disable-notifications");
//		
//		options.addArguments("--start-maximized");
//		
//		options.addArguments("--incognito");
		
//		options.addArguments("--headless");
		
		driver = new ChromeDriver();

		
		String path = System.getProperty("user.dir") + "//config.properties";
		FileInputStream fis = new  FileInputStream(path);
		Properties prop = new Properties();

		prop.load(fis);
     driver.get(prop.getProperty("testsiteurl"));
	}  
     
     @BeforeClass
 	public void createObject()throws IOException{
 		lp = new LoginPage(driver);
 	}


	}


	

	

