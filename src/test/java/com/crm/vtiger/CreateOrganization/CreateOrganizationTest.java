package com.crm.vtiger.CreateOrganization;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.vtiger.genriclibrary.BaseClass;
import com.crm.vtiger.genriclibrary.ExcelLib;
import com.crm.vtiger.genriclibrary.WebDriverLib;
import com.crm.vtiger.pomrepository.CreateOrganizationPage;
import com.crm.vtiger.pomrepository.HomePage;

public class CreateOrganizationTest extends BaseClass{
	
	@Test (groups = "SmokeTest")
	public void createOrganization() throws Throwable{

			CreateOrganizationPage op = new CreateOrganizationPage(driver);
			WebDriverLib wLib = new WebDriverLib();
			HomePage hp = new HomePage(driver);
			hp.getClickOnOrganizationsModule().click();
			
			op.getClickOnPlusOrgIcon().click();
			op.getEnterOrgName().sendKeys("FireFlink");
			op.getEnterWebSite().sendKeys("https://website.fireflink.com");
			op.getClickOnAddMemIcon().click();
			
			String pWin = wLib.getParentWindowHandle(driver);
			wLib.switchToChildWindow(driver);
			op.getSelectMemInChWin().click();
			wLib.alert(driver);
			wLib.switchToParent(driver, pWin);
			
			WebElement drop = op.getSelectIndustryDropDown();
			wLib.selectByValue(drop, "Technology");
			
			ExcelLib eLib = new ExcelLib();
			String billadd = eLib.getDataFromExcel("Address", 1, 0);
			String billbox = eLib.getDataFromExcel("Address", 1, 1);
			String billcity = eLib.getDataFromExcel("Address", 1, 2);
			String billstate = eLib.getDataFromExcel("Address", 1, 3);
			String billcode = eLib.getDataFromExcel("Address", 1, 4);
			String billcountry = eLib.getDataFromExcel("Address", 1, 5);
			
			op.getEnterBillAddress().sendKeys(billadd);
			op.getEnterBillPoBox().sendKeys(billbox);
			op.getEnterBillCity().sendKeys(billcity);
			op.getEnterBillState().sendKeys(billstate);
			op.getEnterBillCode().sendKeys(billcode);
			op.getEnterBillCountry().sendKeys(billcountry);
			
			op.getClickOnCopyBillAddressRadioButton().click();
			op.getClickOnSaveOrgButton().click();
			op.getClickOnDeleteOrg().click();
			wLib.alert(driver);
		}

	@Test (groups = "RegressionTest")
	public void createOrganizationClone() throws Throwable {
		CreateOrganizationPage op = new CreateOrganizationPage(driver);
		WebDriverLib wLib = new WebDriverLib();
		HomePage hp = new HomePage(driver);
		hp.getClickOnOrganizationsModule().click();
		
		op.getClickOnPlusOrgIcon().click();
		op.getEnterOrgName().sendKeys("FireFlink");
		op.getEnterWebSite().sendKeys("https://website.fireflink.com");
		op.getClickOnAddMemIcon().click();
		
		String pWin = wLib.getParentWindowHandle(driver);
		wLib.switchToChildWindow(driver);
		op.getSelectMemInChWin().click();
		wLib.alert(driver);
		wLib.switchToParent(driver, pWin);
		
		WebElement drop = op.getSelectIndustryDropDown();
		wLib.selectByValue(drop, "Technology");
		
		ExcelLib eLib = new ExcelLib();
		String billadd = eLib.getDataFromExcel("Address", 1, 0);
		String billbox = eLib.getDataFromExcel("Address", 1, 1);
		String billcity = eLib.getDataFromExcel("Address", 1, 2);
		String billstate = eLib.getDataFromExcel("Address", 1, 3);
		String billcode = eLib.getDataFromExcel("Address", 1, 4);
		String billcountry = eLib.getDataFromExcel("Address", 1, 5);
		
		op.getEnterBillAddress().sendKeys(billadd);
		op.getEnterBillPoBox().sendKeys(billbox);
		op.getEnterBillCity().sendKeys(billcity);
		op.getEnterBillState().sendKeys(billstate);
		op.getEnterBillCode().sendKeys(billcode);
		op.getEnterBillCountry().sendKeys(billcountry);
		
		op.getClickOnCopyBillAddressRadioButton().click();
		op.getClickOnSaveOrgButton().click();
		op.getClickOnDeleteOrg().click();
		wLib.alert(driver);
	}
}
