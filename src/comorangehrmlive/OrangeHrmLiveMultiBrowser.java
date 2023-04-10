package comorangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class OrangeHrmLiveMultiBrowser {
    //Declaring Global Variable
    static String browser = "Edge";
    static WebDriver driver;
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    public static void main(String[] args) {
        //Declaring if else method
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Browser name");
        }
        //When browser opens and ensure it will fit the screen maximise
        driver.manage().window().maximize();
        // Open URL using get method
        driver.get(baseUrl);
        //Printing Title of the page
        System.out.println(driver.getTitle());
        //Print Current URL
        System.out.println(" Current URL :" + driver.getCurrentUrl());
        //Print page source
        System.out.println(" Page Source :" + driver.getPageSource());
        //Giving command to driver to wait till page is loaded
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Locating Username clicking it and inputting email address
        driver.findElement(By.name("username")).sendKeys("Abc@Gmail.com");
        //Locating Password clicking it and inputting Password
        driver.findElement(By.name("password")).sendKeys("A1B2c3");
        //Closing driver
        //driver.close();
    }
}


