package class04.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class task2 {
    public static void main(String[] args) throws InterruptedException {
   /*     Hw2:
goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
        1. u need to write down the code that can select  1 check box out of 4 mentioned,
                e.g option1 , option2 , option 3, option 4
        Note write down the logic in dynamic way i.e one change in if else condition can change ur selection

    }*/
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver Driver=new ChromeDriver();
        Driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        Driver.manage().window().fullscreen();
       List<WebElement>check= Driver.findElements(By.cssSelector("input[class='cb1-element']"));
        for (Iterator<WebElement> name = check.iterator(); name.hasNext(); ) {
            WebElement s = name.next();
            String option = s.getAttribute("value");
            if (option.equalsIgnoreCase("Option-3")) ;
            s.click();
         //   Thread.sleep(3000);
          //  Driver.quit();
        }
    }
}