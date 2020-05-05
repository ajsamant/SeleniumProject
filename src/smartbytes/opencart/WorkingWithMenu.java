package smartbytes.opencart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithMenu {
	public static void main(String[] args) {
		//Navigate to home page and click on links.
		String homePage="http://smartbytes.v-logics.com/ocart/index.php?route=common/home";
		System.out.println("Registering driver...");
//		System.setProperty("webdriver.chrome.driver", "/Users/sys/Documents/selenium/drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ajink\\Documents\\selenium\\geckodriver.exe");
		
		// create the instance of chrome driver.
		WebDriver driver = new FirefoxDriver();
		// Open the URL
		System.out.println("Opening Home Page :" + homePage);
		driver.get(homePage);
		//start clicking on menu??
		Actions action = new Actions(driver);
		
		/*
		WebElement desktopMenuItem   = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a"));
		WebElement laptopMenuItem	 = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a"));
		WebElement componentMenuItem = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a"));
		
		WebElement macSubItem = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/div/ul/li[2]/a"));
		
		action.moveToElement(desktopMenuItem).build().perform();	
		delay();
		action.moveToElement(laptopMenuItem).build().perform();
		delay();
		action.moveToElement(componentMenuItem).build().perform();
		//action.moveToElement(desktopMenuItem).click(macSubItem).build().perform();
	*/
	}

	public static void delay() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

