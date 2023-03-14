package org.day_8_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6_chrm_sbi {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver sb = new ChromeDriver();

		sb.get("https://retail.onlinesbi.com/retail/login.htm");

		sb.manage().window().maximize();

		Thread.sleep(3000);

		sb.findElement(By.xpath("(//a[@class='login_button'])[1]")).click();

		Thread.sleep(4000);

		sb.findElement(By.xpath("//input[@type='submit']")).click();

		Thread.sleep(3000);

		sb.switchTo().alert().accept();

		System.out.println(
				"Click Continue To Login and click Login without enter the user id task is tested Successfully");
	}
}
