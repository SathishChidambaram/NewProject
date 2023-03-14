package org.day_2_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7_chrm_snpdl {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver sd = new ChromeDriver();

		sd.get("https://www.snapdeal.com/login");

		sd.manage().window().maximize();

		WebElement mob = sd.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']"));
		mob.sendKeys("9894586508");

		WebElement clk = sd.findElement(By.id("checkUser"));
		clk.click();
		
	}

}
