package org.day_5_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q2_chrm_amz {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver am = new ChromeDriver();

		am.get("http://www.amazon.in");

		Actions a = new Actions(am);

		WebElement prm = am.findElement(By.xpath("//span[text()='Prime']"));

		a.moveToElement(prm).perform();
		
		Thread.sleep(3000);
		
		WebElement prm1 = am.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		a.moveToElement(prm1).perform();
		prm1.click();
		
		WebElement mv = am.findElement(By.xpath("(//a[contains(text(),'Prime')])[3]"));
		a.moveToElement(mv).perform();
		mv.click();

	}
}
