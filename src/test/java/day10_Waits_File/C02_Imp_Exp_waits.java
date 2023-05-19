package day10_Waits_File;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C02_Imp_Exp_waits {

    //1. Create a class : WaitTest
    //2. Create two methods: implicitWaitTest() , explicitWaitTest()
    // Test the following steps for both methods.
    //3. Go to https://the-internet.herokuapp.com/dynamic_controls.
    //4. Press the Remove button.
    //5. “It's gone!” Verify that the message is displayed.
    //6. Press the Add button
    //7. Test that it's back message appears
    WebDriver driver;
    @Before
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }
    @After
    public void tearDown(){
        driver.close();
    }
    @Test
    public void implicitWaitTest(){
        // Test the following steps for both methods.
        //3. Go to https://the-internet.herokuapp.com/dynamic_controls.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");


        //4. Press the Remove button.
        WebElement removeButton= driver.findElement(By.xpath("//button[@type='button'][1]"));
        removeButton.click();
        //5. “It's gone!” Verify that the message is displayed.
        WebElement message=driver.findElement(By.xpath("//p[@id='message']"));
        Assert.assertTrue(message.isDisplayed());

        //6. Press the Add button
        WebElement addButton=driver.findElement(By.xpath("//button[text()='Add']"));
        addButton.click();

        //7. Test that it's back message appears
        WebElement message2=driver.findElement(By.xpath("//p[@id='message']"));
        Assert.assertTrue(message2.isDisplayed());

    }
    @Test
    public void explicitWaitTest(){

        //3. Go to https://the-internet.herokuapp.com/dynamic_controls.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        //4. Press the Remove button.
        driver.findElement(By.xpath("//button[@type='button'][1]")).click();

        //5. “It's gone!” Verify that the message is displayed.
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(300));
        //global waiting time den fazla zamana ihtiyaç duyulduğunda
        //mesela bir dosya yüklenecek ve normalden fazla zaman alıyor o zaman  WebDriverWait class'ı kullanılır
        //“It's gone!” yazısının görülebilmesi için önce locate edilmesi gerekir
        // ama bu soruda visibility olması uzun süreceği için wait objesini kullanıyoruz
        WebElement itsGoneElement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        Assert.assertTrue(itsGoneElement.isDisplayed());

        //6. Press the Add button
        WebElement pressButton= driver.findElement(By.xpath("//button[text()='Add']"));
        pressButton.click();

        //7. Test that it's back message appears
        WebElement itsBackElement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        Assert.assertTrue(itsBackElement.isDisplayed());



    }

}
