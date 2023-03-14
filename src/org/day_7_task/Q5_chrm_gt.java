package org.day_7_task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5_chrm_gt {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver gt = new ChromeDriver();

		gt.get("http://greenstech.in/selenium-course-content.html");

		gt.manage().window().maximize();

		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) gt;

		WebElement jobopenings = gt.findElement(By.xpath("//div[@id='heading20']"));
		js.executeScript("arguments[0].scrollIntoView()", jobopenings);

		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) gt;

		File screenshot = ts.getScreenshotAs(OutputType.FILE);

		File location = new File("C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\ss\\Q5_SS.png");

		FileUtils.copyFile(screenshot, location);

		Thread.sleep(3000);

		WebElement toppage = gt.findElement(By.xpath("(//a[text()='Contact Us'])[2]"));
		js.executeScript("arguments[0].scrollIntoView()", toppage);

	}
}