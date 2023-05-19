package day09_actions_faker;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_iframeQuestions extends TestBase {
@Test
    public void test01(){

    //    // go to the https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe
    //    // locate "The iframe element" texted element
    //    // then print the text of this element

    driver.get("go to the https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");

    WebElement text=driver.findElement(By.xpath("//h1[text()='The iframe element']"));

    System.out.println(text.getText());

}



}
