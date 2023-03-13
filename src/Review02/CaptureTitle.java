package Review02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTitle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",  "Driver/chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().to("https://www.facebook.com/");
      String pageTitle=  driver.getTitle();
        System.out.println("the tilte of the page is :"+pageTitle);

    }
}
