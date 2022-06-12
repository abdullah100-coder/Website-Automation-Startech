package startech;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Startech {
public static void main(String[]args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver",
"C:\\Users\\abdul\\Desktop\\STQA Lab\\selenium_demo\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();


driver.get("https://www.startech.com.bd/");
System.setProperty("webdriver.chrome.driver", "//chrome path in system//");

driver.manage().window().maximize();

//processor
Thread.sleep(500);

driver.findElement(By.name("search")).sendKeys("AMD Ryzen 7 5700X Processor");
Thread.sleep(500);
driver.findElement(By.tagName("button")).click();
Thread.sleep(500);
driver.findElement(By.linkText("AMD Ryzen 7 5700X Processor")).click();
Thread.sleep(500);
((JavascriptExecutor)driver).executeScript(
    "arguments[0].click();", driver.findElement(By.id("button-cart")));
//driver.findElement(By.id("button-cart")).click();
Thread.sleep(200);
driver.findElement(By.linkText("View Cart")).click();
Thread.sleep(500);

//motherboard
WebElement ele = driver.findElement(By.linkText("Component"));
Actions action = new Actions(driver);
action.moveToElement(ele).perform();
Thread.sleep(300);
WebElement ele1 = driver.findElement(By.linkText("Motherboard"));
action.moveToElement(ele1).perform();
Thread.sleep(300);
WebElement ele2 = driver.findElement(By.linkText("ASRock (RYZEN)"));
action.moveToElement(ele2).perform();
driver.findElement(By.linkText("ASRock (RYZEN)")).click();
Thread.sleep(300);
driver.findElement(By.linkText("ASRock B550M-HDV DDR4 AMD Motherboard")).click();
Thread.sleep(200);
((JavascriptExecutor)driver).executeScript(
    "arguments[0].click();", driver.findElement(By.id("button-cart")));
//driver.findElement(By.id("button-cart")).click();
Thread.sleep(200);
driver.findElement(By.linkText("View Cart")).click();
Thread.sleep(500);


//Casing
WebElement ele12 = driver.findElement(By.linkText("Component"));
action.moveToElement(ele12).perform();
Thread.sleep(300);
WebElement ele13 = driver.findElement(By.linkText("Casing"));
action.moveToElement(ele13).perform();
Thread.sleep(300);
WebElement ele14 = driver.findElement(By.linkText("Corsair"));
action.moveToElement(ele14).perform();
driver.findElement(By.linkText("Corsair")).click();
Thread.sleep(300);
driver.findElement(By.linkText("Corsair Carbide Series Spec-01 Mid Tower ATX Gaming Casing")).click();

((JavascriptExecutor)driver).executeScript(
    "arguments[0].click();", driver.findElement(By.id("button-cart")));

Thread.sleep(200);
driver.findElement(By.linkText("View Cart")).click();
Thread.sleep(200);


//RAM (Desktop)
WebElement ele6 = driver.findElement(By.linkText("Component"));
action.moveToElement(ele6).perform();
Thread.sleep(300);
WebElement ele7 = driver.findElement(By.linkText("RAM (Desktop)"));
action.moveToElement(ele7).perform();
Thread.sleep(300);
WebElement ele8 = driver.findElement(By.linkText("Corsair"));
action.moveToElement(ele8).perform();
((JavascriptExecutor)driver).executeScript(
    "arguments[0].click();", driver.findElement(By.linkText("G.Skill")));
Thread.sleep(300);
driver.findElement(By.linkText("G.Skill Ripjaws V 4GB DDR4 2666MHz Red Heatsink Desktop RAM")).click();
((JavascriptExecutor)driver).executeScript(
    "arguments[0].click();", driver.findElement(By.id("button-cart")));

Thread.sleep(200);
driver.findElement(By.linkText("View Cart")).click();
Thread.sleep(200);


//Graphic 
WebElement ele3 = driver.findElement(By.linkText("Component"));
action.moveToElement(ele3).perform();
Thread.sleep(300);
WebElement ele4 = driver.findElement(By.linkText("Graphics Card"));
action.moveToElement(ele4).perform();
Thread.sleep(300);
WebElement ele5 = driver.findElement(By.linkText("ASRock"));
action.moveToElement(ele5).perform();
driver.findElement(By.linkText("MSI")).click();

driver.findElement(By.linkText("MSI GeForce GTX 1660 Ti VENTUS XS 6G OC Graphics Card")).click();
((JavascriptExecutor)driver).executeScript(
    "arguments[0].click();", driver.findElement(By.id("button-cart")));

Thread.sleep(200);
driver.findElement(By.linkText("View Cart")).click();
Thread.sleep(200);




//SSD
WebElement ele9 = driver.findElement(By.linkText("Component"));
action.moveToElement(ele9).perform();
Thread.sleep(300);
WebElement ele10 = driver.findElement(By.linkText("SSD"));
action.moveToElement(ele10).perform();
Thread.sleep(300);
WebElement ele11 = driver.findElement(By.linkText("Samsung"));
action.moveToElement(ele11).perform();
driver.findElement(By.linkText("Samsung")).click();
Thread.sleep(300);
driver.findElement(By.linkText("Samsung 970 EVO Plus 500GB NVMe M.2 SSD")).click();

((JavascriptExecutor)driver).executeScript(
    "arguments[0].click();", driver.findElement(By.id("button-cart")));

Thread.sleep(200);
driver.findElement(By.linkText("View Cart")).click();
Thread.sleep(200);


String total;
total = driver.findElement(By.id("sum")).getText();
System.out.println("Total Price of the PC = "+total+"tk");
    


}
}