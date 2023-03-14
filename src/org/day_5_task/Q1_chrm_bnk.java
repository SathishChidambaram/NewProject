package org.day_5_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q1_chrm_bnk {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver bn = new ChromeDriver();

		bn.get("http://demo.guru99.com/test/drag_drop.html");

		bn.manage().window().maximize();

		Actions a = new Actions(bn);

		WebElement frm = bn.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));

		WebElement to = bn.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

		a.dragAndDrop(frm, to).perform();

		Thread.sleep(3000);

		WebElement frm1 = bn.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));

		WebElement to1 = bn.findElement(By.xpath("(//li[@class='placeholder'])[3]"));

		a.dragAndDrop(frm1, to1).perform();

	}

}
