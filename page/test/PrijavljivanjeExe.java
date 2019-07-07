package page.test;

import org.openqa.selenium.WebDriver;

import page.objects.Prijavljivanje;
import utility.ExcelUtils;

public class PrijavljivanjeExe {

	// Login / Validation FROM EXCEL FILE

	public static void login(WebDriver driver, int index) throws Exception {
		Prijavljivanje.clickUserName(driver);
		Prijavljivanje.sendKeysUserName(driver, ExcelUtils.getCellData(index, 2));

		Prijavljivanje.clickPassword(driver);
		Prijavljivanje.sendKeysPassword(driver, ExcelUtils.getCellData(index, 4));

		Prijavljivanje.clickLogin(driver);

		if (driver.getCurrentUrl().equals("http://localhost/izlet/dashboard.php")) {
			ExcelUtils.setCellData("Registration and login are valid.", index, 5);
			Prijavljivanje.clickLogout(driver);
		} else {
			ExcelUtils.setCellData("Registration and login failed.", index, 5);
		}
	}

	// Login / Validation MANUAL INPUT

	public static void loginSingle(WebDriver driver, int index) throws Exception {
		Prijavljivanje.clickUserName(driver);
		Prijavljivanje.sendKeysUserName(driver, ExcelUtils.getCellData(index, 2));

		Prijavljivanje.clickPassword(driver);
		Prijavljivanje.sendKeysPassword(driver, ExcelUtils.getCellData(index, 4));

		Prijavljivanje.clickLogin(driver);

	}

}