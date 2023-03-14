package org.day_6_task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q2_chrm_ggle {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver gg = new ChromeDriver();

		gg.get(" https://www.google.co.in/webhp");

		gg.manage().window().maximize();

		WebElement enter = gg.findElement(By.xpath("//input[@class='gLFyf']"));
		enter.sendKeys("VelMurugan");

		Actions a = new Actions(gg);

		a.doubleClick(enter).perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);

		System.out.println("Helped by Naveen");

	}
}
