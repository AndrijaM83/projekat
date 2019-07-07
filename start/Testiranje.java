package start;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.Prijavljivanje;
import page.test.ObjaveExe;
import page.test.PrijavljivanjeExe;
import page.test.RegistracijaExe;
import utility.Constant;
import utility.ExcelUtils;

public class Testiranje {

	// Choose input method: MANUAL or FROM EXCEL FILE

	public static void testIzlet() throws Exception {

		Scanner sc = new Scanner(System.in);
		int j;
		System.out.println("Choose input method - for automated input press 1, for manual input press 2.");

		// Select input option

		while (true) {
			String input = sc.nextLine();

			switch (input) {

			// Automated input

			case "1":
				WebDriver driver = new ChromeDriver();

				driver.manage().window().fullscreen();
				driver.get(Constant.URL);

				// Reading of EXCEL FILE

				ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME1);

				// Registration of users FROM EXCEL FILE

				for (j = 1; j <= ExcelUtils.getWorkSheet().getLastRowNum(); j++) {
					RegistracijaExe.fillForm(driver, j);
					PrijavljivanjeExe.login(driver, j);

					System.out.print((j + 1) + ": " + ExcelUtils.getCellData(j, 5) + "\n");
				}

				PrijavljivanjeExe.loginSingle(driver, 3);
				Prijavljivanje.clickLogout(driver);

				driver.quit();

				// MANUAL INPUT

			case "2":

				RegistracijaExe.fillFormManual();

				// Input valid option

			default:
				System.out.println("Press 1 or 2.");

			}
		}
	}
}