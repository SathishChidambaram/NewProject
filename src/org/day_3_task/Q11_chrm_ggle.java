package org.day_3_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q11_chrm_ggle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver gg = new ChromeDriver();

		gg.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");

		WebElement name = gg.findElement(By.xpath("(//input[@type='text'])[1]"));
		name.sendKeys("Sathish");

		WebElement surname = gg.findElement(By.xpath("(//input[@type='text'])[2]"));
		surname.sendKeys("Chidambaram");

		WebElement pass = gg.findElement(By.xpath("(//input[@type='password'])[1]"));
		pass.sendKeys("Sathish@7");

		WebElement cpass = gg.findElement(By.xpath("(//input[@type='password'])[2]"));
		cpass.sendKeys("hwgfwjfh");
		
		WebElement nxt = gg.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
		nxt.click();

	}

}
