package org.day_2_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q10_chrm_htlapp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver ht = new ChromeDriver();

		ht.get("http://adactinhotelapp.com/");

		WebElement usrnme = ht.findElement(By.id("username"));
		usrnme.sendKeys("Sathish Chidambaram");

		WebElement pass = ht.findElement(By.id("password"));
		pass.sendKeys("12345678");

	}

}
