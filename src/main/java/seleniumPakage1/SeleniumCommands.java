package seleniumPakage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCommands {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//WebDriver is Parent and ChromeDriver is Child
		//WebDriver driver=new EdgeDriver();//Open Edge
		//WebDriver driver=new FirefoxDriver();//Open Firefox
		//driver.get("https:www.facebook.com");	
		//System.out.println(driver.getTitle());//Print the title of opened URL in Console
		//System.out.println(driver.getCurrentUrl());//print the url in the console
		//System.out.println(driver.getPageSource());//page source will be printed in the console
		driver.navigate().to("https:www.capestart.com"); //same as driver.get()
		System.out.println(driver.getTitle());
		//driver.navigate().forward(); 
			//driver.navigate().back();//Open the above requested site and come back
			//driver.navigate().refresh();//?
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		driver.close();
		//driver.quit();

	}

}
