import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Gecko {
    public void geckodriver(){
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //launch the url
        driver.get(baseUrl);
        driver.manage().window().maximize();
        //time limit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Print the title of the page
        String title = driver.getTitle();
        System.out.println("This is tital of page==> "+title);
        //Print the current url
        String currenturl = driver.getCurrentUrl();
        System.out.println("This is currentUrl of page==> "+currenturl);
        //Print the page source
        String pagesource = driver.getPageSource();
        System.out.println(pagesource);
        //Enter the email to email field
        WebElement emailfield = driver.findElement(By.id("txtUsername"));
        emailfield.sendKeys("primetesting@123");
        //Enter the password to password fiel
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("123456");

        // Close the browser
          driver.close();
    }


    public static void main(String[] args) {
        Gecko firefox = new Gecko();
        firefox.geckodriver();
    }
}




