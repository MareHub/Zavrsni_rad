package Izlet;

import java.util.List;                                                //metoda za pronalaženje, odabir i unos podatka u element
                                                                      //posta iz excel tabele, kao i brisanje i editovanje celog
import org.openqa.selenium.By;                                        //posta
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DashBoardPage {                                          //putanje do elemenata posta

	public static final String PAGE_URL = "http://localhost/izlet/dashboard.php";
	private static final String MAKEPOST = "//a[contains(text(),'Make a post')]";
	private static final String NAZIV = "//input[@placeholder='Naziv']";
	private static final String LOKACIJA = "//input[@placeholder='Lokacija']";
	private static final String OPIS = "//textarea[@placeholder='Opis']";
	private static final String POST = "//input[@value='Post']";
	private static final String POSTMENU = "fa-ellipsis-v";
	private static final String POSTDELETE = "fa-trash-alt";
	private static final String POSTEDIT = "fa-edit";
	private static final String POSTCHANGE = "//textarea[@id='description']";
	private static final String POSTCHANGEBUTTON = "//div[@class='popupEdit']//input[@value='Post']";

	public static WebElement getMakePost(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(MAKEPOST));            //pronalazimo dugme Post
		return wb;
	}

	public static void clickMakePost(WebDriver dr) {                   //kliknemo na njega
		getMakePost(dr).click();
	}

	public static WebElement getNaziv(WebDriver dr) {                   //pronalazimo polje Naziv
		WebElement wb = dr.findElement(By.xpath(NAZIV));
		return wb;
	}

	public static void clickNaziv(WebDriver dr) {                       //kliknemo na polje Naziv
		getNaziv(dr).click();
	}

	public static void sendKeysNaziv(WebDriver dr, String str) {        //popunjavaju se podaci u polje Naziv iz excel tabele
		getNaziv(dr).sendKeys(str);
	}

	public static WebElement getLokacija(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(LOKACIJA));
		return wb;
	}

	public static void clickLokacija(WebDriver dr) {
		getLokacija(dr).click();
	}

	public static void sendKeysLokacija(WebDriver dr, String str) {
		getLokacija(dr).sendKeys(str);
	}

	public static WebElement getOpis(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(OPIS));
		return wb;
	}

	public static void clickOpis(WebDriver dr) {
		getOpis(dr).click();
	}

	public static void sendKeysOpis(WebDriver dr, String str) {
		getOpis(dr).sendKeys(str);
	}

	public static WebElement getOPis(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(OPIS));
		return wb;
	}

	public static void clickOPis(WebDriver dr) {
		getOpis(dr).click();
	}

	public static WebElement getPost(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(POST));
		return wb;
	}

	public static void clickPost(WebDriver dr) {
		getPost(dr).click();
	}

	public static void navigateTo(WebDriver dr) {
		dr.navigate().to(PAGE_URL);
	}

	public static WebElement getPostMenu(WebDriver dr) {
		WebElement wb = dr.findElement(By.className(POSTMENU));
		return wb;
	}

	public static void clickPostMenu(WebDriver dr, int i) {
		List<WebElement> menu = dr.findElements(By.className(POSTMENU));
		menu.get(i).click();
	}

	public static void PostDelete(WebDriver dr, int i) {
		List<WebElement> delete = dr.findElements(By.className(POSTDELETE));
		delete.get(i).click();
	}

	public static void clickPostEdit(WebDriver dr, int i) {
		List<WebElement> edit = dr.findElements(By.className(POSTEDIT));
		edit.get(i).click();
	}

	public static WebElement getPostChange(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(POSTCHANGE));
		return wb;
	}

	public static void clickPostChange(WebDriver dr) {
		getPostChange(dr).click();
	}

	public static void clearPostChange(WebDriver dr) {
		getPostChange(dr).clear();
	}

	public static void sendKeysPostChange(WebDriver dr, String str) {
		getPostChange(dr).sendKeys(str);
	}

	public static WebElement getPostChangeButton(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(POSTCHANGEBUTTON));
		return wb;
	}

	public static void clickPostChangeButton(WebDriver dr) {
		getPostChangeButton(dr).click();
	}

}
