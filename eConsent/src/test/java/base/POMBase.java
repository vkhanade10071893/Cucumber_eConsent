package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMBase {

	
public static WebDriver driver;
	
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\\\UE7_Medidata_Training\\\\downloads\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

}
