package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
//		WebElement gSerach = driver.findElement(By.name("q"));
//		gSerach.sendKeys("selenium");
//		gSerach.sendKeys(Keys.ENTER);
//		driver.findElement(By.xpath("(//div[@id='rso']//h3)[1]")).click();
//		driver.findElement(By.linkText("Sell")).click();
//		driver.findElement(By.id(""));
//		driver.findElement(By.className(""));
//		driver.findElement(By.cssSelector(""));
//		driver.findElement(By.partialLinkText(""));
//		driver.findElement(By.tagName(""));
		
		List<WebElement> l =  driver.findElements(By.tagName("a"));
	}

}
