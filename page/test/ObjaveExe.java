package page.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page.objects.Objave;
import utility.Constant;
import utility.ExcelUtils;

public class ObjaveExe {

	// Create new post

	public static void newPost(WebDriver driver, int index) throws Exception {

		Objave.clickMakePost(driver);

		Objave.clickTitle(driver);
		Objave.sendKeysTitle(driver, ExcelUtils.getCellData(index, 1));

		Objave.clickLocation(driver);
		Objave.sendKeysLocation(driver, ExcelUtils.getCellData(index, 2));

		Objave.clickWritePost(driver);
		Objave.sendKeysWritePost(driver, ExcelUtils.getCellData(index, 0));

		Objave.clickPushPost(driver);
	}
}