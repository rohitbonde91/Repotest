package edurekagmailcode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edureka {
	
	public static void main(String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ebay.com");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Oneplus8");
		driver.findElement(By.cssSelector("#gh-btn")).click();
		js.executeScript("window.scrollBy(0,500)");
		driver.quit();
		System.out.println("succes");
	}
	
}

 