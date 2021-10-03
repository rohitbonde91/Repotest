package Edu;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	public static void main(String [] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertmessage = driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		alert.accept();
		Thread.sleep(2000);
		driver.quit();
	}

}
