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

public class Q2_chrm_tool {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver tl = new ChromeDriver();

		tl.get("http://toolsqa.com/");

		tl.manage().window().maximize();

		tl.findElement(By.xpath("//button[@id='accept-cookie-policy']")).click();

		JavascriptExecutor js = (JavascriptExecutor) tl;

		Thread.sleep(3000);

		WebElement article = tl.findElement(By.xpath("(//div[@class='category__start-learning'])[10]"));
		js.executeScript("arguments[0].scrollIntoView()", article);

		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) tl;

		File screenshot = ts.getScreenshotAs(OutputType.FILE);

		File location = new File("C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\ss\\Q2_SS.png");

		FileUtils.copyFile(screenshot, location);

	}

}
