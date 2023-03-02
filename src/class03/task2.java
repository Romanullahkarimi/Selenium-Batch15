package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(" http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.manage().window().maximize();
        WebElement enterMessage = driver.findElement(By.xpath(" //input[contains(@id,'user-message')]"));
        enterMessage.sendKeys("Hi");
        WebElement button = driver.findElement(By.xpath("//button[text()='Show Message']"));
        button.click();
        driver.findElement(By.xpath("//input[contains(@id,'sum1')]")).sendKeys("10");
        driver.findElement(By.xpath("//input[contains(@id,'sum2')]")).sendKeys("20");
        driver.findElement(By.xpath("//button[text()='Get Total']")).click();
        List<WebElement> total = driver.findElements(By.xpath("//button[text()='Get Total']"));
        for (WebElement t : total) {
            String sum = t.getAttribute("type");
            System.out.println(sum);


        /*enter the message in the text box
click on show message
Enter value of a
Enter value of B
click on the button get total
also please print the value of the attribute type of the button GET TOTAL
         */
        }
    }
}

