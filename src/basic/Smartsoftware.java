package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Smartsoftware {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayes\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://smarthousingsocieties.com/about.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("swadatkar@gmail.com");
		driver.findElement(By.id("txtPassword")).sendKeys("Smart@777");
		driver.findElement(By.id("btnSubmit")).click();


	}

}
