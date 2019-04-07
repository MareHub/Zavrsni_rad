package Tests;

import org.openqa.selenium.*;

import Izlet.RegistrationPage;
import Utility.Constant;
import Utility.ExcelUtils;

public class LogInTest {           //metoda za popunu polja za logovanje iz excela
	public static void fillForm(WebDriver dr, int i) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME);

		RegistrationPage.clickUsernameLog(dr);                       //klikne na polje User name
		data = ExcelUtils.getCellData(i, 2);                         //povuce podatke iz excela
		RegistrationPage.sendKeysUsernameLog(dr, data);              //posalje podatke na sajt

		RegistrationPage.clickPasswordLog(dr);
		data = ExcelUtils.getCellData(i, 4);
		RegistrationPage.sendKeysPasswordLog(dr, data);

		RegistrationPage.clickLogIN(dr);                             //klikne na dugme log in

	}
                                 //metoda koja salje sve podatke za logovanje iz svakog reda iz excela
	public static void testWithAllData(WebDriver dr) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME);
		for (int i = 0; i < ExcelUtils.getWorkSheet().getLastRowNum() + 1; i++) {
			fillForm(dr, i);
			RegistrationPage.navigateTo(dr);                         //vraca na prethodnu stranu

		}

	}
}
