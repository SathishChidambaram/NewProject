package org.day_3_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2_chrm_fb {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver fb = new ChromeDriver();

		fb.get("https://www.facebook.com");

		WebElement usrnme = fb.findElement(By.xpath("//input[@type='text']"));
		usrnme.sendKeys("Sathish");

		WebElement pass = fb.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("12345678");

		WebElement log = fb.findElement(By.xpath("//button[@type='submit']"));
		log.click();
	}

}
