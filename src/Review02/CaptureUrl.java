package Review02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureUrl {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",  "Driver/chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        String pageUrl=driver.getCurrentUrl();
        System.out.println("page URL :"+pageUrl);

    }
}
