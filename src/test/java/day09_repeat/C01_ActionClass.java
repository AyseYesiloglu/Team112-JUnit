package day09_repeat;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C01_ActionClass extends TestBase {

    @Test
    public void test01(){

        //1- Let's create a new class: MouseActions1
        //2- Go to https://the-internet.herokuapp.com/context_menu
        driver.get("https://the-internet.herokuapp.com/context_menu");

        //3- Right click on the drawn area
        Actions action=new Actions(driver);
        WebElement rightClickArea=driver.findElement(By.xpath("//div[@id='hot-spot']"));
        action.contextClick(rightClickArea).perform();

        //4- Test that the text in Alert is “You selected a context menu”.
        String expectedAlertText="You selected a context menu";
        String actualAlertText=driver.switchTo().alert().getText();
        Assert.assertEquals(expectedAlertText,actualAlertText);

        //5- Let's close the alert by saying OK
        driver.switchTo().alert().accept();

        //---Başka sayfaya gideceği için WindowHandleValue 'ü alayım
        String firstPageWHV= driver.getWindowHandle();
        //6- Click on Elemental Selenium link
        WebElement elementalSeleniumLink=driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));
        elementalSeleniumLink.click();

        //7- Let's test that "Elemental Selenium" is written in the h1 tag on the page that opens.
        WebElement testText=driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));
        String expectedText="Elemental Selenium";
        Assert.assertEquals(testText.getText(),expectedText);


    }
}
