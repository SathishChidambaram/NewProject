package org.day_8_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4_chrm_hdfc {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver hd = new ChromeDriver();

		hd.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");

		hd.manage().window().maximize();

		Thread.sleep(3000);

		hd.switchTo().frame("login_page");

		hd.findElement(By.xpath("//a[@class='btn btn-primary login-btn']")).click();

		Thread.sleep(2000);

		hd.switchTo().alert().accept();

		System.out.println("Successfully clicked continue without enter the user id and handle popup");

	}
}
