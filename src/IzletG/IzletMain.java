package IzletG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Izlet.DashBoardPage;
import Izlet.HomePage;
import Izlet.RegistrationPage;
import Tests.RegistrationTest;
import Tests.RegistrationTestMojiPodaci;
import Tests.DashBoardPagePostChangeTest;
import Tests.DashBoardPageTest;
import Tests.DashBoardPageTestMojiPodaci;
import Tests.LogInTest;
import Tests.LogInTestMojiPodaci;

import org.openqa.selenium.*;

public class IzletMain {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		try {
			HomePage.openPage(driver);                                       // pozivamo sajt
			Thread.sleep(1000);
			RegistrationTest.testWithAllData(driver);                        // registruje se sa podacima iz excela
			Thread.sleep(2000);
			LogInTest.testWithAllData(driver);                               // loguje se sa podacima iz excela
			Thread.sleep(2000);
			// RegistrationTestMojiPodaci.fillForm(driver, 0);               // bonus - registruje se sa podacima iz mog excela
			// Thread.sleep(1000);
			// LogInTestMojiPodaci.fillForm(driver, 0);                      // bonus - logovanje sa podacima iz mog excela
			// Thread.sleep(1000);
			RegistrationPage.UserConsoleRegistration(driver);                // registracija preko konzole
			Thread.sleep(3000);
			RegistrationPage.UserConsoleLogIn(driver);                       // logovanje preko konzole
			Thread.sleep(3000);
			DashBoardPage.clickMakePost(driver);                             // pravimo novi post
			Thread.sleep(1000);
			DashBoardPageTest.testWithAllData(driver);                       // ubacujemo u post podatke iz excela
			Thread.sleep(2000);
			DashBoardPageTestMojiPodaci.fillForm(driver, 1);                 // ubacujemo podatke usera
			Thread.sleep(2000);
			DashBoardPage.clickMakePost(driver);
			Thread.sleep(1000);
			DashBoardPageTestMojiPodaci.fillForm(driver, 2);                 // bonus post usera
			Thread.sleep(2000);
			DashBoardPage.clickPostMenu(driver, 0);
			Thread.sleep(1000);
			DashBoardPage.PostDelete(driver, 0);                             // brisemo post
			Thread.sleep(1000);
			DashBoardPage.clickPostMenu(driver, 0);
			Thread.sleep(1000);
			DashBoardPage.clickPostEdit(driver, 0);                          // editujemo post
			Thread.sleep(1000);
			DashBoardPage.clickPostChange(driver);         
			Thread.sleep(1000);
			DashBoardPagePostChangeTest.fillForm(driver, 0);                 //menjamo tekst u postu
			Thread.sleep(1000);
			DashBoardPage.clickPostChangeButton(driver);

		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}
}
