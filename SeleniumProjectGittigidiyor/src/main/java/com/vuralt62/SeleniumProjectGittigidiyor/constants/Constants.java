package com.vuralt62.SeleniumProjectGittigidiyor.constants;

import org.openqa.selenium.By;

public class Constants {
	public static final By CLICK_ADD_BASKET = By.id("add-to-basket");
	public static final By CLICK_DELETE_BASKET = By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div[2]/div[2]/div[1]/div[2]/div[6]/div[2]/div[2]/div[3]/div/div[2]/div/a[1]");
	public static final By PRICE = By.id("sp-price-discountPrice");
	public static final By PRICE2 = By.id("sp-price-lowPrice");
	public static final By LASTCOUNT = By.id("count-desc");
	public static final By TOTAL_PRICE = By.className("total-price");
	public static final By REAL_PRICE = By.className("real-discounted-price");
	public static final By LOW_PRICE = By.className("extra-discounted");
	public static final By USERNAME_FIELD = By.id("L-UserNameField");
	public static final By PASSWORD_FIELD = By.id("L-PasswordField");
	public static final By CLICK_LOGIN = By.id("gg-login-enter");
	public static final By SEARCH_FIELD = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/input");
	public static final By CLICK_SEARCH = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[2]/button");
	public static final By CLICK_CLOSE_BANNER = By.className("wis-clsbtn-77005");
	public static final By CLICK_CLOSE_COOKIES = By.xpath("/html/body/div[5]/div[3]/div/div/a/span");
	public static final By CLICK_PAGE_TWO = By.xpath("//*[@class=\"clearfix\"]/li[2]/a");
	public static final By CLICK_RANDOM_PRODUCT(int selected) {return By.xpath("//*[@product-index="+selected+"]");}
	public static final By ClICK_BASKET = By.xpath("//*[@id=\"header_wrapper\"]/div[4]/div[3]/div/a");
	public static final By DROPDOWN = By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div[2]/div[2]/div[1]/div[2]/div[6]/div[2]/div[2]/div[4]/div/div[2]/select");
	public static final By HOVER_LOGIN = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]/div");
	public static final By HOVER_LOGIN_MENU = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]/div[2]/div/div");
	public static final By CLICK_HOVER_LOGIN = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]/div[2]/div/div/div/a");
	public static final String URL = "https://www.gittigidiyor.com/";
	public static final String USERNAME = "EMAIL";
	public static final String PASSWORD = "PASSWORD";
	public static final String SEARCHTEXT = "bilgisayar";
}
