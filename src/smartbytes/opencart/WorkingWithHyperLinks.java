package smartbytes.opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithHyperLinks {

	public static void main(String[] args) {

		// 1. Open URL of Register
		String homePage = "https://smartbytes.v-logics.com/ocart/index.php?route=common/home";

		System.out.println("Registering Driver");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\Documents\\selenium\\chromedriver.exe");

		// Create instance of chrome
		WebDriver driver = new ChromeDriver();

		System.out.println("Opening URL: " + homePage);
		driver.get(homePage);
		driver.findElement(By.xpath("//*[@id=\"welcome\"]/a[1]")).click();
		
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
		}
		
		driver.findElement(By.xpath("//*[@id=\"welcome\"]/a[2]")).click();
		
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
		}
		
		driver.findElement(By.linkText("Shopping Cart")).click();
		
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
		}
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[5]/a[1]")).click();
		
		System.out.println("Done..");

	}

}
