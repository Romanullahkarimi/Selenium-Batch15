package homework.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class task1 {
    public static void main(String[] args) {

      //  1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/dynamic_loading/1
       // 2.Click on the "Start" button to initiate the loading of a hidden element
       //3.Without using Thread.sleep(), write a code that waits for the hidden element to appear using Implicit Wait
        //4.Click the "Finish" button to reveal the hidden element
        //5.Verify that the text "Hello World!" is now displayed on the page (edited)



        System.setProperty("webdriver.chrome.driver",  "Driver/chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
      WebElement button= driver.findElement(By.xpath("//button"));
      button.click();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.findElement(By.xpath("//div[@id='finish']")).click();
      WebElement text = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        System.out.println(text.isDisplayed());
        System.out.println(" the displayed text is : "+text.getText());


    }
}
