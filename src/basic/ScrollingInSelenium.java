package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollingInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayes\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(60, null);

		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");

		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();

		driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement checkbox = driver.findElement(By.xpath("(//*[@type='checkbox'])[9]"));

		js.executeScript("arguments[0].scrollIntoView();", checkbox);

		js.executeScript("arguments[0].click();", checkbox);


	}

}
