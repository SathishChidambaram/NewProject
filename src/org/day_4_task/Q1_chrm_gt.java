package org.day_4_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1_chrm_gt {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver gt = new ChromeDriver();

		gt.get("http://www.greenstechnologys.com");
		
		gt.manage().window().maximize();

		WebElement cls = gt.findElement(By.xpath("//button[@data-dismiss='modal']"));
		Thread.sleep(3000);
		cls.click();
		Thread.sleep(2000);
		WebElement as = gt.findElement(By.xpath("(//h2)[2]"));
		String t = as.getText();
		System.out.println(t);
		System.out.println("Finished");

	}
}
