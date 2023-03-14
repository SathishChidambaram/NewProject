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

public class Q12_chrm_snpdl {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver sd = new ChromeDriver();

		sd.get("https://www.snapdeal.com/");

		sd.manage().window().maximize();

		WebElement searchbox = sd.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		searchbox.sendKeys("HP Laptops");

		Thread.sleep(3000);

		sd.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();

		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) sd;

		File screenshot = ts.getScreenshotAs(OutputType.FILE);

		File location = new File("C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\ss\\Q12_SS.png");

		FileUtils.copyFile(screenshot, location);

	}
}
