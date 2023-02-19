package seleniumPakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_ID {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("My First Selenium FrameWork");
		
		WebElement btn=driver.findElement(By.id("button-one"));
		btn.click();
		
		WebElement valuea=driver.findElement(By.id("value-a"));
		valuea.sendKeys("467");
		
		WebElement valueb=driver.findElement(By.id("value-b"));
		valueb.sendKeys("678");
		
		WebElement total=driver.findElement(By.id("button-two"));
		total.click();		
	}

}
