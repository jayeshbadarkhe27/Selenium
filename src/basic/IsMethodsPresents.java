package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsMethodsPresents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayes\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(60, null);
		WebElement checkbox = driver.findElement(By.xpath("//*[@id='ch']"));

		boolean checked = checkbox.isEnabled();
		System.out.println(checked);

		WebElement checkbo = driver.findElement(By.xpath("//*[@id='ch']"));

		boolean checke = checkbo.isSelected();
		System.out.println(checke);
		WebElement button = driver.findElement(By.xpath("//*[@id='checkbox']"));

		button.click();
		Thread.sleep(12000);
		WebElement checkb = driver.findElement(By.xpath("//*[@id='ch']"));

		boolean check = checkb.isSelected();
		System.out.println(check);


	}

}
