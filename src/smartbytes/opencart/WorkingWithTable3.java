package smartbytes.opencart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithTable3 {
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
		rowSelectBox.selectByValue("10");
		//Read all the rows from table.
		List<WebElement> rowElements = driver.findElements(By.xpath("//*[@id=\"example\"]/tbody/tr")); //- multiple tr
		int noOfRows = rowElements.size();
		System.out.println("Total Rows = " + noOfRows);
		
		//Read all the column data for each row.
		int noOfColumns=0;
		noOfColumns = driver.findElements(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td")).size();
		WebElement colElem=null;
		for(int rowIndex=1;rowIndex<=noOfRows;rowIndex++) {
			System.out.println("Row =" + rowIndex);
			//loop through all the columns for the current row.
			for(int colIndex=1;colIndex<=noOfColumns;colIndex++) {// rowIndex=1 , columnIndex=1--6
				colElem = driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr["+rowIndex+"]/td["+colIndex+"]"));
				System.out.print(colElem.getText()+ "\t");
			}
			System.out.println("");
		}
		
	}
}
