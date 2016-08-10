import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//Wikipedia – get all links 

public class Wikipedia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    WebDriver driver = new FirefoxDriver();
        /*		
		List<WebElement> WebElement List1=(WebElement) new ArrayList<WebElement>();
		List1=driver.findElement(By.xpath("//a[@class='link-box']/*"));
		*/
        driver.get("http://www.wikipedia.org/");
        System.out.println(driver.getTitle());
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        
        for (WebElement element : elements) 
        {
            System.out.println(element.getText());
        }
        
	}

}
