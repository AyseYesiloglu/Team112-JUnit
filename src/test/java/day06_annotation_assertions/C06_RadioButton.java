package day06_annotation_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_RadioButton {
    //Create the required structure and complete the following task.
    // a. Go to the given web page.
    //      https://facebook.com
    // b. Accept cookies
    // c. Press the Create an account button
    // D. Locate the radio button elements and choose the one that suits you
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown(){
        driver.close();
    }

    // a. Go to the given web page.
    //      https://facebook.com
    @Test
    public void test01(){
        driver.get("https://facebook.com");

    }

    // c. Press the Create an account button
    @Test
    public void test02(){

        WebElement pressButton= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        pressButton.click();
    }

    // D. Locate the radio button elements and choose the one that suits you
    @Test
    public void test03(){
        WebElement radioButton= driver.findElement(By.xpath("//input[@type='radio'][1]"));
        radioButton.click();

    }



}
