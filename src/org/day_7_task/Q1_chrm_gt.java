package org.day_7_task;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1_chrm_gt {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver ex = new ChromeDriver();

		ex.get("http://www.greenstechnologys.com/");

		ex.manage().window().maximize();

		Thread.sleep(3000);

		ex.findElement(By.xpath("//button[@class='close']")).click();

		Thread.sleep(3000);

		TakesScreenshot ts = (TakesScreenshot) ex;

		File screenshot = ts.getScreenshotAs(OutputType.FILE);

		File path = new File("C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\ss\\Q1_SS.png");

		FileUtils.copyFile(screenshot, path);

	}
}
