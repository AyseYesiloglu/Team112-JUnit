package ReviewQuestions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class C10_techlistQuestions extends TestBase {

    @Test
    public void test01(){


        //go to https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().deleteAllCookies();
       WebElement cookie1=driver.findElement(By.xpath("//span[@id='ezmob-footer-close']"));
       cookie1.click();
        //Fill the first name
        WebElement nameBox= driver.findElement(By.xpath("//input[@name='firstname']"));
        nameBox.sendKeys("Elcin");

        //Fill the surname
        WebElement surnameBox= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        surnameBox.sendKeys("Kirmizi");

        //choose gender
        WebElement femaleGender=driver.findElement(By.xpath("//input[@id='sex-1']"));
        femaleGender.click();
        femaleGender.sendKeys(Keys.PAGE_DOWN);

        //choose the experience
        driver.findElement(By.xpath("//input[@id='exp-2']")).click();

        //fill the date
        WebElement date= driver.findElement(By.xpath("//input[@id='datepicker']"));
        date.sendKeys("08/05/2023");

        //Choose your professions-->Automation Tester
        WebElement professionsBox=driver.findElement(By.id("profession-1"));
        professionsBox.click();

        //Choose your tool-->Selenium Webdriver
        WebElement tool=driver.findElement(By.xpath("//input[@id='tool-2']"));
        tool.click();

        //Choose your continent-->Europe
        WebElement continentDropDown= driver.findElement(By.xpath("//select[@id='continents']"));
        Select select=new Select(continentDropDown);
        select.selectByVisibleText("Europe");

        //Choose your command-->Browser Command
        WebElement command=driver.findElement(By.xpath("//select[@id='selenium_commands']"));
        Select select1=new Select(command);
        select1.selectByVisibleText("Browser Commands");

        //Click submit button
        WebElement submitButton=driver.findElement(By.xpath("//button[@id='submit']"));
        submitButton.click();



    }
}
