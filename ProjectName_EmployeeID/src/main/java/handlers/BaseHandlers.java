package handlers;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class BaseHandlers {

	/**
	 * fetch hardwait
	 */
	public void applyHardWait() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * clicking on element
	 * 
	 * @param element
	 */
	public void clickOnWebElement(WebElement element) {

		try {
			element.isDisplayed();
			element.click();
			System.out.println("Click element success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Click element not successfull");
		}
	}

	/**
	 * send text to text box element
	 * 
	 * @param element
	 * @param text
	 */
	public void sendTextToWebElement(WebElement element, String text) {

		try {
			element.isDisplayed();
			element.sendKeys(text);
			System.out.println("Click element success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Click element not successfull");
		}
	}

	/**
	 * click on enter keys
	 * 
	 * @param element
	 */
	public void clickEnterOnWebElement(WebElement element) {

		try {
			element.isDisplayed();
			element.sendKeys(Keys.ENTER);
			System.out.println("Click element success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Click element not successfull");
		}
	}

}
