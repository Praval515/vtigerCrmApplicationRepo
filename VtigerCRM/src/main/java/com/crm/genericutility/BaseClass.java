package com.crm.genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.crm.objectrepository.HomePage;
import com.crm.objectrepository.LoginPage;

public class BaseClass {

	 public static ExtentReports extReport;
	 public static ExtentTest test;
	
	 public static WebDriver sdriver;
	 public WebDriver driver;
	 
	 public WebdriverUtility wUtil =new WebdriverUtility();
	
	 
	 public Fileutility fUtil=new Fileutility();
	 public ExcelUtility eUtil=new ExcelUtility();
	 public JavaUtility jUtil=new JavaUtility();
	 public LoginPage lp;
	 public HomePage hp;
	 
	 @BeforeSuite
	 public void reportconfig() {
			ExtentSparkReporter spark = new ExtentSparkReporter(
					"./HTML_reports/ExtendReport_"+jUtil.getSystemTime()+".html");
		 extReport =new ExtentReports();
		 extReport.attachReporter(spark);
				 
	 }
	 
	 @BeforeClass
	 
		
		public void launchBrowser(@Optional("Chrome") String browserName) throws IOException, InterruptedException {
			
			if(browserName.equalsIgnoreCase("Chrome")) {
				driver=new ChromeDriver();
				
			}else if(browserName.equalsIgnoreCase("firefox")) {
				driver=new FirefoxDriver();
			}else if(browserName.equalsIgnoreCase("edge")) {
				driver=new EdgeDriver();
			}
			
			sdriver=driver;
		wUtil.maximizeWindow(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(fUtil.getDataFromProperties("url"));
			
		}
	 
	 
	 @BeforeMethod
		public void login() throws IOException {
			lp=new LoginPage(driver);
			
			lp=new LoginPage(driver);
			lp.getUserName().sendKeys(fUtil.getDataFromProperties("username"));
			lp.getPassword().sendKeys(fUtil.getDataFromProperties("password"));
			lp.getSubmitButton().click();
			
		}
		@AfterMethod
		public void logout() {
			hp=new HomePage(driver);
//			Actions action = new Actions(driver);
//			action.moveToElement(lp.getProfileIcon()).perform();
//			lp.getSingOutLnk().click();
			wUtil=new WebdriverUtility();
			WebElement icon = lp.getProfileIcon();
			wUtil.mouseHover(driver, icon);
			lp.getSingOutLnk().click();
			
		}
		
		@AfterClass
		public void closeBrowser() {
			driver.quit();
		}
		
		
		@AfterSuite
		public void reportBackUp() {
			extReport.flush();
		}

	 
	 
	 }

