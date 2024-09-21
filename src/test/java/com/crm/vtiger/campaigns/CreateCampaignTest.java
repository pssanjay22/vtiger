package com.crm.vtiger.campaigns;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.vtiger.genriclibrary.BaseClass;
import com.crm.vtiger.genriclibrary.WebDriverLib;
import com.crm.vtiger.pomrepository.CreateCampaignPage;
import com.crm.vtiger.pomrepository.HomePage;

public class CreateCampaignTest extends BaseClass{

	@Test (groups = "SmokeTest")
	public void createCampaign() throws Throwable {

			CreateCampaignPage camp = new CreateCampaignPage(driver);
			WebDriverLib wLib = new WebDriverLib();
			HomePage hp = new HomePage(driver);
			WebElement mousehover = hp.getMoreIcon();
			wLib.moveToElement(driver, mousehover);
			
			hp.getClickOnCampaignsModule().click();
			
			camp.getClickOnPlusCreateCampIcon().click();
			camp.getEnterCampaignName().sendKeys("Camp");
			WebElement type = camp.getSelectCampaignType();
			wLib.selectByValue(type, "Conference");
			
			camp.getEnterTargetAudienceValue().sendKeys("");
			camp.getEnterSponsorValue().sendKeys("google");
			camp.getEnterNumSetValue().sendKeys("5");
			WebElement status = camp.getCampaignStatusDropdown();
			wLib.selectByValue(status, "Active");
			camp.getClickOnPlusProductIcon().click();
			
			String pWin = wLib.getParentWindowHandle(driver);
			
			wLib.switchToChildWindow(driver);
			camp.getSelectProductInChwin().click();
			wLib.switchToParent(driver, pWin);
			
			
			camp.getEnterTargetSizeValue().sendKeys("100");
			camp.getEnterBudgetCostValue().sendKeys("50");
			
			WebElement expresp = camp.getExpectedResponseDropdown();
			wLib.selectByValue(expresp, "Excellent");
			
			camp.getEnterExpectedSalesCountValue().sendKeys("40");
			camp.getEnterExpectedResponseCountValue().sendKeys("60");
			camp.getEnterExpectedRoiValue().sendKeys("30");
			camp.getEnterActualCostValue().sendKeys("100");
			camp.getEnterExpectedVenueValue().sendKeys("80");
			camp.getEnterActualSalesCountValue().sendKeys("70");
			camp.getEnterActualResponseCountValue().sendKeys("110");
			camp.getEnterActualRoiValue().sendKeys("90");
			camp.getClickOnCampSave().click();
			camp.getClickOnDelete().click();
			wLib.alert(driver);
		}
	
	@Test (groups = "RegressionTest")
	public void CreateCampaignTestClone() {

			CreateCampaignPage camp = new CreateCampaignPage(driver);
			WebDriverLib wLib = new WebDriverLib();
			HomePage hp = new HomePage(driver);
			WebElement mousehover = hp.getMoreIcon();
			wLib.moveToElement(driver, mousehover);
			
			hp.getClickOnCampaignsModule().click();
			
			camp.getClickOnPlusCreateCampIcon().click();
			camp.getEnterCampaignName().sendKeys("Camp");
			WebElement type = camp.getSelectCampaignType();
			wLib.selectByValue(type, "Conference");
			
			camp.getEnterTargetAudienceValue().sendKeys("");
			camp.getEnterSponsorValue().sendKeys("google");
			camp.getEnterNumSetValue().sendKeys("5");
			WebElement status = camp.getCampaignStatusDropdown();
			wLib.selectByValue(status, "Active");
			camp.getClickOnPlusProductIcon().click();
			
			String pWin = wLib.getParentWindowHandle(driver);
			
			wLib.switchToChildWindow(driver);
			
			camp.getSelectProductInChwin().click();
			wLib.switchToParent(driver, pWin);
					
			camp.getEnterTargetSizeValue().sendKeys("100");
			camp.getEnterBudgetCostValue().sendKeys("50");
			
			WebElement expresp = camp.getExpectedResponseDropdown();
			wLib.selectByValue(expresp, "Excellent");
			
			camp.getEnterExpectedSalesCountValue().sendKeys("40");
			camp.getEnterExpectedResponseCountValue().sendKeys("60");
			camp.getEnterExpectedRoiValue().sendKeys("30");
			camp.getEnterActualCostValue().sendKeys("100");
			camp.getEnterExpectedVenueValue().sendKeys("80");
			camp.getEnterActualSalesCountValue().sendKeys("70");
			camp.getEnterActualResponseCountValue().sendKeys("110");
			camp.getEnterActualRoiValue().sendKeys("90");
			camp.getClickOnCampSave().click();
			camp.getClickOnDelete().click();
			wLib.alert(driver);
	}
}
