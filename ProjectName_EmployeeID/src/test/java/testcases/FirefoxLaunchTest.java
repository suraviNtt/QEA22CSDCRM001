package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxLaunchTest {

	public static void main(String[] args) {
		
		String applicationURL = "https://www.google.com/";
		String searchBoxlocator = "q";
		String searchText = "Selenium";

		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
	}
}
