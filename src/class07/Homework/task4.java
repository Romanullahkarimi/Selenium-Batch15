package class07.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class task4 {
    public static void main(String[] args) {
       /* For homework
        You have to do all explicit wait examples from.the link I used in class .
        For the alert example
*/
        System.setProperty("webdriver.chrome.driver",  "Driver/chromedriver.exe ");
        WebDriver driver=new ChromeDriver();

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
      driver.findElement(By.xpath("//button[@id='checkbox']")).click();
      WebDriverWait wait=new WebDriverWait(driver,15);

      WebElement btn=driver.findElement(By.xpath("//input[@type='checkbox']"));
      wait.until(ExpectedConditions.elementToBeClickable(btn));
        System.out.println(btn.isEnabled());










    }
}
