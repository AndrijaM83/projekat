package page.objects;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Objave {

	private static String MAKEPOST = "//a[contains(text(),'Make a post')]";
	private static String TITLE = "//input[@placeholder='Naziv']";
	private static String LOCATION = "//input[@placeholder='Lokacija']";
	private static String WRITEPOST = "//textarea[@placeholder='Opis']";
	private static String PUBLISHPOST = "//input[@value='Post']";

	private static String MOREBUTTON = "fa-ellipsis-v";
	private static String EDITBUTTON = "fa-edit";
	private static String DELETEBUTTON = "fa-trash-alt";
	private static String EDITPOST = "//div[@class='popupEdit']//textarea[@name='description']";
	private static String PUBLISHEDIT = "//div[@class='popupEdit']//input[@value='Post']";

	// Make a post

	public static WebElement getMakePost(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(MAKEPOST));
		return element;
	}

	public static void clickMakePost(WebDriver driver) {
		getMakePost(driver).click();
	}

	// Title

	public static WebElement getTitle(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(TITLE));
		return element;
	}

	public static void clickTitle(WebDriver driver) {
		getTitle(driver).click();
	}

	public static void sendKeysTitle(WebDriver driver, String input) {
		getTitle(driver).sendKeys(input);
	}

	// Location

	public static WebElement getLocation(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(LOCATION));
		return element;
	}

	public static void clickLocation(WebDriver driver) {
		getLocation(driver).click();
	}

	public static void sendKeysLocation(WebDriver driver, String input) {
		getLocation(driver).sendKeys(input);
	}

	// Write post

	public static WebElement getWritePost(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(WRITEPOST));
		return element;
	}

	public static void clickWritePost(WebDriver driver) {
		getWritePost(driver).click();
	}

	public static void sendKeysWritePost(WebDriver driver, String input) {
		getWritePost(driver).sendKeys(input);
	}

	// Publish post

	public static WebElement getPushPost(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(PUBLISHPOST));
		return element;
	}

	public static void clickPushPost(WebDriver driver) {
		getPushPost(driver).click();
	}

	public static void getMoreButton(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public static void getDelete(WebDriver driver) {
		// TODO Auto-generated method stub

	}

}