package com.crm.vtiger.CreateContact;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.crm.vtiger.genriclibrary.BaseClass;
import com.crm.vtiger.genriclibrary.FileLib;
import com.crm.vtiger.genriclibrary.WebDriverLib;
import com.crm.vtiger.pomrepository.CreateContactPage;
import com.crm.vtiger.pomrepository.HomePage;
import com.crm.vtiger.pomrepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact extends BaseClass{

	@Test
	public void createContact() throws Throwable {
//	public static void main(String[] args) throws InterruptedException, IOException {
		
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
		WebDriverLib wLib = new WebDriverLib();
		CreateContactPage cp = new CreateContactPage(driver);
//		HomePage hp = new HomePage(driver);
		
		wLib.implictWait(driver);
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
//		FileLib flib = new FileLib();
//		
//		String  URL = flib.getProperyValue("URL");
//		String UN = flib.getProperyValue("UN");
//		String PWD = flib.getProperyValue("PWD");

		
//		FileInputStream fis = new FileInputStream("./TestData/credentials.properties");
//		Properties p = new Properties();
//		p.load(fis);
//		String URL = p.getProperty("URL");
//		String UN = p.getProperty("UN");
//		String PWD = p.getProperty("PWD");
		
//		driver.get(URL);
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(UN);
//		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PWD);
//		driver.findElement(By.id("submitButton")).click();
		
		cp.getClickOnContact().click();
		cp.getCLickOnPlusIconCreate().click();
		
//		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
//		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		
		WebElement drop = cp.getClickOnFirstNameDropDown();
		wLib.selectByValue(drop, "Mr.");
		
//		WebElement drop = driver.findElement(By.xpath("//select[@name='salutationtype']"));	
//		Select sel = new Select(drop);
//		sel.selectByValue("Mr.");
		
		cp.getEnterFirstName().sendKeys("sanjay");
		cp.getEnterLastName().sendKeys("P S");
		cp.getClickOnOrgPlusIcon().click();
		
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sanjay");
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("P S");
//		driver.findElement(By.xpath("(//img[@src='themes/softed/images/select.gif'])[1]")).click();
		
//		WebDriverLib wLib = new WebDriverLib();
//		wLib.switchToChildWindowForContactModule(driver);
//		driver.findElement(By.xpath("//a[text()='vtiger']")).click();
//		wLib.switchToParentWindow(driver);
	
		String pWin = driver.getWindowHandle();
		Set<String> handle = driver.getWindowHandles();
		for (String win : handle) 
		{
			if(!win.equals(pWin))
			{
				driver.switchTo().window(win);
				System.out.println(win);
				break;
			}
		}
		
		cp.getClickOnSearchDropInChWin().click();
		
//		driver.findElement(By.xpath("//a[text()='vtiger']")).click();

		driver.switchTo().window(pWin);
		
		wLib.visibilityOf(driver, driver.findElement(By.xpath("//select[@name='leadsource']")));
		
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//select[@name='leadsource']"))));
		
		WebElement lead = cp.getLeadSourceDropDown();
		wLib.selectByValue(lead, "Employee");
		
//		driver.findElement(By.xpath("//select[@name='leadsource']")).click();
//		WebElement lead = driver.findElement(By.xpath("//select[@name='leadsource']"));
//		Select sel1 = new Select(lead);
//		sel1.selectByValue("Employee");
		
		cp.getEnterTitle().sendKeys("QA");
		cp.getEnterDepartment().sendKeys("Feature Team");
		cp.getEnterEmail().sendKeys("sanjay121@yopmail.com");
		cp.getSelectEmailoptOutCheckBox().click();
		cp.getEnterPhone().sendKeys("7676674165");
		cp.getEnterBirthday().sendKeys("1997-07-22");
		cp.getClickOnReportsPlusIcon().click();
		
//		driver.findElement(By.xpath("//input[@name='title']")).sendKeys("QA");
//		driver.findElement(By.xpath("//input[@name='department']")).sendKeys("Feature Team");
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sanjay121@yopmail.com");
//		driver.findElement(By.xpath("//input[@name='emailoptout']")).click();
//		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7676674165");
//		driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("1997-07-22");
//		driver.findElement(By.xpath("(//img[@src='themes/softed/images/select.gif'])[2]")).click();
		
		String pWin1 = driver.getWindowHandle();
		Set<String> cWin = driver.getWindowHandles();
		for (String win1 : cWin) 
		{
			if(!pWin1.equals(win1))
			{
				driver.switchTo().window(win1);
				break;
			}
		}
		
		WebElement repo = cp.getClickOnSearchDropInChWin();
		wLib.selectByValue(repo, "title");
		
//		WebElement repo = driver.findElement(By.xpath("//select[@name='search_field']"));		
//		Select sel2 = new Select(repo);
//		sel2.selectByValue("title");
		
		cp.getClickOnSearch().click();
		cp.getSelectElementInCwin().click();
		
//		driver.findElement(By.xpath("//input[@name='search']")).click();
//		driver.findElement(By.xpath("//a[@href='javascript:window.close();']")).click();
		driver.switchTo().window(pWin1);
		
		cp.getEnterAddress().sendKeys("Jp Nagar Bangalore");
		cp.getEnterOtherAddress().sendKeys("Jp Nagar Bangalore");
		cp.getClickOnSave().click();
		cp.getClickOnDelete().click();
		wLib.alert(driver);
		
//		driver.findElement(By.xpath("//textarea[@name='mailingstreet']")).sendKeys("Jp Nagar Bangalore");
//		driver.findElement(By.xpath("//textarea[@name='otherstreet']")).sendKeys("Jp Nagar Bangalore");
//		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();
		
//		driver.findElement(By.xpath("(//input[@title='Delete [Alt+D]'])[1]")).click();
		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
//		WebElement move = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		
//		wLib.moveToElement(driver, move);
		
//		Actions act = new Actions(driver);
//		act.moveToElement(move).perform();
		
//		hp.signOut(driver);
//		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
//		driver.quit();
	}	
}


