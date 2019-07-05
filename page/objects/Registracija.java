package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registracija {

	private static final String FIRSTNAME = "//input[@name='firstname']";
	private static final String LASTNAME = "//input[@name='lastname']";
	private static final String USERNAME = "//form[@action='processregister.php']//input[@name='username']";
	private static final String EMAIL = "//input[@name='email']";
	private static final String PASSWORD = "//form[@action='processregister.php']//input[@name='password']";
	private static final String REGISTER = "//input[@id='blue_btn']";

	// First Name

	public static WebElement getFirstName(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(FIRSTNAME));
		return element;
	}

	public static void clickFirstName(WebDriver driver) {
		getFirstName(driver).click();
	}

	public static void sendKeysFirstName(WebDriver driver, String input) {
		getFirstName(driver).sendKeys(input);
	}

	// Last Name

	public static WebElement getLastName(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(LASTNAME));
		return element;
	}

	public static void clickLastName(WebDriver driver) {
		getLastName(driver).click();
	}

	public static void sendKeysLastName(WebDriver driver, String input) {
		getLastName(driver).sendKeys(input);
	}

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

	// Email

	public static WebElement getEmail(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(EMAIL));
		return element;
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	public static void sendKeysEmail(WebDriver driver, String input) {
		getEmail(driver).sendKeys(input);
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

	// Register

	public static WebElement getRegister(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(REGISTER));
		return element;
	}

	public static void clickRegister(WebDriver driver) {
		getRegister(driver).click();
	}

}