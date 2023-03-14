package org.day_3_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Q5_edge_sele {
	public static void main(String[] args) {
		System.setProperty("webdiver.edge.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewP\\driver\\msedgedriver.exe");

		WebDriver se = new EdgeDriver();

		se.get(" http://greenstech.in/selenium-course-content.html");

		WebElement intqus = se.findElement(By.xpath("(//div[@data-toggle='collapse'])[12]"));
		intqus.click();

		WebElement cts = se.findElement(By.xpath("(//a[@target='_blank'])[102]"));
		cts.click();
	}

}
