package org.day_4_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2_chrm_gt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver gt = new ChromeDriver();

		gt.get("http://greenstech.in/selenium-course-content.html");

		gt.manage().window().maximize();

		WebElement clk = gt.findElement(By.xpath("//a[@class='nav-link ']"));
		clk.click();

		Thread.sleep(2000);
		WebElement para = gt.findElement(By.xpath("//p[contains(text(),'Velmurugan currently')]"));
		String txt = para.getText();
		System.out.println(txt);

	}

}
