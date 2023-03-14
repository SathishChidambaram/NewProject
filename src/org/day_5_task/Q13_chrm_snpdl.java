package org.day_5_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q13_chrm_snpdl {

	public static void main(String[] args) {

		System.setProperty("webdriver.chome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver sd = new ChromeDriver();

		sd.get("https://www.snapdeal.com");

		sd.manage().window().maximize();

		Actions a = new Actions(sd);

		WebElement ma = sd.findElement(By.xpath("//span[text()='Mobile & Accessories']"));
		a.moveToElement(ma).perform();

		sd.findElement(By.xpath("//span[text()='Mobile Cases & Covers']")).click();

	}
}
