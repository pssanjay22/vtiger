package com.crm.vtiger.genriclibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.vtiger.pomrepository.HomePage;
import com.crm.vtiger.pomrepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	FileLib fLib = new FileLib();
	WebDriverLib wLib = new WebDriverLib();
	
	
	public WebDriver driver;
	public static WebDriver sdriver;
	
	@BeforeClass (groups = {"SmokeTest","RegressionTest"})
	public void lunchBrowser() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		sdriver = driver;
		wLib.implictWait(driver);
	}
	
	@BeforeMethod (groups = {"SmokeTest","RegressionTest"})
	public void loginToApp() throws Throwable {
		String  URL = fLib.getProperyValue("URL");
		String UN = fLib.getProperyValue("UN");
		String PWD = fLib.getProperyValue("PWD");

		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(URL, UN, PWD);
	}
	
	@AfterMethod (groups = {"SmokeTest","RegressionTest"})
	public void signout() {
		HomePage hp = new HomePage(driver);
		hp.signOut(driver);
	}
	
	@AfterClass (groups = {"SmokeTest","RegressionTest"})
	public void closeBrowser() {
		driver.quit();
	}
}
