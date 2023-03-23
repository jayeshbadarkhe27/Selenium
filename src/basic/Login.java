package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayes\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("8805355435");
		driver.findElement(By.name("pass")).sendKeys("jayesh");
		driver.findElement(By.name("login")).click();
		String jay = driver.getTitle();
		System.out.println(jay);
		String jayesh = driver.getCurrentUrl();
		System.out.println(jayesh);
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().to(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("Jayesh Badarkhe");
		driver.findElement(By.id("ap_phone_number")).sendKeys("7264946431");
		driver.findElement(By.id("ap_email")).sendKeys("jayeshbadarkhe9652@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("79567956");

		driver.findElement(By.id("continue")).click();

		driver.navigate().back();
		
	}

}
