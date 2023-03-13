package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrderTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",  "Driver/chromedriver.exe ");
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        webDriver.manage().window().fullscreen();
        webDriver.findElement(By.id("ctl00$MainContent$username")).sendKeys("Tester");
        webDriver.findElement(By.id("ctl00$MainContent$password")).sendKeys("test");
        webDriver.findElement(By.className("button")).click();

    }
}
