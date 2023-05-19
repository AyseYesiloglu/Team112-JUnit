package day10_Waits_File_repeat;

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
import utilities.ReusableMethods;

import java.time.Duration;

public class C01_ExplicitlyWaitQuestion {

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }
    @After
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void isEnabledTest(){

        //1. Bir class olusturun : EnableTest
        //2. Bir metod olusturun : isEnabled()
        //3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        //4. Textbox’in etkin olmadigini(enabled) dogrulayın 5. Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
        //6. “It’s enabled!” mesajinin goruntulendigini dogrulayın.
        //7. Textbox’in etkin oldugunu(enabled) dogrulayın.

        //1. Bir class olusturun : EnableTest
        //2. Bir metod olusturun : isEnabled()
        //3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        //4. Textbox’in etkin olmadigini(enabled) dogrulayın
        WebElement textBox= driver.findElement(By.xpath("//input[@type='text']"));
        Assert.assertFalse(textBox.isEnabled());

        //5. Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
        driver.findElement(By.xpath("//button[@type='button'][1]")).click();
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='button'][1]")));

        //6. “It’s enabled!” mesajinin goruntulendigini dogrulayın.
        WebElement itsEnableText=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        Assert.assertTrue(itsEnableText.isDisplayed());
        ReusableMethods.waitFor(2);

        //7. Textbox’in etkin oldugunu(enabled) dogrulayın.
        Assert.assertTrue(textBox.isDisplayed());

    }
}
