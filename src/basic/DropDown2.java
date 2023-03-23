package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayes\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://zoom.us/signup");

		WebElement month = driver.findElement(By.xpath("//*[@id='select-0']"));
		month.click();
		driver.findElement(By.xpath("//*[@id='select-item-select-0-2']")).click();

		WebElement day = driver.findElement(By.xpath("//*[@id='select-1']"));
		day.click();
		driver.findElement(By.xpath("//*[@id='select-item-select-1-4']")).click();

	}

}
