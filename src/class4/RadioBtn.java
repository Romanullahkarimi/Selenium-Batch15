package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

//        create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
//        goto amazon.com
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        WebElement maleBtn = driver.findElement(By.cssSelector("input[value='Male']"));
        maleBtn.click();
        boolean isEnabledMale=maleBtn.isEnabled();
        System.out.println("the radio button male is enabled "+isEnabledMale);
        boolean is =maleBtn.isDisplayed();
        System.out.println("the male button is displayed "+is);
        boolean isSlectedMale=maleBtn.isSelected();
        System.out.println("the male button is selected "+isSlectedMale);
        if(!is){
            maleBtn.click();
        }
        is=maleBtn.isSelected();
        System.out.println("the status of selection is "+is);

    }
}
