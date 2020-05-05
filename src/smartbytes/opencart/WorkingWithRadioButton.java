package smartbytes.opencart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithRadioButton {
	public static void main(String[] args) {
		String actualTitle = "";
		// 1.Open the URL
		// http://smartbytes.v-logics.com/ocart/index.php?route=account/register
		String url = "http://smartbytes.v-logics.com/ocart/index.php?route=account/register";
		// Register Chrome Driver
		System.out.println("Registering driver...");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\Documents\\selenium\\chromedriver.exe");
		// create the instance of chrome driver.
		WebDriver driver = new ChromeDriver();
		// Open the URL
		System.out.println("Opening URL :" + url);
		driver.get(url);
		// 2. Enter First Name,Last Name,Email and Telephone.
		actualTitle = driver.getTitle();
		System.out.println("Page title is :"+ actualTitle);
		
		//I want to enter first name.
		System.out.println("Select the radio button");
		List<WebElement> newsLetterRadioButtons= driver.findElements(By.name("newsletter"));
		newsLetterRadioButtons.get(0).click();
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			
		}
		newsLetterRadioButtons.get(1).click();
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			
		}
		
		driver.findElement(By.name("agree")).click();
	}
}
