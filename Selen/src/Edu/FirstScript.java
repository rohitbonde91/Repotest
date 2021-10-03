package Edu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 8 plus");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("MI")).click();
		driver.navigate().to("https://edureka.co/blog");
		driver.navigate().back();
		driver.quit();
		//driver.close();
		 
		
		
	}
}
