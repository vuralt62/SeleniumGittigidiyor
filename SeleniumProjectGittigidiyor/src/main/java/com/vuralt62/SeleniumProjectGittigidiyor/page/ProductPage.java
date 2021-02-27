package com.vuralt62.SeleniumProjectGittigidiyor.page;

import org.openqa.selenium.WebDriver;

import com.vuralt62.SeleniumProjectGittigidiyor.base.BasePage;
import static com.vuralt62.SeleniumProjectGittigidiyor.constants.Constants.*;

public class ProductPage extends BasePage{

	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	public ProductPage getPrice () {
		String price = getText(PRICE);
		if(price == "" || price == null) {
			price = getText(PRICE2);
		}
		System.out.println("Product Page Price: "+price);
		return this;
	}
	
	public ProductPage clickAddBasket () {
		Click(CLICK_ADD_BASKET);
		return this;
	}

}
