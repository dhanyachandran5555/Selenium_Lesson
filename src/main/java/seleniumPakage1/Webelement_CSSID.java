package seleniumPakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_CSSID {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/dhany/OneDrive/Documents/STUDY%20MATERIALS/Selenium/HTML%20Page.html");
		WebElement name=driver.findElement(By.cssSelector("//input[id='001']"));
		name.sendKeys("Dhanya");
		
		WebElement male=driver.findElement(By.cssSelector("//input[name='B']"));//Xpath should be unique.
		male.click();
		
		WebElement female=driver.findElement(By.cssSelector("//input[class='ClassThree']"));
		female.click();

	}

}
