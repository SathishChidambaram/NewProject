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

public class Q7_chrm_gt {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver gt = new ChromeDriver();

		gt.get("http://greenstech.in/selenium-course-content.html");

		gt.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) gt;

		WebElement top = gt.findElement(By.xpath("//li[text()='Features of Java']"));
		js.executeScript("arguments[0].scrollIntoView()", top);

		Thread.sleep(2000);

		WebElement interview_qus = gt.findElement(By.xpath("//div[@id='heading20']"));
		interview_qus.click();

		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) gt;

		File screenshot = ts.getScreenshotAs(OutputType.FILE);

		File location = new File("C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\ss\\Q7_SS.png");

		FileUtils.copyFile(screenshot, location);

	}
}
