package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",  "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.amazon.com/amazonprime");
        driver.findElement(By.tagName("a"));
    }
}
