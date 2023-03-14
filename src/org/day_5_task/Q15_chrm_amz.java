package org.day_5_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q15_chrm_amz {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver az = new ChromeDriver();

		Actions a = new Actions(az);

		az.get("https://www.amazon.in/");

		az.manage().window().maximize();

		WebElement hlo = az.findElement(By.xpath("//span[text()='Hello, sign in']"));
		a.moveToElement(hlo).perform();

		az.findElement(By.xpath("(//span[text()='Sign in'])[1]")).click();

		az.findElement(By.xpath("//input[@type='email']")).sendKeys("9894586508");

		az.findElement(By.xpath("//input[@id='continue']")).click();

		az.findElement(By.xpath("//input[@type='password']")).sendKeys("12345678");

		az.findElement(By.xpath("//input[@id='signInSubmit']")).click();

	}
}
