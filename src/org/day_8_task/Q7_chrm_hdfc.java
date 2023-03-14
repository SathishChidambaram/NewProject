package org.day_8_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7_chrm_hdfc {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver hd = new ChromeDriver();

		hd.get("https://netbanking.hdfcbank.com/netbanking/");

		hd.manage().window().maximize();

		hd.switchTo().frame("login_page");

		hd.findElement(By.xpath("//input[@class='form-control text-muted']")).sendKeys("1234");

		hd.findElement(By.xpath("//a[@class='btn btn-primary login-btn']")).click();
		
		System.out.println("Enter the userId,click continue.Enter password task is tested Successfully");

	}
}
