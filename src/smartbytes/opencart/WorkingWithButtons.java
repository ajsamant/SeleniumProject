package smartbytes.opencart;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingWithButtons {

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

		System.out.println("Ckicking Continue..");
		// Clicking Buttons
		//xpath for continue button=//*[@id="content"]/form/div[5]/div/input[2]
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[5]/div/input[2]")).click();
		
	

	}

}
