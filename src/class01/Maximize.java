package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",  "Driver/chromedriver.exe ");
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("http://www.google.com");
        webDriver.manage().window().maximize();
        webDriver.manage().window().fullscreen();
        webDriver.close(); 
    }
}
