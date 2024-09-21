package com.crm.vtiger.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.genriclibrary.WebDriverLib;

public class HomePage extends WebDriverLib{

	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Contacts']")
	private WebElement ClickOnContactModule;
	
	@FindBy (xpath = "//a[text()='More']")
	private WebElement MoreIcon;
	
	@FindBy (xpath = "//a[text()='Campaigns']")
	private WebElement ClickOnCampaignsModule;
	
	@FindBy (xpath = "//a[text()='Organizations']")
	private WebElement ClickOnOrganizationsModule;
	
	@FindBy (xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement AdministatorIcon;
	
	@FindBy (xpath = "//a[text()='Sign Out']")
	private WebElement ClickOnSignOut;
	
	public WebElement getClickOnContactModule() {
		return ClickOnContactModule;
	}

	public WebElement getMoreIcon() {
		return MoreIcon;
	}
	
	public WebElement getClickOnCampaignsModule() {
		return ClickOnCampaignsModule;
	}

	public WebElement getClickOnOrganizationsModule() {
		return ClickOnOrganizationsModule;
	}

	public WebElement getAdministatorIcon() {
		return AdministatorIcon;
	}

	public WebElement getClickOnSignOut() {
		return ClickOnSignOut;
	}
	
/**
 * To signout from application
 */
	public void signOut(WebDriver driver) {
		
		moveToElement(driver, AdministatorIcon);
		ClickOnSignOut.click();
	}
}
