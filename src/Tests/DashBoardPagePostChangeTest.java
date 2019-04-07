package Tests;

import org.openqa.selenium.WebDriver;

import Izlet.DashBoardPage;
import Utility.Constant;
import Utility.ExcelUtils;

public class DashBoardPagePostChangeTest {                       //metoda za zamenu/dodavanje novog teksta u postu
	public static void fillForm(WebDriver dr, int i) throws Exception {

		String data = null;

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME_3);

		data = ExcelUtils.getCellData(3, i);                     //povlacimo podatke iz zadate kolone
		DashBoardPage.clickPostChange(dr);                       //kliknemo na dugme Post change
		DashBoardPage.clearPostChange(dr);                       //obrisemo tekst posta
		DashBoardPage.sendKeysPostChange(dr, data);              //posaljemo podatke u polje teksta

		DashBoardPage.clickPostChangeButton(dr);

	}

}
