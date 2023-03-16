package class06.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {
    public static void main(String[] args) {
     /*   HW2
        1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/iframe
        2.Switch to the iframe on the page
        3.Clear the existing text in the  editor inside the iframe
        4.Enter the text "Hello World!" in the editor inside the iframe
        5.Switch back to the main page*/

        System.setProperty("webdriver.chrome.driver",  "Driver/chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
       driver.switchTo().frame("mce_0_ifr");
       WebElement ClearText = driver.findElement(By.xpath("//body[@id='tinymce']"));
       ClearText.click();
       ClearText.clear();
        ClearText.sendKeys("Hello world!");
        System.out.println(ClearText.getText());
        driver.switchTo().defaultContent();


    }
}
