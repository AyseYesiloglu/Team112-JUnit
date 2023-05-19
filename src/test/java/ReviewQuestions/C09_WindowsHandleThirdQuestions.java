package ReviewQuestions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.Set;

public class C09_WindowsHandleThirdQuestions extends TestBase {

    @Test
    public void test01(){

        // go to the "https://the-internet.herokuapp.com/iframe"
        driver.get("https://the-internet.herokuapp.com/iframe");

        // click on selenium link
        String theInternetWindowHandleValue= driver.getWindowHandle();
        WebElement seleniumLink=driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));
        seleniumLink.click();

        // when you clicked test that the new tabs title has Elemental Selenium
        String expectedTitleText="Elemental Selenium";
        String actualTitleText=driver.getTitle();
        //Assert.assertTrue(actualTitleText.contains(expectedTitleText));

        String secondWindowHandleValue= driver.getWindowHandle();



        // we can not get second tab's unique handle value without visiting there
        // driver.getWindowHandles() this method will bring all tab's unique handle values.
        // Our drive is still in the first tab so we can reach first tab's unique handle value.
        // by comparing these handle values I can reach the different handle value and it will be second tab's handle value
        // to take my driver to second tab
        // test the text "Elemental Selenium"

        Set<String>handleValues=driver.getWindowHandles();
        System.out.println(handleValues);
       String expectedTitle="Selenium";
       String actualTitle=driver.getTitle();
        System.out.println(actualTitle);

       //Assert.assertTrue(actualTitle.contains(expectedTitle));





    }

}
