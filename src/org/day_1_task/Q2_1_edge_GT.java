package org.day_1_task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Q2_1_edge_GT {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewP\\driver\\msedgedriver.exe");

		WebDriver g = new EdgeDriver();

		g.get("http://www.greenstechnology.com/");

		String title = g.getTitle();
		System.out.println(title);

		String url = g.getCurrentUrl();
		System.out.println(url);

	}

}
