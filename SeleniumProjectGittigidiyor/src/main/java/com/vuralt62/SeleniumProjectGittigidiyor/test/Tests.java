package com.vuralt62.SeleniumProjectGittigidiyor.test;

import com.vuralt62.SeleniumProjectGittigidiyor.base.BaseTest;
import com.vuralt62.SeleniumProjectGittigidiyor.page.BasketPage;
import com.vuralt62.SeleniumProjectGittigidiyor.page.LoginPage;
import com.vuralt62.SeleniumProjectGittigidiyor.page.ProductPage;
import com.vuralt62.SeleniumProjectGittigidiyor.page.SearchPage;

import org.junit.Before;

import org.junit.After;
import org.junit.Test;

public class Tests extends BaseTest{
	
	LoginPage loginPage;
	SearchPage searchPage;
	ProductPage productPage;
	BasketPage basketPage;
	
	@Before
	public void before () {
		loginPage = new LoginPage(getWebDriver());
		searchPage = new SearchPage(getWebDriver());
		productPage = new ProductPage(getWebDriver());
		basketPage = new BasketPage(getWebDriver());
	}
	
	@Test
	public void test () {
		loginPage.hoverLogin().hoverLoginMenu().clickLoginOnMenu().setUserName().setPassWord().clickLogin();
		searchPage.setSearchtext().clickSearch().closeCookies().goToPageTwo().controlPageTwo().selectItem();
		productPage.getPrice().clickAddBasket();
		basketPage.goToBasket().getBasketPrice().selectCount().getCountText().deleteItem();
	}
	
	@After
	public void after () {
		quitDriver();
	}
	
}
