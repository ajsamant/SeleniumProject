package SeleniumJavaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

	public static void main(String[] args) {
		
		//Register Firefox Driver
		System.out.print("Registering Firefox Driver");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ajink\\Documents\\selenium\\geckodriver.exe");
		
		//Open Google.com
		WebDriver driver = new FirefoxDriver();
		
		System.out.println("Opening Web Page");
		//Open URL
		driver.get("http://www.facebook.com");
		
		String title = driver.getTitle();
		System.out.print("The Title of URL is: " + title);
		
		//assert title
				String expectedTitle = "Facebook - Log In or Sign Up";
				
				if(expectedTitle.equals(title))
				{
					System.out.println("Title Matched");
				}
				else {
					System.out.println("Title did not matched");
				}
		
		String url = driver.getCurrentUrl();
		System.out.println("Current URL is: "+ url);
		
		//asert url
		
		String expectedUrl = "http://www.facebook.com";
		
		if(expectedUrl.equals(url)) {
			System.out.println("URL Matched");
		}
		else {
			System.out.println("URL did not matched");
		}
		
		//driver.close();

	}

}
