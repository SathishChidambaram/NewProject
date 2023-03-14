package org.day_9_task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q12_chrm_jsbin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://output.jsbin.com/osebed/2");

		driver.manage().window().maximize();

		WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));

		Select s = new Select(fruits);

		List<WebElement> store = s.getOptions();

		System.out.println("All fruits list in the table");
		for (WebElement table : store) {
			String text = table.getText();
			System.out.println(text);
		}

		int size = store.size();

		for (int i = 0; i < size; i++) {
			if (i % 2 == 1) {
				s.selectByIndex(i);
			}
		}
		System.out.println("\nThis are the fruits selected by EVEN");
		List<WebElement> evenSelectedFruits = s.getAllSelectedOptions();
		int size2 = evenSelectedFruits.size();
		for (WebElement sl : evenSelectedFruits) {
			String text1 = sl.getText();
			System.out.println(text1);
		}
		System.out.println("\nTotal fruits in Table " + size);
		System.out.println("Even Selected Fruits " + size2);
		System.out.println("Unselected fruits are " + (size - size2));

	}
}