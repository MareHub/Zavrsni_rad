package Tests;

import org.openqa.selenium.WebDriver;

import Izlet.RegistrationPage;
import Utility.Constant;
import Utility.ExcelUtils;

public class LogInTestMojiPodaci {                                   // metoda koja salje podatke iz mog excela, za logovanje
	public static void fillForm(WebDriver dr, int i) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME_3);

		RegistrationPage.clickUsernameLog(dr);                      // klikne na polje User name
		data = ExcelUtils.getCellData(i, 2);                        // uzme podatak iz excela
		RegistrationPage.sendKeysUsernameLog(dr, data);             // posalje podatak na sajt

		RegistrationPage.clickPasswordLog(dr);
		data = ExcelUtils.getCellData(i, 4);
		RegistrationPage.sendKeysPasswordLog(dr, data);

		RegistrationPage.clickLogIN(dr);                            // klikne na dugme log in
	}
}
