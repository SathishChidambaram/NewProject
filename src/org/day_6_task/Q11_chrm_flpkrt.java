package org.day_6_task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q11_chrm_flpkrt {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver gt = new ChromeDriver();

		gt.get("https://www.flipkart.com/");
		
		gt.manage().window().maximize();

		Robot r = new Robot();
		Actions a = new Actions(gt);

		gt.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		Thread.sleep(3000);

		WebElement topoff = gt.findElement(By.xpath("(//img[@class='_396cs4'])[8]"));
		a.doubleClick(topoff).perform();

		Thread.sleep(3000);

		WebElement product = gt.findElement(By.xpath("(//div[@class='_10pg75'])[1]"));
		product.click();

		Thread.sleep(3000);

		WebElement subproduct = gt.findElement(By.xpath("(//img[@class='_396cs4'])[1]"));
		a.contextClick(subproduct).perform();
		for (int i = 0; i < 5; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		}

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("Successfully Clicked Save as Link");

	}
}