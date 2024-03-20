package sda.tests.homeWork.day18.smokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sda.utility.TestBase;

public class NegativeLoginTest extends  TestBase{

    @Test(dataProvider ="invalidCredentials" )
    public void test(String userName, String password ,String expectedErrorMessage) {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.cssSelector("button#submit")).click();
        SoftAssert softAssert = new SoftAssert();

        WebElement actualErrorMessage = driver.findElement(By.cssSelector("div[id='error']"));
        softAssert.assertTrue(actualErrorMessage.isDisplayed());
        softAssert.assertEquals(actualErrorMessage.getText(), expectedErrorMessage);

        softAssert.assertAll();
    }

    @DataProvider(name = "invalidCredentials")
    public Object[][] getData(){
        return new Object[][]{
                {"student","incorrectPassword" ,"Your password is invalid!"},

        };
    }

}
