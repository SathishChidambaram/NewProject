package org.day_8_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5_chrm_cnrabnk {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver cb = new ChromeDriver();

		cb.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");

		cb.manage().window().maximize();

		cb.findElement(By.xpath("//a[text()='https://online.canarabank.in ']")).click();

		Thread.sleep(15000);

		cb.findElement(By.xpath("//span[@class='loginText oj-button-text']")).click();

		Thread.sleep(3000);

		WebElement popup = cb.findElement(By.xpath("//div[@class='oj-message-detail']"));
		String txt = popup.getText();
		System.out.println(txt);

	}
}
