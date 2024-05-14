package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swaglabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64");
WebDriver driver=new ChromeDriver();
driver.get("https://www.saucedemo.com/v1/");
driver.manage().window().maximize();
Thread.sleep(1000);
WebElement element=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
element.sendKeys("standard_user");
Thread.sleep(1000);
WebElement element2=driver.findElement(By.xpath("//*[@id=\"password\"]"));
element2.sendKeys("secret_sauce");
Thread.sleep(1000);
WebElement login=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
login.click();
Thread.sleep(1000);
WebElement backpack=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
backpack.click();
WebElement backpackcart=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button"));
backpackcart.click();
WebElement backpackcartremove=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button"));
backpackcartremove.click();
WebElement backpackcartback=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/button"));
backpackcartback.click();
WebElement bikelight=driver.findElement(By.xpath("//*[@id=\"item_0_img_link\"]/img"));
bikelight.click();
driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/button")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/button")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/button")).click();
driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/button")).click();
driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).click();
driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/button")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[3]/button")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[3]/button")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[3]/button")).click();
//cartbutton
driver.findElement(By.cssSelector("#shopping_cart_container > a > svg")).click();
driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_list > div:nth-child(3) > div.cart_item_label > div.item_pricebar > button")).click();
driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_list > div:nth-child(4) > div.cart_item_label > div.item_pricebar > button")).click();
driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_list > div:nth-child(5) > div.cart_item_label > div.item_pricebar > button")).click();
driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_list > div:nth-child(6) > div.cart_item_label > div.item_pricebar > button")).click();
driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_list > div:nth-child(7) > div.cart_item_label > div.item_pricebar > button")).click();
driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_list > div:nth-child(8) > div.cart_item_label > div.item_pricebar > button")).click();
driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
WebElement element3=driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
element3.sendKeys("diya");
Thread.sleep(1000);
WebElement element4=driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
element4.sendKeys("a");
WebElement element5=driver.findElement(By.xpath("//*[@id=\"postal-code\"]"));
element5.sendKeys("66868");
driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();
driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
	}

}
