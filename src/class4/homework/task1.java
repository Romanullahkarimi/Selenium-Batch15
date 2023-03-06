package class4.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) throws InterruptedException {
     /*   HW1:
goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
        check if the check box    "click on this check box" is Selected
        if no  Select the check box
        check gain if the checkbox is Selected or not*/
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver Driver=new ChromeDriver();
        Driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        Driver.manage().window().fullscreen();
        WebElement button=Driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        boolean checkBox=button.isSelected();
        System.out.println("is check box is selected"+checkBox);
        if (!checkBox){
            button.click();
        }
        checkBox=button.isSelected();
        Thread.sleep(3000);
        Driver.quit();

        System.out.println("the  checkBox is selected"+checkBox);




    }}

