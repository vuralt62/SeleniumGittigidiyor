package com.vuralt62.SeleniumProjectGittigidiyor.page;

import org.openqa.selenium.WebDriver;

import com.vuralt62.SeleniumProjectGittigidiyor.base.BasePage;
import static com.vuralt62.SeleniumProjectGittigidiyor.constants.Constants.*;

public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	public SearchPage setSearchtext () {
		SendKeys(SEARCH_FIELD, SEARCHTEXT);
		return this;
	}
	
	public SearchPage clickSearch () {
		Click(CLICK_SEARCH);
		return this;
	}
	
	public SearchPage closeCookies () {
		Click(CLICK_CLOSE_COOKIES);
		return this;
	}
	public SearchPage closeBanner () {
		Click(CLICK_CLOSE_BANNER);
		return this;
	}
	public SearchPage goToPageTwo () {
		Click(CLICK_PAGE_TWO);
		return this;
	}
	
	public SearchPage controlPageTwo () {
		String currentPage = this.driver.getCurrentUrl();
		if(currentPage.contains("&sf=2")) {
			System.out.println("Current Page: Page 2");
		}
		else {
			System.out.println(currentPage);
		}
		return this;
	}
	
	public SearchPage selectItem () {
		Click(CLICK_RANDOM_PRODUCT(randomNum()));
		return this;
	}
}
