package week3.day2;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
/*1. Launch Chrome Browser and go to http://leafground.com/pages/Link.html
 *2. Get all the links(using findElements)
 *3. Click on the first Link (using get method with index as 0)
 *4. Print the title
 *5. Navigate back on the browser (driver.navigate().bac())
 *6. Get all the links again (using findElements)
 *7. Print the count of the links(size)
 *8. print the href value(getAttribute) of the second link 
 * */
public class ClassAct1_Link {

	public static void main(String[] args) throws InterruptedException {
		//setup the driver
		WebDriverManager.chromedriver().setup();
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Maximize 
		driver.manage().window().maximize();
		//Load the url
		driver.get("http://leafground.com/pages/Link.html");
		
		//2.Get all the links
	    List<WebElement> allLinks = driver.findElements(By.tagName("a"));

	    //3. Click on the first link (using get method with index as 0)
		WebElement firstLink = allLinks.get(0);
		firstLink.click();
		
		//4. Print the title
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		//5. Navigate back on the browser (driver.navigate().bac())
		driver.navigate().back();
		
		//6.Get all the links again (using findElements) and 7. Print the count
		List<WebElement> allLink2 = driver.findElements(By.tagName("a"));
		System.out.println(allLink2.size());//6
		
		//8. print the href value(getAttribute) of the second link
		System.out.println("href of 2nd Link:" + allLink2.get(1).getAttribute("href"));
	}

}
