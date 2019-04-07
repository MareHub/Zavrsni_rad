package Izlet;

import java.util.Scanner;                                              //metoda za pronalazenje, obeležavanje i unos u polja za
                                                                       //registraciju i logovanje sa podacima iz excela
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {                                         //putanje do odredjenih polja na sajtu     

	public static final String PAGE_URL = "http://localhost/izlet/";
	private static final String USERNAMELOG = "//input[@placeholder='username']";
	private static final String PASSWORDLOG = "//input[@placeholder='password']";
	private static final String LOGIN = "//input[@value='Log in']";
	private static final String FIRSTNAME = "//input[@name='firstname']";
	private static final String LASTNAME = "//input[@name='lastname']";
	private static final String USERNAME = "//form[@action='processregister.php']//input[@name='username']";
	private static final String EMAIL = "//input[@name='email']";
	private static final String PASSWORD = "//form[@action='processregister.php']//input[@name='password']";
	private static final String REGISTER = "//input[@id='blue_btn']";

	public static WebElement getUsernameLog(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(USERNAMELOG));           //trazimo polje User name
		return wb;
	}

	public static void clickUsernameLog(WebDriver dr) {                  //kliknemo na polje User name
		getUsernameLog(dr).click();
	}

	public static void sendKeysUsernameLog(WebDriver dr, String str) {   //saljemo podatak za polje User name
		getUsernameLog(dr).sendKeys(str);
	}

	public static WebElement getPasswordLog(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(PASSWORDLOG));
		return wb;
	}

	public static void clickPasswordLog(WebDriver dr) {
		getPasswordLog(dr).click();
	}

	public static void sendKeysPasswordLog(WebDriver dr, String str) {
		getPasswordLog(dr).sendKeys(str);
	}

	public static WebElement getLogIn(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(LOGIN));
		return wb;
	}

	public static void clickLogIN(WebDriver dr) {
		getLogIn(dr).click();
	}

	public static WebElement getFirstName(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(FIRSTNAME));
		return wb;
	}

	public static void clickFirstName(WebDriver dr) {
		getFirstName(dr).click();
	}

	public static void sendKeysFirstName(WebDriver dr, String str) {
		getFirstName(dr).sendKeys(str);
	}

	public static WebElement getLastName(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(LASTNAME));
		return wb;
	}

	public static void clickLastName(WebDriver dr) {
		getLastName(dr).click();
	}

	public static void sendKeysLastName(WebDriver dr, String str) {
		getLastName(dr).sendKeys(str);
	}

	public static WebElement getUsername(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(USERNAME));
		return wb;
	}

	public static void clickUsername(WebDriver dr) {
		getUsername(dr).click();
	}

	public static void sendKeysUsername(WebDriver dr, String str) {
		getUsername(dr).sendKeys(str);
	}

	public static WebElement getEmail(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(EMAIL));
		return wb;
	}

	public static void clickEmail(WebDriver dr) {
		getEmail(dr).click();
	}

	public static void sendKeysEmail(WebDriver dr, String str) {
		getEmail(dr).sendKeys(str);
	}

	public static WebElement getPassword(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(PASSWORD));
		return wb;
	}

	public static void clickPassword(WebDriver dr) {
		getPassword(dr).click();
	}

	public static void sendKeysPassword(WebDriver dr, String str) {
		getPassword(dr).sendKeys(str);
	}

	public static WebElement getRegister(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(REGISTER));
		return wb;
	}

	public static void clickRegister(WebDriver dr) {
		getRegister(dr).click();
	}

	public static void navigateTo(WebDriver dr) {
		dr.navigate().to(PAGE_URL);
	}

	public static void UserConsoleRegistration(WebDriver dr) {      //metoda za unos podataka za registrovanje preko konzole
		String firstName, lastName, userName, email, password;
		Scanner input = new Scanner(System.in);

		System.out.println("REGISTRUJ SE");

		System.out.println("Unesi First name: ");                    //program isisuje tekst iz zagrade
		firstName = input.next();
		System.out.println("Unesi Last name: ");
		lastName = input.next();
		System.out.println("Unesi User name: ");
		userName = input.next();
		System.out.println("Unesi Email: ");
		email = input.next();
		System.out.println("Unesi Password: ");
		password = input.next();

		RegistrationPage.sendKeysFirstName(dr, firstName);           //program salje podatke unete u konzoli za polje User name 
		RegistrationPage.sendKeysLastName(dr, lastName);
		RegistrationPage.sendKeysUsername(dr, userName);
		RegistrationPage.sendKeysEmail(dr, email);
		RegistrationPage.sendKeysPassword(dr, password);
		RegistrationPage.clickRegister(dr);
	}
	
	public static void UserConsoleLogIn(WebDriver dr) {              //metoda kojom se logujemo sa podacima unetim iz konzole
		String userName, password;
		Scanner input = new Scanner(System.in);

		System.out.println("LOGUJ SE");

	
		System.out.println("Unesi User name: ");
		userName = input.next();	
		System.out.println("Unesi Password: ");
		password = input.next();

		
		RegistrationPage.sendKeysUsernameLog(dr, userName);		
		RegistrationPage.sendKeysPasswordLog(dr, password);
		RegistrationPage.clickLogIN(dr);
}
}
