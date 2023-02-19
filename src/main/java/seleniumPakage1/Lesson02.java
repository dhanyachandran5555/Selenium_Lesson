package seleniumPakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson02 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/dhany/OneDrive/Documents/STUDY%20MATERIALS/Selenium/HTML%20Page.html");

		/*WebElement name=driver.findElement(By.id("001"));
		name.sendKeys("Dhanya");
		
		WebElement male=driver.findElement(By.id("002"));
		male.click();
		
		WebElement female=driver.findElement(By.id("003"));
		female.click();
		
		WebElement agree=driver.findElement(By.id("004"));
		agree.click();
		
		WebElement ok=driver.findElement(By.id("005"));
		ok.click();*/
		
		/*WebElement name1=driver.findElement(By.name("A"));
		name1.sendKeys("Dhanya");
		
		WebElement male=driver.findElement(By.name("B"));
		male.click();
		
		WebElement female=driver.findElement(By.name("C"));
		female.click();
		
		WebElement agree=driver.findElement(By.name("D"));
		agree.click();
		
		WebElement ok=driver.findElement(By.name("E"));
		ok.click();*/
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
		
		//WebElement link=driver.findElement(By.linkText("Click me"));
		//link.click();	
		WebElement link=driver.findElement(By.partialLinkText("Click"));
		link.click();
		
		
		WebElement link1=driver.findElement(By.tagName("a")); // a is the tag (<a href="https:www.google.com">)
		link1.click();
		
		
		}

}
