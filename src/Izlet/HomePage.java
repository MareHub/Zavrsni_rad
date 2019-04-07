package Izlet;

import org.openqa.selenium.*;

public class HomePage {                                   
	private static final String PAGE_URL = "http://localhost/izlet/";

	public static void openPage(WebDriver dr) {                     //metoda kojom pozivamo sajt
		dr.get(PAGE_URL);

	}
}
