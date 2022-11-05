package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import browserSetup.DriverSetup;
import handlers.BaseHandlers;

public class GSearchTest {
	
	public static void main(String[] args) {
		
		String browserName = "chrome";
		String applicationURL = "https://www.google.com/";
		String searchText = "Selenium";
		String searchBoxlocator = "q";
		String firstSearchResultLocator = "(//*[@id='rso']//h3)[1]";
		
		BaseHandlers baseHandlers = new BaseHandlers();
		
		WebDriver driver = DriverSetup.getWebDriver(browserName);
		
		
		driver.manage().window().maximize();
		driver.get(applicationURL);

		WebElement searchBox = driver.findElement(By.name(searchBoxlocator));
		baseHandlers.applyHardWait();
		baseHandlers.sendTextToWebElement(searchBox, searchText);
		baseHandlers.applyHardWait();
		baseHandlers.clickEnterOnWebElement(searchBox);
		
		WebElement firstSearchResult = driver.findElement(By.xpath(firstSearchResultLocator));
		baseHandlers.clickOnWebElement(firstSearchResult);
		
		driver.quit();

	}

}
