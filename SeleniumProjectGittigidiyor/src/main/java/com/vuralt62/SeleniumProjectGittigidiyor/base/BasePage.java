package com.vuralt62.SeleniumProjectGittigidiyor.base;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	protected WebDriver driver = null;
	WebDriverWait wait = null;
	
	public BasePage (WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver,60);
	}
	
	public WebElement findElement (By by) {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
		return driver.findElement(by);
	}
	
	public void SendKeys (By by, String text) {
		findElement(by).sendKeys(text);
	}
	
	public void Click (By by) {
		wait.until(ExpectedConditions.elementToBeClickable(by));
		findElement(by).click();
	}
	
	public void hoverElement (By by) {
		Actions actions = new Actions(driver);
		actions.moveToElement(findElement(by)).build().perform();
	}
	
	public String getText (By by) {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
		return findElement(by).getText();
	}
	
	public int randomNum () {
		Random random = new Random();
        int selected = random.nextInt(48 - 1 + 1) + 1;
        return selected;
	}
	
	public void selectedableItem (By by, String count) {
		Select dropdown = new Select(findElement(by));  
        dropdown.selectByValue(count);
	}
	
	public String getDropdownText (By by) {
		Select dropdown = new Select(findElement(by));
		WebElement selectedOption = dropdown.getFirstSelectedOption();
        String count = selectedOption.getText();
        return count;
	}
}
