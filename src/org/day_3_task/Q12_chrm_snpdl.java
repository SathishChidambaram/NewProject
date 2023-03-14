package org.day_3_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q12_chrm_snpdl {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver sd = new ChromeDriver();

		sd.get("https://www.snapdeal.com/");

		WebElement sign = sd.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		sign.click();

		WebElement reg = sd.findElement(By.xpath("//span[@class='newUserRegister']"));
		reg.click();

		WebElement mob = sd.findElement(By.xpath("//input[@id='userName']"));
		mob.click();

		WebElement con = sd.findElement(
				By.xpath("//button[@class='btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30']"));
		con.click();
	}

}
