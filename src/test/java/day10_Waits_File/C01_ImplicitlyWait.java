package day10_Waits_File;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_ImplicitlyWait {
    @Test
    public void test01(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //We have set waiting time for each step we use in a Selenium Project
        //At each step, system will wait for at max 15 seconds untill the action is completed
        //If it can find it at third second it complete the task and the system will continue from the next

    }


}
