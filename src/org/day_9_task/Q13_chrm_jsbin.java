package org.day_9_task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q13_chrm_jsbin {

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
			s.selectByIndex(i);
		}

		List<WebElement> allSelectedFruits = s.getAllSelectedOptions();
		System.out.println("\nSelected Fruits");
		for (WebElement selectedfruits : allSelectedFruits) {
			String text = selectedfruits.getText();
			System.out.println(text);
		}
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text1 = firstSelectedOption.getText();
		System.out.println("\nFirst Selected Fruit is " + text1);

	}
}