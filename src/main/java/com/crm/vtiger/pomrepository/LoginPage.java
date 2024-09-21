package com.crm.vtiger.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.genriclibrary.WebDriverLib;


public class LoginPage extends WebDriverLib{

/**
 * 
 * @author Sanjay
 * 
 */
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	
	@FindBy (xpath = "//input[@name='user_name']")
	private WebElement userName;
	 
	@FindBy (xpath = "//input[@name='user_password']")
	private WebElement userPwd;
	
	@FindBy (id = "submitButton")
	private WebElement subButton;
	public WebElement getUserName() {
		return userName;
	}

	
	public WebElement getUserPwd() {
		return userPwd;
	}

	public WebElement getSubButton() {
		return subButton;
	}
/**
 * To login vtiger application
 * @param URL
 * @param UN
 * @param PWD
 */
	
	public void loginToApp(String URL, String UN, String PWD) {
		driver.get(URL);
		userName.sendKeys(UN);
		userPwd.sendKeys(PWD);
		subButton.click();
		implictWait(driver);
		maximizeWindow(driver);
	}
	
}
