package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class practice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

     List<WebElement>rows= (List<WebElement>) driver.findElement(By.xpath("//table[@id='customers']/tbody/tr/td"));

     for (WebElement element:rows){
         String row=element.getText();
         System.out.println(row);

     }
     WebElement element= driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]"));
     element.click();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(element.getText());


    }
}
