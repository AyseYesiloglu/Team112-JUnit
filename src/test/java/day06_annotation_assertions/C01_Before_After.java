package day06_annotation_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Before_After {

    //create 3 different test methods
    //create each method create a driver
    //1)go to the https://www.amazon.com
    //2)wisequarter.com
    //3)youtube.com
    //in all method print the title of the website
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
    public void test01Amazon(){

        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());

    }@Test
    public void test02Wiseqarter(){
        driver.get("https://www.wisequarter.com");
        System.out.println(driver.getTitle());
    }
    @Test
    public void test03Youtube(){
        driver.get("https://www.youtube.com");
        System.out.println(driver.getTitle());
    }


}