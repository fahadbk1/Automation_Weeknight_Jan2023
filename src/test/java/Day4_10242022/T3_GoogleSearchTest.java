package Day4_10242022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearchTest {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //define the webdriver
        WebDriver driver = new ChromeDriver();
        //go to google page
        driver.navigate().to("https://www.google.com");
        //wait 2 seconds
        Thread.sleep(2000);
        //maximize the driver
        driver.manage().window().maximize();
        //locate element for search field and type cars
        //this is an example of relative xpath
        driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys("cars");
        //this is an example of absolute xpath
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("cars");
        //submit on google search button
        driver.findElement(By.xpath("//*[@name ='btnK']")).submit();
        //capture the search result and print it
        String searchResult = driver.findElement(By.xpath("//*[@id = 'result-stats']")).getText();
        System.out.println("Result search text is " + searchResult);
        //split the original text
        String[] searchResultArray = searchResult.split(" ");
        //print out just the number from the search results
        System.out.println("Result Search Number Is " + searchResultArray[1]);
        //quit driver
        driver.quit();
    }//end of main
}//end of class
