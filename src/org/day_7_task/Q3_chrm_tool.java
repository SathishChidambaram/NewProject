package org.day_7_task;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3_chrm_tool {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver tl = new ChromeDriver();

		tl.get("http://toolsqa.com/");

		tl.manage().window().maximize();

		tl.findElement(By.xpath("//button[@id='accept-cookie-policy']")).click();

		JavascriptExecutor js = (JavascriptExecutor) tl;

		WebElement sele = tl.findElement(By.xpath("//a[@class='btn btn-primary-shadow btn-block']"));
		js.executeScript("arguments[0].scrollIntoView()", sele);

		WebElement prin = tl.findElement(By.xpath("(//div[@class='category__name'])[7]"));

		String text = prin.getText();
		System.out.println(text);

	}
}