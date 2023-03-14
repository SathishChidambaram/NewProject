package org.day_3_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8_chrm_sele {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver sl = new ChromeDriver();

		sl.get("http://greenstech.in/selenium-course-content.html");

		WebElement mod = sl.findElement(By.xpath("//div[@data-target='#collapse201']"));
		mod.click();

		WebElement resu = sl.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[1]"));
		resu.click();
	}

}
