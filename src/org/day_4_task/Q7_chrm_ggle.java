package org.day_4_task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7_chrm_ggle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver gl = new ChromeDriver();

		gl.get("http://www.google.com/");

		gl.manage().window().maximize();

		WebElement srh = gl.findElement(By.xpath("//input[@type='text']"));
		srh.sendKeys("greens velmurugan");
		srh.sendKeys(Keys.ENTER);

		WebElement lk = gl.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		lk.click();

	}

}
