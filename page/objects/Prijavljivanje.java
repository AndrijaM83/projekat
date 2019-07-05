package page.objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Prijavljivanje {

	private static final String USERNAME = "//input[@placeholder='username']";
	private static final String PASSWORD = "//input[@placeholder='password']";
	private static final String LOGIN = "//input[@value='Log in']";
	private static final String LOGOUT = "//a[@id='logoutBtn']";

	// Username

	public static WebElement getUserName(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(USERNAME));
		return element;
	}

	public static void clickUserName(WebDriver driver) {
		getUserName(driver).click();
	}

	public static void sendKeysUserName(WebDriver driver, String input) {
		getUserName(driver).sendKeys(input);
	}

	// Password

	public static WebElement getPassword(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(PASSWORD));
		return element;
	}

	public static void clickPassword(WebDriver driver) {
		getPassword(driver).click();
	}

	public static void sendKeysPassword(WebDriver driver, String input) {
		getPassword(driver).sendKeys(input);
	}

	// Login

	public static WebElement getLogin(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(LOGIN));
		return element;
	}

	public static void clickLogin(WebDriver driver) {
		getLogin(driver).click();
	}

	// Logout

	public static WebElement getLogout(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(LOGOUT));
		return element;
	}

	public static void clickLogout(WebDriver driver) {
		getLogout(driver).click();
	}

}