package com.crm.vtiger.campaigns;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.vtiger.genriclibrary.BaseClass;
import com.crm.vtiger.genriclibrary.WebDriverLib;
import com.crm.vtiger.pomrepository.CreateCampaignPage;
import com.crm.vtiger.pomrepository.HomePage;

public class CreateCampaign extends BaseClass{

	@Test (retryAnalyzer = com.crm.vtiger.genriclibrary.RetryAnalyserImplementation.class)
	public void createCampaign() throws Throwable {
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
		
		CreateCampaignPage camp = new CreateCampaignPage(driver);
		WebDriverLib wLib = new WebDriverLib();
		HomePage hp = new HomePage(driver);
		WebElement mousehover = hp.getMoreIcon();
		wLib.moveToElement(driver, mousehover);
		
//		WebElement mousehover = driver.findElement(By.xpath("//a[text()='More']"));
//		Actions act = new Actions(driver);
//		act.moveToElement(mousehover).perform();
		
		hp.getClickOnCampaignsModule().click();
		
		camp.getClickOnPlusCreateCampIcon().click();
		camp.getEnterCampaignName().sendKeys("Camp");
		WebElement type = camp.getSelectCampaignType();
		wLib.selectByValue(type, "Conference");
		
//		driver.findElement(By.xpath("//a[text()='Campaigns']")).click();
//		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
//		driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys("Camp");
//		WebElement type = driver.findElement(By.xpath("//select[@name='campaigntype']"));
//		
//		Select sel = new Select(type);
//		sel.selectByValue("Conference");
		
		camp.getEnterTargetAudienceValue().sendKeys("");
		camp.getEnterSponsorValue().sendKeys("google");
		camp.getEnterNumSetValue().sendKeys("5");
		WebElement status = camp.getCampaignStatusDropdown();
		wLib.selectByValue(status, "Active");
		camp.getClickOnPlusProductIcon().click();
		
//		driver.findElement(By.xpath("//input[@name='targetaudience']")).sendKeys("100");
//		driver.findElement(By.xpath("//input[@name='sponsor']")).sendKeys("google");
//		driver.findElement(By.xpath("//input[@name='numsent']")).sendKeys("5");
//		WebElement status = driver.findElement(By.xpath("//select[@name='campaignstatus']"));
//		
//		Select sel1 = new Select(status);
//		sel1.selectByValue("Active");
		

//		driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
		
		String pWin = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		
		for (String window : allwin) 
		{
			if (!pWin.equals(window)) 
			{
				driver.switchTo().window(window);
				break;
			}
		}
		
		camp.getSelectProductInChwin().click();
		
//		driver.findElement(By.xpath("//a[text()='Vtiger Single User Pack']")).click();
		
		driver.switchTo().window(pWin);
		
		camp.getEnterTargetSizeValue().sendKeys("100");
		camp.getEnterBudgetCostValue().sendKeys("50");
		
//		driver.findElement(By.xpath("//input[@name='targetsize']")).sendKeys("100");
//		driver.findElement(By.xpath("//input[@name='budgetcost']")).sendKeys("50");
		
		WebElement expresp = camp.getExpectedResponseDropdown();
		wLib.selectByValue(expresp, "Excellent");
		
//		WebElement expresp = driver.findElement(By.xpath("//select[@name='expectedresponse']"));
//		Select sel2 = new Select(expresp);
//		sel2.selectByValue("Excellent");
		
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
		
//		driver.findElement(By.xpath("//input[@name='expectedsalescount']")).sendKeys("40");
//		driver.findElement(By.xpath("//input[@name='expectedresponsecount']")).sendKeys("60");
//		driver.findElement(By.xpath("//input[@name='expectedroi']")).sendKeys("30");
//		driver.findElement(By.xpath("//input[@name='actualcost']")).sendKeys("100");
//		driver.findElement(By.xpath("//input[@name='expectedrevenue']")).sendKeys("80");
//		driver.findElement(By.xpath("//input[@name='actualsalescount']")).sendKeys("70");
//		driver.findElement(By.xpath("//input[@name='actualresponsecount']")).sendKeys("110");
//		driver.findElement(By.xpath("//input[@name='actualroi']")).sendKeys("90");
//		
//		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();
//		driver.findElement(By.xpath("(//input[@title='Delete [Alt+D]'])[1]")).click();
//		
//		Alert alt = driver.switchTo().alert();
//		alt.accept();
//		
//		WebElement move = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
//		Actions act1 = new Actions(driver);
//		act1.moveToElement(move).perform();
//		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
//		
//		driver.quit();
	}

}
