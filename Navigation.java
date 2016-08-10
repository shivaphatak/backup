import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

//Program to Mouse Over

public class Navigation {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new FirefoxDriver();
        driver.get("http://www.choice-fm.co.uk");
        //WebElement link_Home = driver.findElement(By.linkText("Home"));
        WebElement link_RADIO = driver.findElement(By.linkText("RADIO"));
        Actions builder = new Actions(driver);
        Thread.sleep(5000);
       // Action mouseOverHome = builder.moveToElement(link_Home).build();
        Action mouseOverRadio = builder.moveToElement(link_RADIO).build();
       // mouseOverHome.perform();
        mouseOverRadio.perform();
        
	}

}
