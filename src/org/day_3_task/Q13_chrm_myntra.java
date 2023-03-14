package org.day_3_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q13_chrm_myntra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver my = new ChromeDriver();

		my.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		
		WebElement clk = my.findElement(By.xpath("//input[@autocomplete='new-password']"));
		clk.click();
		clk.sendKeys("9894586508");
		
		WebElement con = my.findElement(By.xpath("//div[@class='submitBottomOption']"));
		con.click();
	}

}
