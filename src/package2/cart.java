package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
		Thread.sleep(1000);
		WebElement element=driver.findElement(By.xpath("//*[@id=\"recipient-email\"]"));
		element.sendKeys("anu@gmail.com");
		Thread.sleep(1000);
		WebElement element2=driver.findElement(By.xpath("//*[@id=\"message-text\"]"));
		element2.sendKeys("testing");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#navbarExample > ul > li:nth-child(3) > a")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#videoModal > div > div > div.modal-footer > button")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#cartur")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#page-wrapper > div > div.col-lg-1 > button")).click();
		Thread.sleep(1000);
		WebElement nam=driver.findElement(By.xpath("//*[@id=\"name\"]"));
		nam.sendKeys("anu");
		Thread.sleep(1000);
		WebElement country=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		country.sendKeys("india");
		Thread.sleep(1000);
		WebElement city=driver.findElement(By.xpath("//*[@id=\"city\"]"));
		city.sendKeys("kunnamangalam");
		Thread.sleep(1000);
		WebElement creditcard=driver.findElement(By.xpath("//*[@id=\"card\"]"));
		creditcard.sendKeys("1234");
		WebElement month=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		month.sendKeys("april");
		WebElement year=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		year.sendKeys("2024");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#orderModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#signin2")).click();
		Thread.sleep(1000);
		WebElement unam=driver.findElement(By.cssSelector("#sign-username"));
		unam.sendKeys("anuradha");
		WebElement pw=driver.findElement(By.cssSelector("#sign-password"));
		pw.sendKeys("anu1");
		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#login2")).click();
		Thread.sleep(1000);
		WebElement un=driver.findElement(By.xpath("//*[@id=\"loginusername\"]"));
		Thread.sleep(1000);
		un.sendKeys("anuratha");
		Thread.sleep(1000);
		WebElement paw=driver.findElement(By.xpath("//*[@id=\"loginpassword\"]"));
		Thread.sleep(1000);
		paw.sendKeys("anu1");
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[1]")).click();
		//categories
		driver.findElement(By.cssSelector("#tbodyid > div:nth-child(1) > div > div > h4 > a")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#tbodyid > div.row > div > a")).click();
		driver.get("https://www.demoblaze.com/cart.html");
		driver.findElement(By.cssSelector("#page-wrapper > div > div.col-lg-1 > button")).click();
		Thread.sleep(1000);
		WebElement name=driver.findElement(By.xpath("//*[@id=\"name\"]"));
		name.sendKeys("anu");
		Thread.sleep(1000);
		WebElement countr=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		countr.sendKeys("india");
		Thread.sleep(1000);
		WebElement city1=driver.findElement(By.xpath("//*[@id=\"city\"]"));
		city1.sendKeys("kunnamangalam");
		Thread.sleep(1000);
		WebElement creditcard1=driver.findElement(By.xpath("//*[@id=\"card\"]"));
		creditcard1.sendKeys("1234");
		WebElement month1=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		month1.sendKeys("april");
		WebElement year1=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		year1.sendKeys("2024");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#orderModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button")).click();
		Thread.sleep(1000);	
		
}

	}


