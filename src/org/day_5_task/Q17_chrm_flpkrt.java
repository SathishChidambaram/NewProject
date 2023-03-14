package org.day_5_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q17_chrm_flpkrt {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver fp = new ChromeDriver();

		Actions a = new Actions(fp);

		fp.get("https://www.flipkart.com/");
		
		fp.manage().window().maximize();
		
		fp.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		fp.findElement(By.xpath("(//img[@class='_396cs4'])[5]")).click();
		
		Thread.sleep(3000);
		
		WebElement women = fp.findElement(By.xpath("//span[text()='Women']"));
		a.moveToElement(women).perform();
		
		fp.findElement(By.xpath("//span[text()='Flats']")).click();
		
	}
}
