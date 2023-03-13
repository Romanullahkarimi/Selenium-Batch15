package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

//        create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
//        goto amazon.com
        driver.get("https://www.facebook.com/");
        WebElement createNewButton = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewButton.click();
        Thread.sleep(2000);
        WebElement firstName=driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("romanullah");


    }
}
