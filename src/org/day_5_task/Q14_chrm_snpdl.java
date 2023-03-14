package org.day_5_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q14_chrm_snpdl {

	public static void main(String[] args) {

		System.setProperty("webdriver.chome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver sd = new ChromeDriver();

		sd.get(" https://www.snapdeal.com/");

		Actions a = new Actions(sd);

		WebElement wm = sd.findElement(By.xpath("(//span[@class='catText'])[2]"));
		a.moveToElement(wm).perform();

		sd.findElement(By.xpath("(//span[text()='Footwear'])[2]")).click();

	}
}
