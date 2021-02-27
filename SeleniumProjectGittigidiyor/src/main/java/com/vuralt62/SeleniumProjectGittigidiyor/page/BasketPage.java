package com.vuralt62.SeleniumProjectGittigidiyor.page;

import org.openqa.selenium.WebDriver;

import com.vuralt62.SeleniumProjectGittigidiyor.base.BasePage;
import static com.vuralt62.SeleniumProjectGittigidiyor.constants.Constants.*;


public class BasketPage extends BasePage {
		
	public BasketPage(WebDriver driver) {
		super(driver);
	}
	
	public BasketPage goToBasket () {
		Click(ClICK_BASKET);
		return this;
	}
	
	public BasketPage getBasketPrice () {
		String price = getText(TOTAL_PRICE);
		if(price == "" || price == null) {
			price = getText(LOW_PRICE);
		}
		else if (price == "" || price == null ) {
			price = getText(REAL_PRICE);
		}
		System.out.println("Basket Page Price: "+price);
		return this;
	}
	
	public BasketPage selectCount () {
		selectedableItem(DROPDOWN,"2");
		return this;
	}
	
	public BasketPage getCountText () {
		String count = getDropdownText(DROPDOWN);
		System.out.println("Selected Product Count: "+count.trim());
		return this;
	}
	
	public BasketPage deleteItem () {
		Click(CLICK_DELETE_BASKET);
		return this;
	}
}
