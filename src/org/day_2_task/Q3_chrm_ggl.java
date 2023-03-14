package org.day_2_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3_chrm_ggl {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver gl = new ChromeDriver();

		gl.get("https://www.google.com/");

		gl.manage().window().maximize();

		WebElement sr = gl.findElement(By.name("q"));
		sr.sendKeys("Greens Technology");

	}

}
