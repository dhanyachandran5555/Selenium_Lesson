package seleniumPakage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("C:/Users/dhany/OneDrive/Documents/STUDY%20MATERIALS/Selenium/HTML%20Page.html");
		WebElement lan = driver.findElement(By.id("language1"));
		Select sel = new Select(lan);
		sel.selectByIndex(1);  //three ways to select the drop down
		sel.selectByVisibleText("Java");
		sel.selectByValue("c++");
		
		/*sel.deselectByIndex(1);
		sel.deselectByVisibleText("Java");
		sel.deselectByValue("c++");*/
		
		//sel.deselectAll();
		List<WebElement> list=sel.getAllSelectedOptions();
		for(WebElement option:list)
		{
			
			System.out.println(option.getText());
		}
		System.out.println(sel.getFirstSelectedOption().getText());
		
		/*List<WebElement> list=sel.getOptions();   //--> to select all dropdowns
		for(WebElement option:list)
		{
			
			System.out.println(option.getText());
		}
		System.out.println("First Selected Option: "+sel.getFirstSelectedOption().getText()); */
		
		System.out.println(sel.isMultiple()); //return the boolean true or false

		
	}

}
