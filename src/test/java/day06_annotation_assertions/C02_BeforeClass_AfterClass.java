package day06_annotation_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_BeforeClass_AfterClass {
    //create 3 test methods
    //1)go to the amazon.com and test that you are in amazon.com
    //2)search for nutella and test that you have searched for nutella
    //3)test that there are more than 50 results of nutella
    static WebDriver driver;
    //when we use before class or afterclass annotations, we have to make them static (rule of jUnit framework)
    //when we want to use any variable in these static methods

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public static void TearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }

    @Test
    public  void test01Amazon(){
        driver.get("https://www.amazon.com");
        String expectedUrlWord="Amazon";
        String actualUrlWord= driver.getCurrentUrl();
        if (actualUrlWord.contains(expectedUrlWord)){
            System.out.println("Amazon url test is PASSED");
        }else{
            System.out.println("Amazon url test is FAİLED");
        }

    }
    @Test
    public void test02Nutella(){

        WebElement amazonSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
        amazonSearchBox.sendKeys("Nutella"+ Keys.ENTER);
        WebElement resultText = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String expectedText ="Nutella";
        String actualText = resultText.getText();
        if (actualText.contains(expectedText)){
            System.out.println("Result Test PASSED");
        }else {
            System.out.println("Result Test FAILED");
        }
    }
    @Test
    public void test03NumberOfResult(){

        List<WebElement>numberOfNutella=driver.findElements(By.xpath(" //div[@class='a-section a-spacing-small a-spacing-top-small']"));
        int actualNumber=numberOfNutella.size();
        int expectedNumber=37;

        if (actualNumber==expectedNumber){
            System.out.println("Number of nutella product test is PASSED");
        }else {
            System.out.println("Number of nutella product test FAİLED");
        }
    }
}
