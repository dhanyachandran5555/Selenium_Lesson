package seleniumPakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Name {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/dhany/OneDrive/Documents/STUDY%20MATERIALS/Selenium/HTML%20Page.html");
		WebElement name1=driver.findElement(By.name("A"));
		name1.sendKeys("Dhanya");
		
		WebElement male=driver.findElement(By.name("B"));
		male.click();
		
		WebElement female=driver.findElement(By.name("C"));
		female.click();
		
		WebElement agree=driver.findElement(By.name("D"));
		agree.click();
		
		WebElement ok=driver.findElement(By.name("E"));
		ok.click();

	}

}
