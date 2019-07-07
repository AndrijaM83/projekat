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

	// Delete post(s), where "n" is the number of posts to delete

	public static void deletePost(WebDriver driver, int n) throws Exception {

		for (int index = 1; index <= n; index++) {
			Objave.getMoreButton(driver);
			Objave.getDelete(driver);
		}
	}

	// Edit last post

	public static void editPost(WebDriver driver) throws Exception {
		Objave.getMoreButton(driver);
		Objave.getEdit(driver);
		Objave.editPost(driver);
		Objave.publishEdit(driver);
	}
}