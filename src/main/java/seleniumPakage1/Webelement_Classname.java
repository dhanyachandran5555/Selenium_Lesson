package seleniumPakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Classname {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/dhany/OneDrive/Documents/STUDY%20MATERIALS/Selenium/HTML%20Page.html");
		
		WebElement name1=driver.findElement(By.className("ClassOne"));
		name1.sendKeys("Dhanya");
		
		WebElement male=driver.findElement(By.className("ClassTwo"));
		male.click();
		
		WebElement female=driver.findElement(By.className("ClassThree"));
		female.click();
		
		WebElement agree=driver.findElement(By.className("ClassFour"));
		agree.click();
		
		WebElement ok=driver.findElement(By.className("ClassFive"));
		ok.click();
		
		WebElement link=driver.findElement(By.linkText("Click me"));
		link.click();
	}

}
