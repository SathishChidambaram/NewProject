package org.day_4_task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q10_chrm_flpkrt {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver flp = new ChromeDriver();

		flp.get("https://www.flipkart.com/");

		flp.manage().window().maximize();

		WebElement cls = flp.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cls.click();

		WebElement srh = flp.findElement(By.xpath("//input[@class='_3704LK']"));
		srh.click();
		srh.sendKeys("Iphone");
		srh.sendKeys(Keys.ENTER);

		Thread.sleep(4000);

		WebElement lk = flp.findElement(By.xpath("(//div[@class='CXW8mj'])[9]"));
		lk.click();

	}
}
