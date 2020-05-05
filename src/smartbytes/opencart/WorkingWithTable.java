package smartbytes.opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithTable {
	public static void main(String[] args) {
		String url = "http://smartbytes.v-logics.com/ocart/table.html";
		System.out.println("Registering driver...");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\Documents\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Opening URL :" + url);
		driver.get(url);
		//I want to read the data from first row.
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]"));
		//set the visible rows to 25.
		Select rowSelectBox = new Select(driver.findElement(By.name("example_length")));
		rowSelectBox.selectByValue("25");
		//read all 'td' elements form first row.
		//columns
		WebElement columnDataElem=null;
		for(int rowIndex=1;rowIndex<=10;rowIndex++) {
			System.out.println("Row =" + rowIndex);
			for(int colIndex=1;colIndex<=6;colIndex++) {// rowIndex =3 , colIndex=1... 6
				columnDataElem= driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr["+rowIndex+"]/td["+colIndex+"]"));
				System.out.print(columnDataElem.getText() +"\t");
			}
			System.out.println("");
		}
		System.out.println("");
	}
}
