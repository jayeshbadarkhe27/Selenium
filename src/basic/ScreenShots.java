package basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayes\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		ChromeDriver driver = new ChromeDriver();
//	     driver.get("https://www.amazon.in//");
//	     driver.manage().window().maximize();
//	     TakesScreenshot ss=(TakesScreenshot)driver;
//	     File source = ss.getScreenshotAs(OutputType.FILE);
//	     File distination = new File("C:\\Users\\jayes\\OneDrive\\Desktop\\Selenium Screenshot\\Screenshot.png");
//	     FileHandler.copy(source, distination);
//
//	     driver.navigate().to("https://www.flipkart.com/");
//	     TakesScreenshot jj = (TakesScreenshot)driver;
//	     File form = jj.getScreenshotAs(OutputType.FILE);
//	     File to = new File("C:\\Users\\jayes\\OneDrive\\Desktop\\Selenium Screenshot\\SecondScreenshot.png");
//	     FileHandler.copy(form, to);
//
//	     driver.navigate().to("https://www.google.com/search?q=maharaj+images&sxsrf=ALiCzsaWRLTN3HIcdxUlOJIqxDS_pmXq_Q%3A1663327426942&ei=wlwkY-eYOaiB1e8P1Pik6As&oq=maharaj+im&gs_lcp=Cgdnd3Mtd2l6EAEYADIFCAAQgAQyBAgAEAoyBAgAEAoyBQgAEIAEMgUIABCABDIECAAQCjIHCAAQyQMQCjIKCC4QxwEQrwEQCjIKCC4QxwEQrwEQCjIFCAAQgAQ6CggAEEcQ1gQQsAM6BwgAELADEEM6DQguEMcBENEDELADEEM6CgguEMcBENEDECc6DggAELEDEIMBEJECEIsDOg4IABCABBCxAxCDARCLAzoHCAAQAxCLAzoLCAAQgAQQsQMQgwE6EwgAEIAEEIcCELEDEIMBEBQQiwM6CwgAEIAEELEDEIsDOhAILhDHARDRAxAnEKgDEKYDOgQIIxAnOhQIABCABBCxAxCDARCLAxCoAxCmAzoICAAQgAQQiwM6BwgAEEMQiwM6FAguELEDEIMBEIsDEKgDEJoDEJsDOg0ILhDHARDRAxDqAhAnOgcIIxDqAhAnOgQILhAnOggIABCRAhCLAzoLCAAQsQMQgwEQiwM6DgguEIAEELEDEIMBEIsDOgQILhBDOgoIABCxAxCDARBDOgoILhDHARDRAxBDOgQIABBDOgsILhCABBCxAxCDAToMCAAQsQMQgwEQChBDOgcIABCxAxBDOgoILhCxAxDUAhBDOhAILhCxAxCDARDHARDRAxBDOgcILhCxAxBDOggIABCABBCxAzoICAAQsQMQgwE6CwguEIAEEMcBEK8BOgoIABCABBCHAhAUOhEILhCABBCxAxCDARDHARCvAToICC4QsQMQgwE6CwguEIAEELEDENQCOgUILhCABDoFCAAQsQNKBAhBGABKBAhGGABQjQZYgVdgtmpoAnABeACAAeYCiAGuIpIBBzAuMy45LjWYAQCgAQGwAQrIAQq4AQLAAQE&sclient=gws-wiz#imgrc=9wbr14hcqkI_zM");
//	     TakesScreenshot j = (TakesScreenshot)driver;
//	     File formss = j.getScreenshotAs(OutputType.FILE);
//	     File too = new File("C:\\Users\\jayes\\OneDrive\\Desktop\\Selenium Screenshot\\MAharaj.png");
//	     FileHandler.copy(formss, too);

		driver.get(
				"https://www.thequint.com/sports/world-cup/india-vs-bangladesh-world-cup-2019-match-ball-by-ball-live-cricket-score-updates");
		driver.manage().window().maximize();
//	     TakesScreenshot screens = (TakesScreenshot)driver;
//	     File yhasey = screens.getScreenshotAs(OutputType.FILE);
//
//	     File wahaatak = new File("C:\\Users\\jayes\\OneDrive\\Desktop\\Selenium Screenshot\\raje.png");
//	     FileHandler.copy(yhasey, wahaatak);

		TakesScreenshot scrshot = driver;
		File source = scrshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\jayes\\eclipse-workspace\\selenium\\Screenshots.png");
		FileHandler.copy(source, destination);

	}

}
