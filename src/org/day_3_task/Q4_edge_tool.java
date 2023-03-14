package org.day_3_task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Q4_edge_tool {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge,driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewP\\driver\\msedgedriver.exe");

		WebDriver tl = new EdgeDriver();

		tl.get("http://toolsqa.com/automation-practice-form/");

	}
}
