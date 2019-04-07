package Tests;

import org.openqa.selenium.WebDriver;

import Izlet.DashBoardPage;
import Utility.Constant;
import Utility.ExcelUtils;

public class DashBoardPageTestMojiPodaci {

	public static void fillForm(WebDriver dr, int i) throws Exception {

		String data = null;                                     //metoda kojom popunjavaju podaci novog posta iz mog excela

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME_3);

		DashBoardPage.clickNaziv(dr);                           //kliknemo na polje Naziv
		data = ExcelUtils.getCellData(i, 0);                    //povlacimo podatak iz excela
		DashBoardPage.sendKeysNaziv(dr, data);                  //saljemo podatak u novi post

		DashBoardPage.clickLokacija(dr);
		data = ExcelUtils.getCellData(i, 1);
		DashBoardPage.sendKeysLokacija(dr, data);

		DashBoardPage.clickOpis(dr);
		data = ExcelUtils.getCellData(i, 2);
		DashBoardPage.sendKeysOpis(dr, data);

		DashBoardPage.clickPost(dr);                            //kliknemo na dugme za postovanje

	}
}
