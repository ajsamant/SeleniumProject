package SeleniumJavaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		
		//Register Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\Documents\\selenium\\chromedriver.exe");
		
		//Open Google.com
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("http://www.udemy.com");
		//System.out.print(driver.getTitle());
		//driver.close();

	}

}
