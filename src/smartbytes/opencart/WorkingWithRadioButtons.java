package smartbytes.opencart;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingWithRadioButtons {

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

		System.out.println("Selecting Newsletter..");
		// Interact with Radio Button
		List<WebElement> newsletterRadioButton = driver.findElements(By.name("newsletter"));
		newsletterRadioButton.get(0).click();
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
		}
		newsletterRadioButton.get(1).click();
		
		
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
		}
		
		
		//Checkboxes
		driver.findElement(By.name("agree")).click();

		System.out.println("Done..");

	}

}
