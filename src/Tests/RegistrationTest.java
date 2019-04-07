package Tests;

import org.openqa.selenium.*;

import Izlet.RegistrationPage;
import Utility.Constant;
import Utility.ExcelUtils;

public class RegistrationTest {                                 //metoda kojom popunjavamo polja za registraciju
	public static void fillForm(WebDriver dr, int i) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME);

		RegistrationPage.clickFirstName(dr);                    //kliknemo na polje First name
		data = ExcelUtils.getCellData(i, 0);                    //povucemo podatke iz excela
		RegistrationPage.sendKeysFirstName(dr, data);           //posaljemo podatke na sajt

		RegistrationPage.clickLastName(dr);
		data = ExcelUtils.getCellData(i, 1);
		RegistrationPage.sendKeysLastName(dr, data);

		RegistrationPage.clickUsername(dr);
		data = ExcelUtils.getCellData(i, 2);
		RegistrationPage.sendKeysUsername(dr, data);

		RegistrationPage.clickEmail(dr);
		data = ExcelUtils.getCellData(i, 3);
		RegistrationPage.sendKeysEmail(dr, data);

		RegistrationPage.clickPassword(dr);
		data = ExcelUtils.getCellData(i, 4);
		RegistrationPage.sendKeysPassword(dr, data);

		RegistrationPage.clickRegister(dr);                    //klikne na dugme za registrovanje
	}
                                                               //metoda koja šalje podatke iz svih kolona, za registrovanje
	public static void testWithAllData(WebDriver dr) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME);
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum() + 1; i++) {
			fillForm(dr, i);
			RegistrationPage.navigateTo(dr);                   //vraca na prethodnu stranu
		} 

	}
}
