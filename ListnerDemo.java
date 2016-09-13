package Snapshot.AWSTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ListnerDemo {
	
	public static void main(String[] args) {
		System.out.println("Started");
		System.setProperty("webdriver.gecko.driver","F:\\Lappy Backup\\Shivalika\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		EventFiringWebDriver event1=new EventFiringWebDriver(driver);

		ActivityCapture handle=new ActivityCapture();

		event1.register(handle);

		event1.navigate().to("http://www.facebook.com");

		event1.findElement(By.id("email")).sendKeys("asdsadsa");

		event1.findElement(By.id("loginbutton")).click();

		//event1.quit();

		event1.unregister(handle);

		System.out.println("End");
	}

}
