package com.vuralt62.SeleniumProjectGittigidiyor.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Before;
import static com.vuralt62.SeleniumProjectGittigidiyor.constants.Constants.*;


public class BaseTest {
	static WebDriver webDriver = null;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\java\\com\\vuralt62\\SeleniumProjectGittigidiyor\\base\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		setWebDriver(new ChromeDriver(options));
		getWebDriver().navigate().to(URL);
	}
	
	public static WebDriver getWebDriver() {
		return webDriver;
	}
	
	public static void setWebDriver(WebDriver webDriver) {
		BaseTest.webDriver = webDriver;
	}
	
	public void quitDriver() {
		getWebDriver().quit();
	}

}
