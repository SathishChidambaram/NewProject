package org.day_9_task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q7_chrm_demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/register.php");

		driver.manage().window().maximize();

		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));

		Select s = new Select(country);

		List<WebElement> key = s.getOptions();

		for (WebElement store : key) {
			String attribute = store.getAttribute("value");
			System.out.println(attribute);
		}
	}
}