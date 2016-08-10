import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

// operations on window handles, context click , Keyboard Keys

public class Google {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    driver.get("http://google.com");
    WebElement E=driver.findElement(By.linkText("About"));
    Actions action=new Actions(driver);
    action.contextClick(E).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
    String winHandleBefore = driver.getWindowHandle();
    for(String winHandle : driver.getWindowHandles())
    {
    System.out.println(driver.switchTo().window(winHandle).getTitle());
    }
    driver.close();
    driver.switchTo().window(winHandleBefore);

	}}


