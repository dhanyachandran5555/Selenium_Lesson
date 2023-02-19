package seleniumPakage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/dhany/OneDrive/Documents/STUDY%20MATERIALS/Selenium/Seconpage.html");
		//driver.findElement(By.id("1"));
		
		List<WebElement> txtbox=driver.findElements(By.id("001"));
		for(WebElement temp:txtbox)
		{
			temp.sendKeys("Dhanya");
		}
		
		List<WebElement> rbuton=driver.findElements(By.id("002"));
		for(WebElement temp:rbuton)
		{
			temp.click();
		}
	}

}
