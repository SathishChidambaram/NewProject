package org.day_4_task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q9_chrm_snpdl {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver sd = new ChromeDriver();

		sd.get("https://www.snapdeal.com/");

		sd.manage().window().maximize();

		WebElement clk = sd.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		clk.click();
		clk.sendKeys("asus laptop");
		clk.sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		WebElement prd = sd.findElement(By.xpath("(//p[@class='product-title'])[1]"));
		prd.click();
	}

}
