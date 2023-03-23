package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayes\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();

		// Alert Pop-up with Ok button..............

		WebElement button = driver.findElement(By.xpath("//*[@name='alert']"));
		button.click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(4000);
		driver.switchTo().alert().accept();

		// Alert Pop-up with Ok and cancel button.........

		WebElement confirmbutton = driver.findElement(By.xpath("//*[@name='confirmation']"));
		confirmbutton.click();
		String alerttxt = driver.switchTo().alert().getText();
		System.out.println(alerttxt);
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();

		// Upload file.........

		driver.findElement(By.xpath("//*[@name='upload']"))
				.sendKeys("C:\\Users\\jayes\\OneDrive\\Pictures\\Documents\\Interpersonal Skills1.docx");

	}

}
