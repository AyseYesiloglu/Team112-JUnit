package SeleniumPractice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_AutomationExercisesWebSite extends TestBase {

    @Test
    public void logInFunctionality(){

    //Test Case 1: Verify the Login Functionality
        //1- Launch the website https://automationexercise.com/
        driver.get("https://automationexercise.com/");

        //2- Click on the "Login" button on the top right corner of the page
        WebElement logInButtonMainPage=driver.findElement(By.xpath("//a[@href='/login']"));
        logInButtonMainPage.click();

        //3- Enter a valid email address and password in the respective fields
        WebElement userNameTextBox=driver.findElement(By.xpath("//input[@name='name']"));
        userNameTextBox.sendKeys("ayesiloglu@gmail.com");

        WebElement userPasswordTextBox=driver.findElement(By.xpath("//input[@name='email']"));
        userPasswordTextBox.sendKeys("asfdl*-34");

        //4- Click on the "Sign in" button
        WebElement signInButton=driver.findElement(By.xpath("//button[text()='Signup']"));
        signInButton.click();

        //5- Verify that the user is logged in by checking if the "My account" page is displayed
        //6- Logout of the website

        WebElement logoutButton = driver.findElement(By.xpath("//a[normalize-space()='Logout']")) ;
        Assert.assertTrue("Log out Button is not Displayed",logoutButton.isDisplayed());
        driver.quit();

    }
    @Test
    public void logInCorrectEmailAndPassword(){

        // 1- Launch the website https://automationexercise.com/
        driver.get("https://automationexercise.com/");

        // 2. Verify that home page is visible successfully
        String titleoFWebsite = driver.getTitle() ;
        Assert.assertEquals("Automation Exercise",titleoFWebsite);

        // 3. Click on 'Signup / Login' button
        WebElement logInButtonMainPage = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
        logInButtonMainPage.click();

        // 4. Verify 'Login to your account' is visible
        WebElement loginToYourAccountText = driver.findElement(By.xpath("//h2[normalize-space()='Login to your account']"));
        Assert.assertTrue("Login To Your Account Header Text Is not Displayed",loginToYourAccountText.isDisplayed());

        // 5. Enter incorrect email address and password
        WebElement usernameTextBox = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        usernameTextBox.sendKeys("mhmetiszgn@gmail.com");
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordTextBox.sendKeys("ervanaz20");

        // 6. Click 'login' button
        WebElement userLoginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        userLoginButton.click();

        // 7. Verify error 'Your email or password is incorrect!' is visible
        WebElement emailAndPasswordWarningMessage =
                driver.findElement(By.xpath("//p[normalize-space()='Your email or password is incorrect!']"));

        Assert.assertTrue("The Warning Message is not Visible",emailAndPasswordWarningMessage.isDisplayed());



    }
}
