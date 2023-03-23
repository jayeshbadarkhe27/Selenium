package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayes\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		WebElement firstnam = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));

		boolean jay = firstnam.isEnabled();
		System.out.println(jay);
		WebElement firstname1 = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		firstname1.sendKeys("7264946431");

		WebElement password = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		password.sendKeys("jayeshbadarkhe");

		WebElement button = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		button.click();
	}

}
