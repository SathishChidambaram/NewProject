package org.day_7_task;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q9_chrm_flpkrt {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver fk = new ChromeDriver();

		fk.get("https://www.flipkart.com/");

		fk.manage().window().maximize();

		Thread.sleep(3000);

		fk.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		WebElement search = fk.findElement(By.xpath("//input[@class='_3704LK']"));
		search.sendKeys("Iphone");
		Thread.sleep(2000);

		fk.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

		Thread.sleep(3000);

		TakesScreenshot ts = (TakesScreenshot) fk;

		File screenshot = ts.getScreenshotAs(OutputType.FILE);

		File location = new File("C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\ss\\Q9_SS.png");

		FileUtils.copyFile(screenshot, location);
	}

}
