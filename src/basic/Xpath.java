package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayes\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		WebElement password = driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']"));
		password.click();

		WebElement username = driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
		username.click();

	}

}
