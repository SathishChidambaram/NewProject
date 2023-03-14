package org.day_10_task;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q9_chrm_flpkrt {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("Redmi Phone");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='_2kHMtA'])[1]")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String iteration : allWindows) {
			if (iteration != parentWindow) {
				driver.switchTo().window(iteration);
			}
		}
		Thread.sleep(3000);
		WebElement costOfProduct = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		String text = costOfProduct.getText();
		System.out.println("Price Of The Current Phone is "+text);
	}
}
