package seleniumPakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_LocatorIndex {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.uitestpractice.com/Students/Form");
		
		WebElement fname=driver.findElement(By.xpath("//input[@id='firstname']"));
		fname.sendKeys("Dhanya");
		fname.clear();
		fname.sendKeys("Preetha");
		
		System.out.println("Printing the boolean result of Is Selected: "+fname.isSelected());
		System.out.println("Printing the boolean result of Is Enabled: "+fname.isEnabled());
		System.out.println("Printing the boolean result of Is Displayed: "+fname.isDisplayed());
		System.out.println("Getting the text: "+fname.getText());
		System.out.println("Getting the tag name: "+fname.getTagName());
		System.out.println("Getting the Attribute: "+fname.getAttribute("class"));
		System.out.println("Getting the CSS vlaue: "+fname.getCssValue("color"));
		System.out.println("Getting the size: "+fname.getSize());
		System.out.println("Getting the Location: "+fname.getLocation());
		
		WebElement lname=driver.findElement(By.xpath("//input[@id='lastname']"));
		lname.sendKeys("Chandran");
		
		WebElement mstatus=driver.findElement(By.xpath("(//input[@name='optradio'])[2]"));//we have duplicate optradio in console, so here we used index (numbering the attribute)
		mstatus.click();

	}

}
