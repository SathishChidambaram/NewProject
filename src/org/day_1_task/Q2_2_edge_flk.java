package org.day_1_task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Q2_2_edge_flk {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewP\\driver\\msedgedriver.exe");

		WebDriver fk = new EdgeDriver();

		fk.get("http://www.flipkart.com/");

		String title = fk.getTitle();
		System.out.println(title);
	}

}
