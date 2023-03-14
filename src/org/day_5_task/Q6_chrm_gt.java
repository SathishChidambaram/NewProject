package org.day_5_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q6_chrm_gt {

	public static void main(String[] args) {

		System.setProperty("webdriver.chome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver gt = new ChromeDriver();

		gt.get("http://greenstech.in/selenium-course-content.html");

		gt.manage().window().maximize();

		Actions a = new Actions(gt);

		WebElement cr = gt.findElement(By.xpath("//div[@title='Courses']"));

		a.moveToElement(cr).perform();

		WebElement st = gt.findElement(By.xpath("//div[@title='Software Testing']"));

		a.moveToElement(st).perform();

		gt.findElement(By.xpath("//span[text()='Selenium Certification Training']")).click();

	}

}
