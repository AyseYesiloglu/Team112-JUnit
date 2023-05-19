package day09_actions_faker;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase;

public class C02_ActionClass extends TestBase  {
    //1- Let's create a new class: MouseActions1
    //2- Go to https://the-internet.herokuapp.com/context_menu
    //3- Right click on the drawn area
    //4- Test that the text in Alert is “You selected a context menu”.
    //5- Let's close the alert by saying OK
    //6- Click on Elemental Selenium link
    //7- Let's test that "Elemental Selenium" is written in the h1 tag on the page that opens.
    @Test
    public void test01(){

        driver.get("https://the-internet.herokuapp.com/context_menu");

        WebElement rightClickArea=driver.findElement(By.xpath("//div[@id='hot-spot']"));

        //to use premade methods from Actions class we need to create an object from it
        Actions actions=new Actions(driver);
        actions.contextClick(rightClickArea).perform();
        ReusableMethods.waitFor(1);

        String actualText=driver.switchTo().alert().getText();
        String expectedAlertText="You selected a context menu";

        Assert.assertEquals(actualText,expectedAlertText);
        ReusableMethods.waitFor(1);




    }

}

