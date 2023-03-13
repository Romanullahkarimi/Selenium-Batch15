package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 1. launch the browser
         * 2. navigate to amazon web site
         * 3. print out the title and the url in the console
         * 4. close the browser
         */
        System.setProperty("webdriver.chrome.driver",  "Driver/chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.navigate().to("https://www.amazon.com/");
        String title=driver.getTitle();
        System.out.println(title);
        String URl=driver.getCurrentUrl();
        System.out.println(URl);
        driver.close();

    }
}
