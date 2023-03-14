package org.day_5_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q7_chrm_gt {

	public static void main(String[] args) {

		WebDriver gt = new ChromeDriver();

		gt.get("http://greenstech.in/selenium-course-content.html");

		Actions a = new Actions(gt);

		WebElement cr = gt.findElement(By.xpath("//div[@title='Courses']"));

		a.moveToElement(cr).perform();

		WebElement or = gt.findElement(By.xpath("//div[@title='Oracle']"));

		a.moveToElement(or).perform();

		gt.findElement(By.xpath("(//span[contains(text(),'Oracle')])[2]")).click();

	}
}
