import com.sun.corba.se.impl.naming.namingutil.INSURLBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {


    public void Chrome() {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //launch the url
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
        WebElement emailfield = driver.findElement(By.id("user[email]"));
        emailfield.sendKeys("primetesting@123");
        //Enter the password to password fiel
        WebElement password = driver.findElement(By.id("user[password]"));
        password.sendKeys("123456");

        // Close the browser
        driver.close();
    }

    public static void main(String[] args) {
        Chrome ch=new Chrome();
        ch.Chrome();
    }

}

