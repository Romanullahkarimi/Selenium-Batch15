package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
     /*   navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
        close the pop up
        close the browser
        TIP for HW2:
        just fill in text boxes or button, no need to deal with other webElements
        also u will need a Thread.sleep after clcikng on create new account 🙂
        we will discuss "WHY" in future*/
        System.setProperty("webdriver.chrome.driver",  "Driver/chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
       driver.findElement(By.id("email")).sendKeys("romanullahhamdard@gmail.com");
       driver.findElement(By.id("pass")).sendKeys("123445");
       driver.findElement(By.name("submit")).click();
       Thread.sleep(20000);




    }
}
