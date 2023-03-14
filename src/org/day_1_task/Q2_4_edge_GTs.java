package org.day_1_task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Q2_4_edge_GTs {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewP\\driver\\msedgedriver.exe");

		WebDriver e = new EdgeDriver();

		e.get("http://greenstech.in/selenium-course-content.html");

		String title = e.getTitle();
		System.out.println(title);

		String url = e.getCurrentUrl();
		System.out.println(url);
	}

}
