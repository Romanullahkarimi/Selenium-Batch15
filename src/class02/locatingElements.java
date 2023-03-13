package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",  "Driver/chromedriver.exe ");
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("https://www.facebook.com/");
//send the user name
        webDriver.findElement(By.id("email")).sendKeys("romanullahhamdard@gmail.com");
        webDriver.findElement(By.id("pass")).sendKeys("12344");
        webDriver.findElement(By.linkText("Create new account")).click();
        //click on forgot passowrk
        webDriver.findElement(By.partialLinkText("Forgot password?")).click();
        webDriver.quit();
    }
}
