package com.crm.vtiger.CreateContact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.vtiger.genriclibrary.BaseClass;
import com.crm.vtiger.genriclibrary.ExcelLib;
import com.crm.vtiger.genriclibrary.WebDriverLib;
import com.crm.vtiger.pomrepository.CreateContactPage;


@Listeners(com.crm.vtiger.genriclibrary.ListenerImplementationClass.class)
public class CreateContactTest extends BaseClass {
	
	@Test (groups = "SmokeTest" , retryAnalyzer = com.crm.vtiger.genriclibrary.RetryAnalyserImplementation.class) 
	public void createContact() throws Throwable {
			
			WebDriverLib wLib = new WebDriverLib();
			CreateContactPage cp = new CreateContactPage(driver);
			ExcelLib eLib = new ExcelLib();
			
			String ActualTitle = driver.getTitle();
			String Expectedtitle = eLib.getDataFromExcel("Address", 1, 6);
			
			SoftAssert soft = new SoftAssert();
			soft.assertEquals(ActualTitle, Expectedtitle);
			
			
//			assertEquals(ActualTitle, Expectedtitle);
			
			wLib.implictWait(driver);
			cp.getClickOnContact().click();
			cp.getCLickOnPlusIconCreate().click();
			
			WebElement drop = cp.getClickOnFirstNameDropDown();
			wLib.selectByValue(drop, "Mr.");
						
			cp.getEnterFirstName().sendKeys("sanjay");
			cp.getEnterLastName().sendKeys("P S");
			cp.getClickOnOrgPlusIcon().click();
			
			String pWin = wLib.getParentWindowHandle(driver);
			wLib.switchToChildWindow(driver);
			cp.getClickOnSearchDropInChWin().click();
			wLib.switchToParent(driver, pWin);
			
			wLib.visibilityOf(driver, driver.findElement(By.xpath("//select[@name='leadsource']")));
			
			WebElement lead = cp.getLeadSourceDropDown();
			wLib.selectByValue(lead, "Employee");
			
			cp.getEnterTitle().sendKeys("QA");
			cp.getEnterDepartment().sendKeys("Feature Team");
			cp.getEnterEmail().sendKeys("sanjay121@yopmail.com");
			cp.getSelectEmailoptOutCheckBox().click();
			cp.getEnterPhone().sendKeys("7676674165");
			cp.getEnterBirthday().sendKeys("1997-07-22");
			cp.getClickOnReportsPlusIcon().click();
			
			String pWin1 = wLib.getParentWindowHandle(driver);
			wLib.switchToChildWindow(driver);
			
			WebElement repo = cp.getClickOnSearchDropInChWin();
			wLib.selectByValue(repo, "title");
			
			cp.getClickOnSearch().click();
			cp.getSelectElementInCwin().click();
			wLib.switchToParent(driver, pWin1);
			
			cp.getEnterAddress().sendKeys("Jp Nagar Bangalore");
			cp.getEnterOtherAddress().sendKeys("Jp Nagar Bangalore");
			cp.getClickOnSave().click();
			cp.getClickOnDelete().click();
			wLib.alert(driver);
			
			soft.assertAll();
		}
	
	@Test (groups = "RegressionTest")
	public void createContactClone() {
		
		WebDriverLib wLib = new WebDriverLib();
		CreateContactPage cp = new CreateContactPage(driver);
		
		wLib.implictWait(driver);
		cp.getClickOnContact().click();
		cp.getCLickOnPlusIconCreate().click();
		
		WebElement drop = cp.getClickOnFirstNameDropDown();
		wLib.selectByValue(drop, "Mr.");
					
		cp.getEnterFirstName().sendKeys("sanjay");
		cp.getEnterLastName().sendKeys("P S");
		cp.getClickOnOrgPlusIcon().click();
		
		String pWin = wLib.getParentWindowHandle(driver);
		wLib.switchToChildWindow(driver);
		cp.getClickOnSearchDropInChWin().click();
		wLib.switchToParent(driver, pWin);
		
		wLib.visibilityOf(driver, driver.findElement(By.xpath("//select[@name='leadsource']")));
		
		WebElement lead = cp.getLeadSourceDropDown();
		wLib.selectByValue(lead, "Employee");
		
		cp.getEnterTitle().sendKeys("QA");
		cp.getEnterDepartment().sendKeys("Feature Team");
		cp.getEnterEmail().sendKeys("sanjay121@yopmail.com");
		cp.getSelectEmailoptOutCheckBox().click();
		cp.getEnterPhone().sendKeys("7676674165");
		cp.getEnterBirthday().sendKeys("1997-07-22");
		cp.getClickOnReportsPlusIcon().click();
		
		String pWin1 = wLib.getParentWindowHandle(driver);
		wLib.switchToChildWindow(driver);
		
		WebElement repo = cp.getClickOnSearchDropInChWin();
		wLib.selectByValue(repo, "title");
		
		cp.getClickOnSearch().click();
		cp.getSelectElementInCwin().click();
		wLib.switchToParent(driver, pWin1);
		
		cp.getEnterAddress().sendKeys("Jp Nagar Bangalore");
		cp.getEnterOtherAddress().sendKeys("Jp Nagar Bangalore");
		cp.getClickOnSave().click();
		cp.getClickOnDelete().click();
		wLib.alert(driver);
	}
}
