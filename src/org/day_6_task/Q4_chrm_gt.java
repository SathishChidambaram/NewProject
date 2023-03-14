package org.day_6_task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q4_chrm_gt {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver gt = new ChromeDriver();

		gt.get("http://greenstech.in/selenium-course-content.html");

		Actions a = new Actions(gt);
		Robot r = new Robot();

		WebElement framewrk = gt.findElement(By.xpath("//div[@id='heading304']"));
		a.contextClick(framewrk).perform();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
