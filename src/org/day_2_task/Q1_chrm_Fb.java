package org.day_2_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1_chrm_Fb {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver fb = new ChromeDriver();

		fb.get("https://www.facebook.com/");

		// to maximize the page
		fb.manage().window().maximize();

		// enter input in email
		WebElement emailtxt = fb.findElement(By.name("email"));
		emailtxt.sendKeys("Naveen Kutty Kunjan");

		// enter input in password
		WebElement password = fb.findElement(By.name("pass"));
		password.sendKeys("173917");

		// login click method
		WebElement log = fb.findElement(By.name("login"));
		log.click();

	}

}
