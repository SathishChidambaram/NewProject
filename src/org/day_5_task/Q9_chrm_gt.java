package org.day_5_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q9_chrm_gt {

	public static void main(String[] args) {

		System.setProperty("webdriver.chome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver gt = new ChromeDriver();

		gt.get("http://greenstech.in/selenium-course-content.html");

		Actions a = new Actions(gt);

		WebElement cr = gt.findElement(By.xpath("//div[@title='Courses']"));

		a.moveToElement(cr).perform();

		WebElement rp = gt.findElement(By.xpath("//span[text()='RPA (6)']"));

		a.moveToElement(rp).perform();

		gt.findElement(By.xpath("//span[text()='Blue Prism Certification Training']")).click();

	}
}
