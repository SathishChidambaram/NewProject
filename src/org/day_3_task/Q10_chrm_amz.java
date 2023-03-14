package org.day_3_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q10_chrm_amz {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver amz = new ChromeDriver();

		amz.get("https://www.amazon.in/");

		WebElement tab = amz.findElement(By.xpath("//div[@id='nav-search']"));
		tab.click();

		WebElement src = amz.findElement(By.xpath("//input[@dir='auto']"));
		src.sendKeys("Iphone");

		WebElement sub = amz.findElement(By.xpath("//input[@type='submit']"));
		sub.click();

		WebElement pho = amz.findElement(By.xpath("(//img[@class='s-image'])[1]"));
		pho.click();
	}

}
