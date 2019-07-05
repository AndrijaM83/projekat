package page.test;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.Objave;
import page.objects.Prijavljivanje;
import page.objects.Registracija;
import utility.Constant;
import utility.ExcelUtils;

public class RegistracijaExe {

	// Registration FROM EXCEL FILE

	public static void fillForm(WebDriver driver, int index) throws Exception {
		Registracija.clickFirstName(driver);
		Registracija.sendKeysFirstName(driver, ExcelUtils.getCellData(index, 0));

		Registracija.clickLastName(driver);
		Registracija.sendKeysLastName(driver, ExcelUtils.getCellData(index, 1));

		Registracija.clickUserName(driver);
		Registracija.sendKeysUserName(driver, ExcelUtils.getCellData(index, 2));

		Registracija.clickEmail(driver);
		Registracija.sendKeysEmail(driver, ExcelUtils.getCellData(index, 3));

		Registracija.clickPassword(driver);
		Registracija.sendKeysPassword(driver, ExcelUtils.getCellData(index, 4));

		Registracija.clickRegister(driver);

		Thread.sleep(4000);
	}

	// Registration MANUAL INPUT

	public static void fillFormManual() throws Exception {
		Scanner sc = new Scanner(System.in);

		// create variables for users input
		System.out.println("In order to register, input your First Name: ");
		String firstName = sc.nextLine();

		System.out.println("Last Name: ");
		String lastName = sc.nextLine();

		System.out.println("Username: ");
		String userName = sc.nextLine();

		System.out.println("Email(*@*): ");
		String email = sc.nextLine();

		System.out.println("Password: ");
		String password = sc.nextLine();

		System.out.println("Post you want to publish - Title: ");
		String title = sc.nextLine();

		System.out.println("Location: ");
		String location = sc.nextLine();

		System.out.println("Content: ");
		String content = sc.nextLine();

		WebDriver driver = new ChromeDriver();

		// MANUAL INPUT

		Registracija.clickFirstName(driver);
		Registracija.sendKeysFirstName(driver, firstName);

		Registracija.clickLastName(driver);
		Registracija.sendKeysLastName(driver, lastName);

		Registracija.clickUserName(driver);
		Registracija.sendKeysUserName(driver, userName);

		Registracija.clickEmail(driver);
		Registracija.sendKeysEmail(driver, email);

		Registracija.clickPassword(driver);
		Registracija.sendKeysPassword(driver, password);

		Registracija.clickRegister(driver);

		// Login

		Prijavljivanje.clickUserName(driver);
		Prijavljivanje.sendKeysUserName(driver, userName);

		Prijavljivanje.clickPassword(driver);
		Prijavljivanje.sendKeysPassword(driver, password);

		Prijavljivanje.clickLogin(driver);

		// Publish post

		Objave.clickMakePost(driver);

		Objave.clickTitle(driver);
		Objave.sendKeysTitle(driver, title);

		Objave.clickLocation(driver);
		Objave.sendKeysLocation(driver, location);

		Objave.clickWritePost(driver);
		Objave.sendKeysWritePost(driver, content);

		Objave.clickPushPost(driver);

		Thread.sleep(4000);

	}
}