package com.crm.vtiger.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {

	WebDriver driver;
	public CreateOrganizationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement ClickOnPlusOrgIcon;
	
	@FindBy (xpath = "//input[@name='accountname']")
	private WebElement EnterOrgName;
	
	@FindBy (xpath = "//input[@name='website']")
	private WebElement EnterWebSite;
	
	@FindBy (xpath = "//img[@src='themes/softed/images/select.gif']")
	private WebElement ClickOnAddMemIcon;
	
	@FindBy (xpath = "//a[text()='vtiger']")
	private WebElement SelectMemInChWin;
	
	@FindBy (xpath = "//select[@name='industry']")
	private WebElement SelectIndustryDropDown;
	
	@FindBy (xpath = "//textarea[@name='bill_street']")
	private WebElement EnterBillAddress;
	
	@FindBy (xpath = "//input[@name='bill_pobox']")
	private WebElement EnterBillPoBox;
	
	@FindBy (xpath = "//input[@name='bill_city']")
	private WebElement EnterBillCity;
	
	@FindBy (xpath = "//input[@name='bill_state']")
	private WebElement EnterBillState;
	
	@FindBy (xpath = "//input[@name='bill_code']")
	private WebElement EnterBillCode;
	
	@FindBy (xpath = "//input[@name='bill_country']")
	private WebElement EnterBillCountry;
	
	@FindBy (xpath = "//input[@onclick='return copyAddressRight(EditView)']")
	private WebElement ClickOnCopyBillAddressRadioButton;
	
	@FindBy (xpath = "(//input[@title='Save [Alt+S]'])[2]")
	private WebElement ClickOnSaveOrgButton;
	
	@FindBy (xpath = "(//input[@title='Delete [Alt+D]'])[1]")
	private WebElement ClickOnDeleteOrg;
	
	public WebElement getClickOnPlusOrgIcon() {
		return ClickOnPlusOrgIcon;
	}

	public WebElement getEnterOrgName() {
		return EnterOrgName;
	}

	public WebElement getEnterWebSite() {
		return EnterWebSite;
	}

	public WebElement getClickOnAddMemIcon() {
		return ClickOnAddMemIcon;
	}

	public WebElement getSelectMemInChWin() {
		return SelectMemInChWin;
	}

	public WebElement getSelectIndustryDropDown() {
		return SelectIndustryDropDown;
	}

	public WebElement getEnterBillAddress() {
		return EnterBillAddress;
	}

	public WebElement getEnterBillPoBox() {
		return EnterBillPoBox;
	}

	public WebElement getEnterBillCity() {
		return EnterBillCity;
	}

	public WebElement getEnterBillState() {
		return EnterBillState;
	}

	public WebElement getEnterBillCode() {
		return EnterBillCode;
	}

	public WebElement getEnterBillCountry() {
		return EnterBillCountry;
	}

	public WebElement getClickOnCopyBillAddressRadioButton() {
		return ClickOnCopyBillAddressRadioButton;
	}

	public WebElement getClickOnSaveOrgButton() {
		return ClickOnSaveOrgButton;
	}

	public WebElement getClickOnDeleteOrg() {
		return ClickOnDeleteOrg;
	}
	
}
