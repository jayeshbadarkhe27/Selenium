package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Xpathelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayes\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(60, null);
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");

		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();

		driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		// driver.findElement(By.xpath("(//*[@class='oxd-icon bi-check
		// oxd-checkbox-input-icon'])[4]")).click();

		// driver.findElement(By.xpath("(//*[contains(@class,'oxd-icon bi-check
		// oxd-checkbox-input-icon')])[3]")).click();
		for (int i = 2; i <= 38; i++)
			if (i % 2 == 0) {
				driver.findElement(
						By.xpath("(//*[contains(@class,'oxd-icon bi-check oxd-checkbox-input-icon')])[" + i + "]"))
						.click();
	}
	}

}
