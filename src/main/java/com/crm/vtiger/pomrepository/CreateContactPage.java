package com.crm.vtiger.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {

	WebDriver driver;
	
	public CreateContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//select[@name='salutationtype']")
	private WebElement ClickOnFirstNameDropDown;
	
	@FindBy (xpath = "//a[text()='Contacts']")
	private WebElement ClickOnContact;
	
	@FindBy (xpath = "//img[@alt='Create Contact...']")
	private WebElement CLickOnPlusIconCreate;
	
	@FindBy (xpath = "//input[@name='firstname']")
	private WebElement EnterFirstName;
	
	@FindBy (xpath = "//input[@name='lastname']")
	private WebElement EnterLastName;
	
	@FindBy (xpath = "(//img[@src='themes/softed/images/select.gif'])[1]")
	private WebElement ClickOnOrgPlusIcon;
	
	@FindBy (xpath = "//a[text()='vtiger']")
	private WebElement SelectFirstEle;
	
	@FindBy (xpath = "//select[@name='leadsource']")
	private WebElement LeadSourceDropDown;
	
	@FindBy (xpath = "//input[@name='title']")
	private WebElement EnterTitle;
	
	@FindBy (xpath = "//input[@name='department']")
	private WebElement EnterDepartment;
	
	@FindBy (xpath = "//input[@name='email']")
	private WebElement EnterEmail;
	
	@FindBy (xpath = "//input[@name='emailoptout']")
	private WebElement SelectEmailoptOutCheckBox;
	
	@FindBy (xpath = "//input[@id='phone']")
	private WebElement EnterPhone;
	
	@FindBy (xpath = "//input[@name='birthday']")
	private WebElement EnterBirthday;
	
	@FindBy (xpath = "(//img[@src='themes/softed/images/select.gif'])[2]")
	private WebElement ClickOnReportsPlusIcon;
	
	@FindBy (xpath = "//select[@name='search_field']")
	private WebElement ClickOnSearchDropInChWin;
	
	@FindBy (xpath = "//input[@name='search']")
	private WebElement ClickOnSearch;
	
	@FindBy (xpath = "//a[@href='javascript:window.close();']")
	private WebElement SelectElementInCwin;
	
	@FindBy (xpath = "//textarea[@name='mailingstreet']")
	private WebElement EnterAddress;
	
	@FindBy(xpath = "//textarea[@name='otherstreet']")
	private WebElement EnterOtherAddress;
	
	@FindBy (xpath = "(//input[@title='Save [Alt+S]'])[2]")
	private WebElement ClickOnSave;

	@FindBy (xpath = "(//input[@title='Delete [Alt+D]'])[1]")
	private WebElement ClickOnDelete;
	
	public WebElement getClickOnFirstNameDropDown() {
		return ClickOnFirstNameDropDown;
	}
	
	public WebElement getClickOnContact() {
		return ClickOnContact;
	}
	
	public WebElement getCLickOnPlusIconCreate() {
		return CLickOnPlusIconCreate;
	}
	
	public WebElement getEnterFirstName() {
		return EnterFirstName;
	}

	public WebElement getEnterLastName() {
		return EnterLastName;
	}

	public WebElement getClickOnOrgPlusIcon() {
		return ClickOnOrgPlusIcon;
	}

	public WebElement getSelectFirstEle() {
		return SelectFirstEle;
	}

	public WebElement getLeadSourceDropDown() {
		return LeadSourceDropDown;
	}

	public WebElement getEnterTitle() {
		return EnterTitle;
	}

	public WebElement getEnterDepartment() {
		return EnterDepartment;
	}

	public WebElement getEnterEmail() {
		return EnterEmail;
	}

	public WebElement getSelectEmailoptOutCheckBox() {
		return SelectEmailoptOutCheckBox;
	}

	public WebElement getEnterPhone() {
		return EnterPhone;
	}

	public WebElement getEnterBirthday() {
		return EnterBirthday;
	}

	public WebElement getClickOnReportsPlusIcon() {
		return ClickOnReportsPlusIcon;
	}

	public WebElement getClickOnSearchDropInChWin() {
		return ClickOnSearchDropInChWin;
	}

	public WebElement getClickOnSearch() {
		return ClickOnSearch;
	}

	public WebElement getSelectElementInCwin() {
		return SelectElementInCwin;
	}

	public WebElement getEnterAddress() {
		return EnterAddress;
	}

	public WebElement getEnterOtherAddress() {
		return EnterOtherAddress;
	}

	public WebElement getClickOnSave() {
		return ClickOnSave;
	}
	
	public WebElement getClickOnDelete() {
		return ClickOnDelete;
	}
	
	
}
