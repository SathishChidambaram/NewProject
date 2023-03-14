package org.day_3_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6_chrm_rdbus{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");
		WebDriver rd = new ChromeDriver();

		rd.manage().window().maximize();

		rd.get("https://www.redbus.in/");

		WebElement profile = rd.findElement(By.xpath("//div[@class='fr signin-block  ']"));
		profile.click();

		WebElement sign = rd.findElement(By.xpath("//li[@class='config-options ']"));
		sign.click();

		Thread.sleep(3000);

		WebElement ph = rd.findElement(By.xpath("(//input[@placeholder='Enter your mobile number'])[2]"));
		ph.click();


	}

}
