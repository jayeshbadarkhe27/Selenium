package basic;
  
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayes\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement button = driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		button.click();
		List<WebElement> day = driver.findElements(By.xpath("//*[@id='day']//option"));
		for (WebElement dayvalues : day) {
			String daysoption = dayvalues.getText();
			if (daysoption.equalsIgnoreCase("3")) {
				dayvalues.click();

			}

		}
		List<WebElement> month = driver.findElements(By.xpath("//*[@id='month']//option"));
		for (WebElement monthvalues : month) {
			String monthoption = monthvalues.getText();
			if (monthoption.equalsIgnoreCase("Jul")) {
				monthvalues.click();
			}
		}

	}

}
