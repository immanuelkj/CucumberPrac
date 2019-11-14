package org.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	
		
		public static WebDriver driver;
		
		static int rowscount, cellscount;
		
		
		public static WebDriver Browerlan() {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SampleCucum\\driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			return driver;
		}
		
		public static void getUrl(String url) {
			
			driver.get(url);

		}
		
		public static WebElement findElementByXpath(String id) {
			
			WebElement element = driver.findElement(By.xpath(id));
			
			return element;
		}
		
		public static void sendval(WebElement e, String a) {
		
			e.sendKeys(a);

		}
		
		public static void btnclick(WebElement ee) {
			ee.click();
			
		}
		
	}
	


