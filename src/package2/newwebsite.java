package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newwebsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64");
WebDriver driver=new ChromeDriver();
driver.get("https://thefuturalabs.com/");
driver.manage().window().maximize();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"menu-item-35\"]/a/span/span")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"menu-item-381\"]/a/span/span[2]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"menu-item-33\"]/a/span/span")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"menu-item-32\"]/a/span/span")).click();
Thread.sleep(1000);
//cource
driver.findElement(By.xpath("//*[@id=\"menu-item-381\"]/a/span/span[2]")).click();
 Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"menu-item-401\"]/a/span")).click();
 Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"menu-item-381\"]/a/span/span[2]")).click();
 Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"menu-item-399\"]/a/span")).click();
 Thread.sleep(1000);

	}

}
