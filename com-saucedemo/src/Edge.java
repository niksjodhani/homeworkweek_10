import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge  {
    public void msedgedriver(){
        String baseUrl="https://www.saucedemo.com/";
        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        //time limit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //Print the current url
        String currenturl = driver.getCurrentUrl();
        System.out.println(currenturl);
        //Print the page source
        String pagesource = driver.getPageSource();
        System.out.println(pagesource);
        //Enter the email to email field
        WebElement emailfield = driver.findElement(By.id("user-name"));
        emailfield.sendKeys("primetesting@123");
        //Enter the password to password fiel
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123456");

        // Close the browser
          driver.close();
    }

    public static void main(String[] args) {
        Edge edge=new Edge();
        edge.msedgedriver();
    }
}

