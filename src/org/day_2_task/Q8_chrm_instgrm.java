package org.day_2_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8_chrm_instgrm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver ins = new ChromeDriver();

		ins.get("https://www.instagram.com/");

		ins.manage().window().maximize();

		Thread.sleep(3000);

		WebElement name = ins.findElement(By.xpath("//input[@type='text']"));
		name.sendKeys("_sathish_chidambaram_");

		WebElement pass = ins.findElement(By.name("password"));
		pass.sendKeys("12345678");

	}

}
