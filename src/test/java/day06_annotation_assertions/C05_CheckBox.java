package day06_annotation_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_CheckBox {
    //Create the required structure and complete the following task.
    // a. Go to the given web page.
    //      https://the-internet.herokuapp.com/checkboxes
    // b. Locate the checkbox1 and checkbox2 elements.
    // c. Click the checkbox if Checkbox1 is not selected
    // D. Click the checkbox if Checkbox2 is not selected
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
    //      https://the-internet.herokuapp.com/checkboxes
    @Test
    public void test01(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    // b. Locate the checkbox1 and checkbox2 elements.
    @Test
    public void test02(){

        WebElement chechBox1= driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement chechBox2= driver.findElement(By.xpath("//input[@type='checkbox'][2]"));

    }

    // c. Click the checkbox if Checkbox1 is not selected
    @Test
    public void test03(){

    }

    // D. Click the checkbox if Checkbox2 is not selected
    @Test
    public void test04(){

    }
}
