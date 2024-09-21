package com.crm.vtiger.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage {

	WebDriver driver;
	public CreateCampaignPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement ClickOnPlusCreateCampIcon;
	
	@FindBy (xpath = "//input[@name='campaignname']")
	private WebElement EnterCampaignName;
	
	@FindBy (xpath = "//select[@name='campaigntype']")
	private WebElement SelectCampaignType;
	
	@FindBy (xpath = "//input[@name='targetaudience']")
	private WebElement EnterTargetAudienceValue;
	
	@FindBy (xpath = "//input[@name='sponsor']")
	private WebElement EnterSponsorValue;
	
	@FindBy (xpath = "//input[@name='numsent']")
	private WebElement EnterNumSetValue;
	
	@FindBy (xpath = "//select[@name='campaignstatus']")
	private WebElement CampaignStatusDropdown;
	
	@FindBy (xpath = "//img[@src='themes/softed/images/select.gif']")
	private WebElement ClickOnPlusProductIcon;
	
	@FindBy (xpath = "//a[text()='Vtiger Single User Pack']")
	private WebElement SelectProductInChwin;
	
	@FindBy (xpath = "//input[@name='targetsize']")
	private WebElement EnterTargetSizeValue;
	
	@FindBy (xpath = "//input[@name='budgetcost']")
	private WebElement EnterBudgetCostValue;
	
	@FindBy (xpath = "//select[@name='expectedresponse']")
	private WebElement ExpectedResponseDropdown;
	
	@FindBy (xpath = "//input[@name='expectedsalescount']")
	private WebElement EnterExpectedSalesCountValue;
	
	@FindBy (xpath = "//input[@name='expectedresponsecount']")
	private WebElement EnterExpectedResponseCountValue;
	
	@FindBy (xpath = "//input[@name='expectedroi']")
	private WebElement EnterExpectedRoiValue;
	
	@FindBy (xpath = "//input[@name='actualcost']")
	private WebElement EnterActualCostValue;
	
	@FindBy (xpath = "//input[@name='expectedrevenue']")
	private WebElement EnterExpectedVenueValue;
	
	@FindBy (xpath = "//input[@name='actualsalescount']")
	private WebElement EnterActualSalesCountValue;
	
	@FindBy (xpath = "//input[@name='actualresponsecount']")
	private WebElement EnterActualResponseCountValue;
	
	@FindBy (xpath = "//input[@name='actualroi']")
	private WebElement EnterActualRoiValue;
	
	@FindBy (xpath = "(//input[@title='Save [Alt+S]'])[2]")
	private WebElement ClickOnCampSave;
	
	@FindBy (xpath = "(//input[@title='Delete [Alt+D]'])[1]")
	private WebElement ClickOnDelete;
	
	public WebElement getClickOnPlusCreateCampIcon() {
		return ClickOnPlusCreateCampIcon;
	}

	public WebElement getEnterCampaignName() {
		return EnterCampaignName;
	}

	public WebElement getSelectCampaignType() {
		return SelectCampaignType;
	}

	public WebElement getEnterTargetAudienceValue() {
		return EnterTargetAudienceValue;
	}

	public WebElement getEnterSponsorValue() {
		return EnterSponsorValue;
	}

	public WebElement getEnterNumSetValue() {
		return EnterNumSetValue;
	}

	public WebElement getCampaignStatusDropdown() {
		return CampaignStatusDropdown;
	}

	public WebElement getClickOnPlusProductIcon() {
		return ClickOnPlusProductIcon;
	}

	public WebElement getSelectProductInChwin() {
		return SelectProductInChwin;
	}

	public WebElement getEnterTargetSizeValue() {
		return EnterTargetSizeValue;
	}

	public WebElement getEnterBudgetCostValue() {
		return EnterBudgetCostValue;
	}

	public WebElement getExpectedResponseDropdown() {
		return ExpectedResponseDropdown;
	}

	public WebElement getEnterExpectedSalesCountValue() {
		return EnterExpectedSalesCountValue;
	}

	public WebElement getEnterExpectedResponseCountValue() {
		return EnterExpectedResponseCountValue;
	}

	public WebElement getEnterExpectedRoiValue() {
		return EnterExpectedRoiValue;
	}

	public WebElement getEnterActualCostValue() {
		return EnterActualCostValue;
	}

	public WebElement getEnterExpectedVenueValue() {
		return EnterExpectedVenueValue;
	}

	public WebElement getEnterActualSalesCountValue() {
		return EnterActualSalesCountValue;
	}

	public WebElement getEnterActualResponseCountValue() {
		return EnterActualResponseCountValue;
	}

	public WebElement getEnterActualRoiValue() {
		return EnterActualRoiValue;
	}

	public WebElement getClickOnCampSave() {
		return ClickOnCampSave;
	}

	public WebElement getClickOnDelete() {
		return ClickOnDelete;
	}
	
}
