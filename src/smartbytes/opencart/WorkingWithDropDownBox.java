package smartbytes.opencart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDropDownBox {

	public static void main(String[] args) {

		String title = "Register Account";
		String actualTitle = " ";

		// 1. Open URL of Register
		String url = "https://smartbytes.v-logics.com/ocart/index.php?route=account/register";

		System.out.println("Registering Driver");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\Documents\\selenium\\chromedriver.exe");

		// Create instance of chrome
		WebDriver driver = new ChromeDriver();

		System.out.println("Opening URL: " + url);
		driver.get(url);

		// 2. Enter First Name, Last Name, Email, Telephone.
		actualTitle = driver.getTitle();
		System.out.println("Page Title is: " + actualTitle);

		if (actualTitle.equals(title)) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Title did not matched");
		}

		System.out.println("Selecting Country..");
		// Interact with drop down boxed
		WebElement countryElement = driver.findElement(By.name("country_id"));
		Select countrySelectBox = new Select(countryElement);
		countrySelectBox.selectByValue("13");

		// Giving time to selecting dropdown.
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println("Selecting Zone..");
		// zone = New South Wales
		WebElement zoneElement = driver.findElement(By.name("zone_id"));
		Select zoneSelectBox = new Select(zoneElement);
		zoneSelectBox.selectByVisibleText("New South Wales");

		System.out.println("Done..");

	}

}
