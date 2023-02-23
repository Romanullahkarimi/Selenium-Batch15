package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        //tell your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver",  "Driver/chromedriver.exe ");
        WebDriver Driver=new ChromeDriver();
        Driver.get("https://www.facebook.com/");
     String URL=   Driver.getCurrentUrl();
        System.out.println(URL);
        //get the tilte of the webpage
        String title=Driver.getTitle();
        System.out.println("the Title of the page  is "+title);
        //slow down for 3 second
        Thread.sleep(3000);
        Driver.quit();
        }}