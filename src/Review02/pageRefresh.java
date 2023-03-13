package Review02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageRefresh {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",  "Driver/chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("ttps://www.facebook.com/");
        driver.navigate().refresh();
    }
}
