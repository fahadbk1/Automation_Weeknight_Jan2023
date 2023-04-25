package Day4_10242022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_WebDriver_Google {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //define the webdriver
        WebDriver driver = new ChromeDriver();
        //go to google page
        driver.navigate().to("https://www.google.com");
        //wait three seconds
        Thread.sleep(3000);
        //quit the driver
        driver.quit();
    }//end of main
}//end of class

