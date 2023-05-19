package day07_dropDown_jsAlerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_JSAlerts {
    //https://the-internet.herokuapp.com/javascript_alerts

    WebDriver driver;
    @Before
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }
    @Test
    public void test01(){

        //   // set required options
        //    // go to the https://the-internet.herokuapp.com/javascript_alerts

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement jsFirstButton=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        jsFirstButton.click();

        // create 3 different methods to click jsAlerts

        String actualTextOfJsAlert=driver.switchTo().alert().getText();
        String expectedTaxtOfJsAlert="I am a JS Alert";

        Assert.assertEquals(actualTextOfJsAlert,expectedTaxtOfJsAlert);

        driver.switchTo().alert().accept();
        // handle them


    }@Test
    public void test02(){
        // test that after clicking jsConfirmButton and accepting it
        // result text will be "You clicked: Ok
        // test that after clicking jsConfirmButton and canceling it
        // result text will be "You clicked: Calcel
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement jsConfirmButton = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        jsConfirmButton.click();
        driver.switchTo().alert().accept();
        WebElement resultText = driver.findElement(By.id("result"));
        String actualText = resultText.getText();
        String expectedText = "You clicked: Ok";
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void test03(){

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement jsPromptButton=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        jsPromptButton.click();
        driver.switchTo().alert().accept();
        String expectedText="You entered:";
        String actualResultText=driver.findElement(By.id("result")).getText();

        Assert.assertEquals(expectedText,actualResultText);

        /*
        js Alerts Methodları:
        1) driver.switchTo().alert().accept();-->alert üzerindeki OK butonunu kabul etmek için
        2) driver.switchTo().alert().dismiss();-->alert üzerindeki butonu kabul etmemek için
        3) driver.switchTo().alert().getText();-->alert yazısı üzerindeki text'i almak için
        4) driver.switchTo().alert().senKeys("...yazmak istediğimiz....");--->alert üzerindeki text kutusuna yazmak için
         */

    }

}
