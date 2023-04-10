package comorangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OrangeHrmLiveChromeBrowser {
    public static void main(String[] args) {
        //String Variable called baseUrl
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        //Creating instance of the Class and assigns to driver variable to launch Chrome browser
        WebDriver driver = new ChromeDriver();
        // Open URL using get method
        driver.get(baseUrl);
        // When browser opens and ensure it will fit the screen maximise
        driver.manage().window().maximize();
        // Get the Title of the page
        String title = driver.getTitle();
        //Print title
        System.out.println(title);
        //Giving command to driver to wait till page is loaded
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //To open current URL
        driver.getCurrentUrl();
        //Print Current URL
        System.out.println(" Current URL :" + driver.getCurrentUrl());
        //Print page source
        System.out.println(" Page Source :" + driver.getPageSource());
        //Locating Username clicking it and inputting email address
        driver.findElement(By.name("username")).sendKeys("Abc@Gmail.com");
        //Locating Password clicking it and inputting Password
        driver.findElement(By.name("password")).sendKeys("A1B2c3");
        //closing browser
        //driver.close();
    }
}

