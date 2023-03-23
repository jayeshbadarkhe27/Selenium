package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe\\");
//
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://www.google.com/");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayes\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("http://www.flipkart.com/");
		driver1.navigate().to("http://www.facebook.com/");
		Thread.sleep(2000);
		driver1.navigate().forward();
		driver1.navigate().back();
		Thread.sleep(2000);
		driver1.navigate().refresh();
		driver1.close();

//		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe\\");
//	    ChromeDriver driver2 = new ChromeDriver();
//		driver2.get("http://www.myntra.com/");

//		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe\\");
//		ChromeDriver jayesh = new ChromeDriver();
//		jayesh.get("http://www.facebook.com/");


	}

}
