package week3.day2;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Ajio {
/*1. Launch the URL https://www.ajio.com/
2. In the search box, type as "bags" and press enter
3. To the left  of the screen under " Gender" click the "Men"
4. Under "Category" click "Fashion Bags"
5. Print the count of the items Found. 
6. Get the list of brand of the products displayed in the page and print the list.
7. Get the list of names of the bags and print*/
	
	public static void main(String[] args) throws InterruptedException {
		//Setup the driver
		WebDriverManager.chromedriver().setup();
		//Open the browser
		ChromeOptions options = new ChromeOptions();
		//Disable alert notification
		options.addArguments("--disable-notifications");
		//Open the browser
		ChromeDriver driver = new ChromeDriver(options);
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Maximize
		driver.manage().window().maximize();
		//1. Launch the URL https://www.ajio.com/		
		driver.get("https://www.ajio.com/");
		
		Thread.sleep(5000);
		//2. In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags", Keys.ENTER);
		Thread.sleep(3000);
		//3. To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(2000);
		//4. Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(2000);
		//5.Print the count of the items Found.		
		System.out.println(driver.findElement(By.xpath("//div[@class='length']")).getText());
		
		//6. Get the list of brand of the products displayed in the page.
		List<WebElement> myBagBrands = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("List of Brands Available:");
		System.out.println("-------------------------");
		// print the list
		for(WebElement myEle:myBagBrands)
			System.out.println(myEle.getText());

		//7. Get the list of names of the bags.
		List<WebElement> myBagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("                        ");
		System.out.println("List of Bags Available:");
		System.out.println("-------------------------");
		// print the list
		for(WebElement myEle:myBagNames)
			System.out.println(myEle.getText());

		
	}

}
