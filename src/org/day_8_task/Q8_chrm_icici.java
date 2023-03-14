package org.day_8_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8_chrm_icici {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver ic = new ChromeDriver();

		ic.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");

		ic.manage().window().maximize();

		Thread.sleep(3000);

		WebElement useid = ic.findElement(By.xpath("//input[@name='DUMMY1']"));
		useid.click();

		Thread.sleep(4000);

		WebElement user = ic.findElement(By.xpath("(//input)[9]"));
		user.sendKeys("Sathish");

		WebElement pass = ic.findElement(By.xpath("(//input)[12]"));
		pass.sendKeys("12345678");

		WebElement log = ic.findElement(By.xpath("(//input)[15]"));
		log.click();

		System.out.println("Task tested Successfully");
	}

}
