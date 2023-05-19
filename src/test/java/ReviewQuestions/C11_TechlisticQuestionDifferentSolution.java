package ReviewQuestions;

import com.github.javafaker.Faker;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C11_TechlisticQuestionDifferentSolution extends TestBase {
    @Test
    public void test01(){

        //go to https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        WebElement nameBox= driver.findElement(By.xpath("//input[@name='firstname']"));
        Actions action=new Actions(driver);
        Faker faker=new Faker();
        action.sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB).sendKeys(Keys.ARROW_RIGHT);
        WebElement gender=driver.findElement(By.xpath(""));


        //Fill the first name
        //Fill the surname
        //choose gender
        //choose the experience
        //fill the date
        //Choose your professions-->Automation Tester
        //Choose your tool-->Selenium Webdriver
        //Choose your continent-->Europe
        //Choose your command-->Browser Command
        //Click submit button
    }

}
