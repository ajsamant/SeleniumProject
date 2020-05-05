package smartbytes.opencart;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CompleteProgramForRegisterPage {

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

		System.out.println("Entering Personal Details..");

		// Enter first name
		driver.findElement(By.name("firstname")).sendKeys("Aj");
		// Enter last name
		driver.findElement(By.name("lastname")).sendKeys("Sam");
		// Enter Email
		driver.findElement(By.name("email")).sendKeys("ak.sn@yum.com");
		// Enter telephone
		driver.findElement(By.name("telephone")).sendKeys("1234567");
		// Enter Fax
		driver.findElement(By.name("fax")).sendKeys("1234567");

		System.out.println("Entering Address Details..");
		// Enter Company
		driver.findElement(By.name("company")).sendKeys("YUM");
		// Enter CompanyID
		driver.findElement(By.name("company_id")).sendKeys("007");
		// Enter Address1
		driver.findElement(By.name("address_1")).sendKeys("420 Address St. CT, USA");
		// Enter Address2
		driver.findElement(By.name("address_2")).sendKeys("UNIT-13");
		// Enter City
		driver.findElement(By.name("city")).sendKeys("HEART");
		// Enter Postal Code
		driver.findElement(By.name("postcode")).sendKeys("42007");

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

		// Enter Password
		driver.findElement(By.name("password")).sendKeys("YUM@007");
		// Enter Password Confirm
		driver.findElement(By.name("confirm")).sendKeys("YUM@007");

		System.out.println("Selecting Newsletter..");
		// Interact with Radio Button
		List<WebElement> newsletterRadioButton = driver.findElements(By.name("newsletter"));
		newsletterRadioButton.get(0).click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
		newsletterRadioButton.get(1).click();

		// Checkboxes
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		driver.findElement(By.name("agree")).click();
		
		System.out.println("Ckicking Continue..");
		// Clicking Buttons
		//xpath for continue button=//*[@id="content"]/form/div[5]/div/input[2]
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[5]/div/input[2]")).click();
		

		System.out.println("Done..");
		
		driver.quit();

		}

}
