package org.day_4_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3_chrm_gt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver gt = new ChromeDriver();
		
		gt.manage().window().maximize();

		gt.get("http://greenstech.in/selenium-course-content.html");

		WebElement ad = gt
				.findElement(By.xpath("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[1]"));
		String txt = ad.getText();
		System.out.println(txt);

	}

}
