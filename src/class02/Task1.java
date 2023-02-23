package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
   /*     navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser*/
        System.setProperty("webdriver.chrome.driver",  "Driver/chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.name("customer.firstName")).sendKeys("Romanullah");
        driver.findElement(By.name("customer.lastName")).sendKeys("Karimi");
        driver.findElement(By.name("customer.address.street")).sendKeys("150- 77th ave ");
        driver.findElement(By.name("customer.address.city")).sendKeys("Flushing");
        driver.findElement(By.name("customer.address.state")).sendKeys("New york");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("11367");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("3472453194");
        driver.findElement(By.name("customer.ssn")).sendKeys("12345678");
        driver.findElement(By.id("customer.username")).sendKeys("romanullahhamdard@gmail.com");
        driver.findElement(By.id("customer.password")).sendKeys("abc1234");
        driver.findElement(By.id("repeatedPassword")).sendKeys("abc1234");
     //  driver.findElement(By.name("Register")).click();
       driver.findElement(By.className("button")).click();
      //  driver.close();

    }
}
