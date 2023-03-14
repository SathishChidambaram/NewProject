package org.day_10_task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8_chrm_snpdl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@name='keyword'])[1]")).sendKeys("Hand Sanitizer");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@class='product-image '])[1]")).click();
		Thread.sleep(3000);
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String iteration : allWindows) {
			if (iteration != parentWindow) {
				driver.switchTo().window(iteration);
			}
		}
		Thread.sleep(4000);
		WebElement addCart = driver.findElement(By.xpath("//span[text()='add to cart']"));
		addCart.click();
	}
}