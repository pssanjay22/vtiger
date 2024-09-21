package com.crm.vtiger.genriclibrary;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Sanjay
 *
 */
public class WebDriverLib implements IConstantLib {
/**
 *
 * To implicitly wait for element
 * @param driver
 */

	public void implictWait(WebDriver driver) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITILY_TIMEOUT));
	}
	
/**
 * Wait until elementToBeClickable
 * @param driver
 * @param ElementName
 */
	public void elementToBeClickable(WebDriver driver, WebElement ElementName)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITILY_TIMEOUT));
		wait.until(ExpectedConditions.elementToBeClickable(ElementName));
	}

/**
 * wait until visiblity of element
 * @param driver
 * @param ElementName
 */
	public void visibilityOf(WebDriver driver, WebElement ElementName)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITILY_TIMEOUT));
		wait.until(ExpectedConditions.visibilityOf(ElementName));
	}
	
/**
 * wait until url contains
 * @param driver
 * @param pageUrl
 */
	public void urlContains(WebDriver driver, String pageUrl)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITILY_TIMEOUT));
		wait.until(ExpectedConditions.urlContains(pageUrl));
	}

/**
 * To handle dropdown
 * @param ElementName
 * @param Value
 */
	public void selectByValue(WebElement ElementName , String Value)
	{
		Select sel = new Select(ElementName);
		sel.selectByValue(Value);
	}
	
/**
 * To handle dropdown
 * @param ElementName
 * @param Index
 */
	public void selectByIndex(WebElement ElementName , int Index)
	{
		Select sel = new Select(ElementName);
		sel.selectByIndex(Index);
	}
	
/**
 * To handle dropdown
 * @param ElementName
 * @param Text
 */
	public void selectByVisibleText(WebElement ElementName , String Text)
	{
		Select sel = new Select(ElementName);
		sel.selectByVisibleText(Text);
	}
	
/**
 * To get parent window
 * @param driver
 */
	
	public String getParentWindowHandle(WebDriver driver)
	{
		return driver.getWindowHandle();
	}
	
/**
 * To switch from parent window to child window
 * @param driver
 */
	public void switchToChildWindow(WebDriver driver)
	{
		String pWin = getParentWindowHandle(driver);
		Set<String> allWin = driver.getWindowHandles();
		
		for (String Window : allWin) 
		{
			if(!pWin.equals(Window))
			{
				driver.switchTo().window(Window);
				break;
			}
		}
	}
	
/**
 * To switch parent Window
 * @param driver
 * @param parentId
 */
	public void switchToParent(WebDriver driver, String parentId)
	{
		driver.switchTo().window(parentId);
	}

/**
 * To mousehover on element
 * @param driver
 * @param ElementName
 */
	public void moveToElement(WebDriver driver, WebElement ElementName) {
		Actions act = new Actions(driver);
		act.moveToElement(ElementName).perform();
	}
	
/**
 * To handle alert popup
 * @param driver
 */
	public void alert(WebDriver driver) 
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	
/**
 * To window maximize
 * @param driver
 */
	public void maximizeWindow(WebDriver driver) 
	{
		driver.manage().window().maximize();
	}
}
