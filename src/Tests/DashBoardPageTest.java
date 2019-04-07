package Tests;

import org.openqa.selenium.*;

import Izlet.DashBoardPage;
import Utility.Constant;
import Utility.ExcelUtils;

public class DashBoardPageTest {
	public static void MakePost(WebDriver driver) {
		DashBoardPage.clickMakePost(driver);
	}
                                                         //metoda koja popunjava podatke o novom postu iz excela
	public static void fillForm(WebDriver dr, int i) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME_2);

		DashBoardPage.clickNaziv(dr);                    //klikne na polje Naziv
		data = ExcelUtils.getCellData(i, 1);             //uzme podatak iz excela
		DashBoardPage.sendKeysNaziv(dr, data);           //posalje podatak u post

		DashBoardPage.clickLokacija(dr);
		data = ExcelUtils.getCellData(i, 2);
		DashBoardPage.sendKeysLokacija(dr, data);

		DashBoardPage.clickOpis(dr);
		data = ExcelUtils.getCellData(i, 0);
		DashBoardPage.sendKeysOpis(dr, data);

		DashBoardPage.clickPost(dr);                     //klikne na dugme za postovanje
	}

	public static void testWithAllData(WebDriver dr) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME_2);
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum() + 1; i++) {
			fillForm(dr, i);
			DashBoardPage.clickMakePost(dr);
		}

	}
}
