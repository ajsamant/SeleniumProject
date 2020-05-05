package smartbytes.opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTablesPart2 {
 public static void main(String[] args) {
		String url = "http://smartbytes.v-logics.com/ocart/table.html";
		System.out.println("Registering driver...");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\Documents\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Opening URL :" + url);
		driver.get(url);
		//I want to search for employees who lives in London
		driver.findElement(By.cssSelector("#example_filter > label > input[type=\"search\"]")).sendKeys("London");
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			
		}
		//I want to sort the employees by age
		driver.findElement(By.xpath("//*[@id=\"example\"]/thead/tr/th[4]")).click();
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			
		}
		driver.findElement(By.xpath("//*[@id=\"example\"]/thead/tr/th[4]")).click();
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			
		}
		driver.findElement(By.xpath("//*[@id=\"example_paginate\"]/span/a[2]")).click();
		
}
}
