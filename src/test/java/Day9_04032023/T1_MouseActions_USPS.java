package Day9_04032023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class T1_MouseActions_USPS {
    public static void main(String[] args) throws InterruptedException {
        //define the webdriver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();
        //initialize chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        //navigate to usps
        driver.navigate().to("https://www.usps.com");
        //wait 2 seconds
        Thread.sleep(2000);
        //hover over send tab
        //store the send tab element into a WebElement variable
        WebElement sendTab = driver.findElement(By.xpath("//*[@id = 'mail-ship-width']"));
        //declare mouse actions
        Actions mouseActions = new Actions(driver);
        //move to the desired element (send tab)
        mouseActions.moveToElement(sendTab).perform();
        //wait 2 seconds
        Thread.sleep(2000);
        //define calculate a price element
        WebElement calcPrice = driver.findElement(By.xpath("//*[@class= 'tool-calc']"));
        //move to calculate a price button and click on it
        mouseActions.moveToElement(calcPrice).click().perform();
        //wait 2 seconds
        Thread.sleep(2000);
        //define usps home variable
        WebElement uspsHome = driver.findElement(By.xpath("//*[@class = 'logo-usps']"));
        //right click on usps home logo
        mouseActions.moveToElement(uspsHome).contextClick().perform();
        //wait 2 seconds
        Thread.sleep(2000);
        //double click on the usps home logo
        mouseActions.moveToElement(uspsHome).doubleClick().perform();
        //wait 2 seconds
        Thread.sleep(2000);
        //quit the driver
        driver.quit();
    }//end of main
}//end of class

