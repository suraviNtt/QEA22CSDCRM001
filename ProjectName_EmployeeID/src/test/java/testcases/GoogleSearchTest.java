package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {

		String applicationURL = "https://www.google.com/";
		String searchBoxlocator = "q";
		String searchText = "Selenium";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(applicationURL);

		WebElement searchBox = driver.findElement(By.name(searchBoxlocator));
		Thread.sleep(2000);
		searchBox.sendKeys(searchText);
		Thread.sleep(2000);
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();

	}

}