package org.day_2_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6_chrm_swigy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver sw = new ChromeDriver();

		sw.get("https://www.swiggy.com/");

		sw.manage().window().maximize();

		WebElement loc = sw.findElement(By.name("location"));
		loc.sendKeys("Chennai");

	}

}
