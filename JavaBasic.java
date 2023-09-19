package firstclass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class JavaBasic {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(capabilities);
			ChromeDriver driver = new ChromeDriver(options);
			driver.get("https://www.linkedin.com/");
			driver.findElement(By.id("session_key")).sendKeys("Kausalya24@gmail.com");
			driver.findElement(By.id("session_password")).sendKeys("Sathya@2010");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}

	}



