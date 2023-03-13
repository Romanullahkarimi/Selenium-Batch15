package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class task {
    public static void main(String[] args) throws InterruptedException {
       /* HW
        use xpath to complete this
        enter the message in the text box
        click on show message
        Enter value of a
        Enter value of B
        click on the button get total
        also please print the value of the attribute type of the button GET TOTAL*/
        System.setProperty("webdriver.chrome.driver",  "Driver/chromedriver.exe ");
        WebDriver Driver=new ChromeDriver();
        Driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        Driver.manage().window().fullscreen();
        Thread.sleep(4000);
      WebElement text=  Driver.findElement(By.xpath("//input[@id='user-message']"));
      text.sendKeys("Asalaam alikum Moazzam  can  you teach in lower pace please ");;
      WebElement button=  Driver.findElement(By.xpath("//button[@onclick='showInput();']"));
      button.click();
      WebElement valueA=Driver.findElement(By.xpath("//input[@id='sum1']"));
      valueA.sendKeys("250");
      WebElement valueB=Driver.findElement(By.xpath("//input[@id='sum2']"));
      valueB.sendKeys("250");
     WebElement clickButton= Driver.findElement(By.xpath("//button[text()='Get Total']")) ;
clickButton.click();

}

    }



