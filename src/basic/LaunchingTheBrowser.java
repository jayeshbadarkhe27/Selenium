package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayes\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.Amazon.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);

		driver.close();
	}

}
