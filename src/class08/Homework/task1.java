package class08.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) {
       /* please do this HW
        it is needed to be done before class on saturday
                i request everyone to Attempt it as this will help u alot in working with tables and calenders.
        1.goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
        username=Admin
        password=Hum@nhrm123
        2. click on PIM option
        3. from the table select Any  value of id and click the check box associated with it
        make sure that ur code is dynamic i.e
        changing the id doesnt effect the logic or xpath*/

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
      //  driver.manage().window().maximize();
//        goto syntax projects.com
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

        driver.findElement(By.xpath("//b[text()='PIM']")).click();


    }
}
