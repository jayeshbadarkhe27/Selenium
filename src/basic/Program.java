package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayes\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Jayesh Badarkhe Patil");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("7264946431");

		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("jayeshbadarkhe@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("88552200");
		driver.findElement(By.xpath("//*[@id='address']")).sendKeys("Mothi Umari, Akola Maharashtra");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@name='submit']")).click();

		WebElement radio = driver.findElement(By.xpath("//*[@id='female']"));
		radio.click();
		boolean selected = radio.isDisplayed();
		System.out.println(selected);

		WebElement checkbox = driver.findElement(By.xpath("//*[@id='monday']"));
		checkbox.click();

	}

}
