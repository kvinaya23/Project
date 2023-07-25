package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
public static WebDriver init() {
		
		
	  System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\kulka\\Project\\Unit_Project\\driver\\chromedriver.exe");
	   driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/test/105/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

       public static void tearDown() {
        driver.close();
}
}
