package package2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Set the path to the ChromeDriver executable
		        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64");
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the webpage with the dropdown
		        driver.get("https://example.com");

		        // Identify the dropdown element
		        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));

		        // Create a Select object
		        Select dropdown = new Select(dropdownElement);

		        // Select option by visible text
		        dropdown.selectByVisibleText("Albania");

		        // Alternatively, you can select option by value or index
		        // dropdown.selectByValue("value");
		        // dropdown.selectByIndex(0);

		        // Close the browser
		        driver.quit();
		    }
		}
		        // Initialize ChromeDriver
		        
		        // Close the browser
		      
		   
