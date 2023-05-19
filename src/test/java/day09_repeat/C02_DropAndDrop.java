package day09_repeat;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02_DropAndDrop extends TestBase {

    @Test
    public void test01(){

        //Let's create a new class: MouseActions2
        //1- Let's go to https://demoqa.com/droppable
        //2- Let's hold the "Drag me" button and drop it above the "Drop here" box
        //3-  Test that,Instead of “Drop here” text “Dropped!” text is there



        //1- Let's go to https://demoqa.com/droppable
        driver.get("https://demoqa.com/droppable");

        //2- Let's hold the "Drag me" button and drop it above the "Drop here" box
        Actions actions=new Actions(driver);
        WebElement dragElement=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dropElement=driver.findElement(By.xpath("//div[@id='droppable'][1]"));
        actions.dragAndDrop(dragElement,dropElement).perform();

        //3-  Test that,Instead of “Drop here” text “Dropped!” text is there
        WebElement droppedText=driver.findElement(By.xpath("//p[text()='Dropped!']"));
        Assert.assertTrue(droppedText.isDisplayed());

    }
}
