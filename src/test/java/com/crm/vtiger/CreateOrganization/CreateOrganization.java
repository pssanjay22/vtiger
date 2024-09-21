package com.crm.vtiger.CreateOrganization;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.vtiger.genriclibrary.BaseClass;
import com.crm.vtiger.genriclibrary.ExcelLib;
import com.crm.vtiger.genriclibrary.FileLib;
import com.crm.vtiger.genriclibrary.WebDriverLib;
import com.crm.vtiger.pomrepository.CreateOrganizationPage;
import com.crm.vtiger.pomrepository.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganization extends BaseClass{
	
	@Test
	public void createOrganization() throws Throwable{
//	public static void main(String[] args) throws IOException {
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		
//		FileLib fLib = new FileLib();
//		String URL = fLib.getProperyValue("URL");
//		String UN = fLib.getProperyValue("UN");
//		String PWD = fLib.getProperyValue("PWD");
		
//		FileInputStream fis = new FileInputStream("./TestData/credentials.properties");
//		Properties p = new Properties();
//		p.load(fis);
//		String URL = p.getProperty("URL");
//		String UN = p.getProperty("UN");
//		String PWD = p.getProperty("PWD");
		
//		driver.get(URL);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(UN);
//		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PWD);
//		driver.findElement(By.id("submitButton")).click();
		
		CreateOrganizationPage op = new CreateOrganizationPage(driver);
		WebDriverLib wLib = new WebDriverLib();
		HomePage hp = new HomePage(driver);
		hp.getClickOnOrganizationsModule().click();
		
//		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		op.getClickOnPlusOrgIcon().click();
		op.getEnterOrgName().sendKeys("FireFlink");
		op.getEnterWebSite().sendKeys("https://website.fireflink.com");
		op.getClickOnAddMemIcon().click();
		
		String pWin = wLib.getParentWindowHandle(driver);
		wLib.switchToChildWindow(driver);
		op.getSelectMemInChWin().click();
		wLib.alert(driver);
		wLib.switchToParent(driver, pWin);
		
//		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
//		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("FireFlink");
//		driver.findElement(By.xpath("//input[@name='website']")).sendKeys("https://website.fireflink.com");
//		driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
//		
//		String pWin = driver.getWindowHandle();
//		Set<String> allwin = driver.getWindowHandles();
//		
//		for (String window : allwin) 
//		{
//			if (!pWin.equals(window)) 
//			{
//				driver.switchTo().window(window);
//				break;
//			}
//		}
//		driver.findElement(By.xpath("//a[text()='vtiger']")).click();
		
//		Alert alt = driver.switchTo().alert();
//		alt.accept();
//		
//		driver.switchTo().window(pWin);
		
		WebElement drop = op.getSelectIndustryDropDown();
		wLib.selectByValue(drop, "Technology");
		
//		WebElement drop = driver.findElement(By.xpath("//select[@name='industry']"));
//		
//		Select sel = new Select(drop);
//		sel.selectByValue("Technology");
		
		ExcelLib eLib = new ExcelLib();
		String billadd = eLib.getDataFromExcel("Address", 1, 0);
		String billbox = eLib.getDataFromExcel("Address", 1, 1);
		String billcity = eLib.getDataFromExcel("Address", 1, 2);
		String billstate = eLib.getDataFromExcel("Address", 1, 3);
		String billcode = eLib.getDataFromExcel("Address", 1, 4);
		String billcountry = eLib.getDataFromExcel("Address", 1, 5);
		
//		FileInputStream excel = new FileInputStream("./TestData/Address.xlsx");
//		Workbook wb = WorkbookFactory.create(excel);
//		String billadd = wb.getSheet("Address").getRow(1).getCell(0).getStringCellValue();
//		String billbox = wb.getSheet("Address").getRow(1).getCell(1).getStringCellValue();
//		String billcity = wb.getSheet("Address").getRow(1).getCell(2).getStringCellValue();
//		String billstate = wb.getSheet("Address").getRow(1).getCell(3).getStringCellValue();
//		String billcode = wb.getSheet("Address").getRow(1).getCell(4).getStringCellValue();
//		String billcountry = wb.getSheet("Address").getRow(1).getCell(5).getStringCellValue();
		
		op.getEnterBillAddress().sendKeys(billadd);
		op.getEnterBillPoBox().sendKeys(billbox);
		op.getEnterBillCity().sendKeys(billcity);
		op.getEnterBillState().sendKeys(billstate);
		op.getEnterBillCode().sendKeys(billcode);
		op.getEnterBillCountry().sendKeys(billcountry);
		
//		driver.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys(billadd);
//		driver.findElement(By.xpath("//input[@name='bill_pobox']")).sendKeys(billbox);
//		driver.findElement(By.xpath("//input[@name='bill_city']")).sendKeys(billcity);
//		driver.findElement(By.xpath("//input[@name='bill_state']")).sendKeys(billstate);
//		driver.findElement(By.xpath("//input[@name='bill_code']")).sendKeys(billcode);
//		driver.findElement(By.xpath("//input[@name='bill_country']")).sendKeys(billcountry);
		
		op.getClickOnCopyBillAddressRadioButton().click();
		op.getClickOnSaveOrgButton().click();
		op.getClickOnDeleteOrg().click();
		wLib.alert(driver);
		
//		driver.findElement(By.xpath("//input[@onclick='return copyAddressRight(EditView)']")).click();
//		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();
//		driver.findElement(By.xpath("(//input[@title='Delete [Alt+D]'])[1]")).click();
//		wLib.alert(driver);
		
//		WebElement move = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
//		Actions act = new Actions(driver);
//		act.moveToElement(move).perform();
//		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
//		
//		driver.quit();
	}

}
