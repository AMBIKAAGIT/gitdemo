package package2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		        // Set the path to the ChromeDriver executable
		        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64");

		        // Initialize ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // Open the webpage
		        driver.get("https://designsystem.digital.gov/components/radio-buttons/");

		        // Find the radio button element by its ID, name, class, XPath, or CSS selector
		        WebElement radioButton = driver.findElement(By.xpath("//*[@id=\"radio-buttons-preview-content\"]/fieldset/div[2]/label")); // Change "radioButton" to the actual ID of your radio button element

		        // Check if the radio button is not already selected
		        if (!radioButton.isSelected()) {
		            // Click on the radio button to select it
		            radioButton.click();
		        }

		        // Alternatively, you can use the click() method directly without checking isSelected() first:
		        // radioButton.click();

		        // Close the browser
		        driver.quit();
		    }
		
	}


