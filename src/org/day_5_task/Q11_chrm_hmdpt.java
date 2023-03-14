package org.day_5_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q11_chrm_hmdpt {

	public static void main(String[] args) {

		System.setProperty("webdriver.chome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver hm = new ChromeDriver();

		hm.get("https://www.homedepot.com/");

		Actions a = new Actions(hm);

		WebElement all = hm.findElement(By.xpath("//a[text()='All Departments']"));
		a.moveToElement(all).perform();

		WebElement he = hm.findElement(By.xpath("//a[text()='Heating & Cooling']"));
		a.moveToElement(he).perform();

		WebElement ac = hm.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
		a.moveToElement(ac).perform();

		hm.findElement(By.xpath("//a[text()='Portable Air Conditioners']")).click();

	}
}
