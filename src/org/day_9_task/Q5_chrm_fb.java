package org.day_9_task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q5_chrm_fb {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

		Thread.sleep(3000);

		WebElement days = driver.findElement(By.xpath("//select[@id='day']"));

		Select s = new Select(days);

		List<WebElement> day = s.getOptions();

		int size = day.size();

		for (int i = 0; i < size; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}