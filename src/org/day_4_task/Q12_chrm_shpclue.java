package org.day_4_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q12_chrm_shpclue {

	public static void mian(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver sh = new ChromeDriver();

		sh.get("https://www.shopclues.com/wholesale.html");
		WebElement ent = sh.findElement(By.xpath("(//input[@type='text'])[4]"));
		ent.click();

	}
}
