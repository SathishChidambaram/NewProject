package org.day_2_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2_chrm_rbus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver rb = new ChromeDriver();

		rb.get("https://www.redbus.in/");

		rb.manage().window().maximize();

		WebElement frm = rb.findElement(By.id("src"));
		frm.sendKeys("Chennai");

		WebElement to = rb.findElement(By.id("dest"));
		to.sendKeys("Bengluru");

	}
}
