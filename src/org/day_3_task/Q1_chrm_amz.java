package org.day_3_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1_chrm_amz {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver amz = new ChromeDriver();

		amz.get(" https://www.amazon.in/");

		WebElement srch = amz.findElement(By.xpath("//input[@type='text']"));
		srch.sendKeys("iphone");

		WebElement ent = amz.findElement(By.xpath("//input[@type='submit']"));
		ent.click();

	}

}
