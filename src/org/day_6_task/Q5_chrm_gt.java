package org.day_6_task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5_chrm_gt {
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver gt = new ChromeDriver();

		gt.get("http://greenstech.in/selenium-course-content.html");
		
		gt.manage().window().maximize();

		Robot r = new Robot();

		WebElement resume = gt.findElement(By.xpath("(//h2[@class='mb-0'])[2]"));
		resume.click();

		Thread.sleep(3000);

		WebElement resume4 = gt.findElement(By.xpath("//a[text()='Resume Model-4 ']"));
		resume4.click();

		Thread.sleep(7000);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_S);

	}
}
