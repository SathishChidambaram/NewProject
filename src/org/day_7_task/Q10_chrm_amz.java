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

public class Q10_chrm_amz {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver az = new ChromeDriver();

		az.get("https://www.amazon.in/");

		az.manage().window().maximize();

		WebElement search = az.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Motorola");

		Thread.sleep(2000);

		az.findElement(By.xpath("//input[@type='submit']")).click();

		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) az;

		File screenshot = ts.getScreenshotAs(OutputType.FILE);

		File location = new File("C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\ss\\Q10_SS.png");

		FileUtils.copyFile(screenshot, location);

	}
}
