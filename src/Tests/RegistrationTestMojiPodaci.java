package Tests;

import org.openqa.selenium.WebDriver;

import Izlet.RegistrationPage;
import Utility.Constant;
import Utility.ExcelUtils;

public class RegistrationTestMojiPodaci {
                                                                //metoda kojom se registrujemo na sajt sa podacima iz mog excela
	public static void fillForm(WebDriver dr, int i) throws Exception {

		String data = null;

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME_3);

		RegistrationPage.clickFirstName(dr);                    //kliknemo na polje First name
		data = ExcelUtils.getCellData(i, 0);                    //povucemo podatke iz excela
		RegistrationPage.sendKeysFirstName(dr, data);           //posaljemo podatke

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

		RegistrationPage.clickRegister(dr);                     //kliknemo na dugme za registrovanje

	}
}
