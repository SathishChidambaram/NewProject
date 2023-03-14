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

public class Q4_chrm_gt {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver gt = new ChromeDriver();

		gt.get("http://www.greenstechnologys.com/");

		gt.manage().window().maximize();

		Thread.sleep(3000);

		gt.findElement(By.xpath("//button[@class='close']")).click();

		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) gt;

		WebElement scrollupto = gt.findElement(By.xpath("//span[text()='+91 89399 82138']"));
		js.executeScript("arguments[0].scrollIntoView(false)", scrollupto);

		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) gt;

		File screenshot = ts.getScreenshotAs(OutputType.FILE);

		File location = new File("C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\ss\\Q4_SS.png");

		FileUtils.copyFile(screenshot, location);

	}
}