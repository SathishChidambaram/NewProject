package org.day_5_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q5_chrm_shpclu {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver sh = new ChromeDriver();
		
		sh.get("https://www.shopclues.com/wholesale.html");
		
		sh.manage().window().maximize();
		
		Actions a = new Actions(sh);
		
		WebElement sm = sh.findElement(By.xpath("//a[text()='Sports & More']"));
		a.moveToElement(sm).perform();
		
		Thread.sleep(3000);
		WebElement wg = sh.findElement(By.xpath("//a[text()='Weight Gainers']"));
		wg.click();
		
		
	}

}
