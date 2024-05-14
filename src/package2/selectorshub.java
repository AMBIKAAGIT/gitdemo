package package2;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
public class selectorshub {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-27\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-33\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-1075\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-4098\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-36\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-48\"]/a")).click();	
		//product page
		driver.findElement(By.xpath("//*[@id=\"menu-item-27\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-2279\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-27\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-6293\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-27\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-2280\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-27\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-4258\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-27\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-8375\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-27\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-9482\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-27\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-6186\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-27\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-7065\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-27\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-31\"]/a")).click();
		Thread.sleep(1000);
		//proplans
		driver.findElement(By.xpath("//*[@id=\"menu-item-33\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-6291\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-33\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-4629\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-33\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-11324\"]/a")).click();
	//resources page
		driver.findElement(By.xpath("//*[@id=\"menu-item-36\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-15215\"]/a")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\"menu-item-36\"]/div/a")).click();
		//driver.findElement(By.xpath("//*[@id=\"menu-item-15682\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-36\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-1074\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-36\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-1062\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-36\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-1061\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-36\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-39\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-36\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-7169\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-36\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-8195\"]/a")).click();
		//help page
		driver.findElement(By.xpath("//*[@id=\"menu-item-48\"]/a")).click();
		//footer
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"colophon\"]/div/div/section[1]/div/div[2]/div/div[2]/div/h2/a")).click();
		driver.findElement(By.xpath("//*[@id=\"colophon\"]/div/div/section[1]/div/div[2]/div/div[3]/div/h2/a")).click();
		driver.findElement(By.xpath("//*[@id=\"colophon\"]/div/div/section[1]/div/div[2]/div/div[4]/div/h2/a")).click();
		driver.findElement(By.xpath("//*[@id=\"colophon\"]/div/div/section[1]/div/div[2]/div/div[5]/div/h2/a")).click();
		driver.findElement(By.xpath("//*[@id=\"colophon\"]/div/div/section[1]/div/div[2]/div/div[6]/div/h2/a")).click();
		driver.findElement(By.xpath("//*[@id=\"colophon\"]/div/div/section[1]/div/div[3]/div/div[2]/div/h2/a")).click();
		driver.findElement(By.xpath("//*[@id=\"colophon\"]/div/div/section[1]/div/div[3]/div/div[3]/div/h2/a")).click();
		driver.findElement(By.xpath("//*[@id=\"colophon\"]/div/div/section[1]/div/div[3]/div/div[4]/div/h2/a")).click();
		driver.findElement(By.xpath("//*[@id=\"colophon\"]/div/div/section[1]/div/div[3]/div/div[5]/div/h2/a")).click();
		driver.findElement(By.xpath("//*[@id=\"colophon\"]/div/div/section[1]/div/div[4]/div/div[2]/div/h2/a")).click();
		driver.findElement(By.xpath("//*[@id=\"colophon\"]/div/div/section[1]/div/div[4]/div/div[3]/div/h2/a")).click();
		driver.findElement(By.xpath("//*[@id=\"colophon\"]/div/div/section[1]/div/div[4]/div/div[4]/div/h2/a")).click();
		driver.findElement(By.xpath("//*[@id=\"colophon\"]/div/div/section[1]/div/div[4]/div/div[5]/div/h2/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"menu-item-4098\"]/a")).click();	
		//WebElement element=driver.findElement(By.xpath("//*[@id=\"shub53\"]"));
		//element.sendKeys("anu@gmail.com");
		WebElement element2=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		element2.sendKeys("12");
		WebElement element3=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/section[2]/div/div[1]/div/div[1]/div/div/div[1]/div/div/div/input[1]"));
		element3.sendKeys("abc");
		WebElement element4=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/section[2]/div/div[1]/div/div[1]/div/div/div[1]/div/div/div/input[2]"));
		element4.sendKeys("345677788899");
		WebElement element5=driver.findElement(By.xpath("//*[@id=\"inp_val\"]"));
		element5.sendKeys("jhghhg");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/section[2]/div/div[1]/div/div[1]/div/div/button")).click();
		
		//WebElement element7=driver.findElement(By.cssSelector("#kils"));
		//Thread.sleep(1000);
		//element7.sendKeys("aju");
		//Thread.sleep(1000);
		//WebElement element8=driver.findElement(By.xpath("//*[@id=\"pizza\"]"));
		//element8.sendKeys("cheessy pizza");
//		WebElement element9=driver.findElement(By.xpath("//*[@id=\"training\"]"));
//		element9.sendKeys("demo");
//		WebElement element10=driver.findElement(By.xpath("//*[@id=\"pwd\"]"));
		//element10.sendKeys("123");
		//Thread.sleep(1000);
		//WebElement element11=driver.findElement(By.cssSelector("#content > div > div.elementor.elementor-1097 > section.elementor-section.elementor-top-section.elementor-element.elementor-element-0731668.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default > div > div.elementor-column.elementor-col-50.elementor-top-column.elementor-element.elementor-element-ba88d26 > div > div.elementor-element.elementor-element-dfae242.elementor-widget__width-inherit.elementor-widget.elementor-widget-html > div > div:nth-child(4) > input:nth-child(2)"));
		//element11.sendKeys("diya");
		//WebElement element12=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/section[2]/div/div[2]/div/div[2]/div/div[1]/input[2]"));
		//element12.sendKeys("k");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#content > div > div.elementor.elementor-1097 > section.elementor-section.elementor-top-section.elementor-element.elementor-element-0731668.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default > div > div.elementor-column.elementor-col-50.elementor-top-column.elementor-element.elementor-element-ba88d26 > div > div.elementor-element.elementor-element-dfae242.elementor-widget__width-inherit.elementor-widget.elementor-widget-html > div > div.dropdown > button")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#content > div > div.elementor.elementor-1097 > section.elementor-section.elementor-top-section.elementor-element.elementor-element-0731668.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default > div > div.elementor-column.elementor-col-50.elementor-top-column.elementor-element.elementor-element-ba88d26 > div > div.elementor-element.elementor-element-dfae242.elementor-widget__width-inherit.elementor-widget.elementor-widget-html > div > div.dropdown > div > a:nth-child(1)")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#content > div > div.elementor.elementor-1097 > section.elementor-section.elementor-top-section.elementor-element.elementor-element-0731668.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default > div > div.elementor-column.elementor-col-50.elementor-top-column.elementor-element.elementor-element-ba88d26 > div > div.elementor-element.elementor-element-dfae242.elementor-widget__width-inherit.elementor-widget.elementor-widget-html > div > div.dropdown > button")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#content > div > div.elementor.elementor-1097 > section.elementor-section.elementor-top-section.elementor-element.elementor-element-0731668.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default > div > div.elementor-column.elementor-col-50.elementor-top-column.elementor-element.elementor-element-ba88d26 > div > div.elementor-element.elementor-element-dfae242.elementor-widget__width-inherit.elementor-widget.elementor-widget-html > div > div.dropdown > div > a:nth-child(2)")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("#content > div > div.elementor.elementor-1097 > section.elementor-section.elementor-top-section.elementor-element.elementor-element-0731668.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default > div > div.elementor-column.elementor-col-50.elementor-top-column.elementor-element.elementor-element-ba88d26 > div > div.elementor-element.elementor-element-dfae242.elementor-widget__width-inherit.elementor-widget.elementor-widget-html > div > div.dropdown > button")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("#content > div > div.elementor.elementor-1097 > section.elementor-section.elementor-top-section.elementor-element.elementor-element-0731668.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default > div > div.elementor-column.elementor-col-50.elementor-top-column.elementor-element.elementor-element-ba88d26 > div > div.elementor-element.elementor-element-dfae242.elementor-widget__width-inherit.elementor-widget.elementor-widget-html > div > div.dropdown > div > a:nth-child(3)")).click();
	    Thread.sleep(1000);
	    //dropdown
	    WebElement dropdownElement = driver.findElement(By.cssSelector("#cars"));
	    Thread.sleep(1000);
	    // Create a Select object
	    Select dropdown = new Select(dropdownElement);
	    Thread.sleep(1000);
	    // Select option by visible text
	    dropdown.selectByVisibleText("Volvo");
	    Thread.sleep(1000);
	    dropdown.selectByVisibleText("Saab");
	    Thread.sleep(1000);
	    dropdown.selectByVisibleText("Opel");
	    Thread.sleep(1000);
	    dropdown.selectByVisibleText("Audi");
	    Thread.sleep(1000);
	    //fileupload
	    WebElement fileInput = driver.findElement(By.cssSelector("#myFile"));

	    // Specify the path of the file to upload
	    String filePath = "C:\\Users\\USER\\Documents\\futuraexcel.txt";

	    // Enter the file path into the file input element
	    fileInput.sendKeys(filePath);
}
}