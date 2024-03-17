package sda.tests.homeWork.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sda.utility.TestBase;

public class Task01 extends TestBase {
    By emailFiled = By.id("input-email");
    By passwordName = By.id("input-password");
    By loginButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");

    @Test(dataProvider = "searchQueries")
    public void negativeLoginTest(String userName, String password ,String searchQuery)  {
        driver.get("http://opencart.abstracta.us/index.php?route=account/login");

        driver.findElement(emailFiled).sendKeys("clarusway@gmail.com");
        driver.findElement(passwordName).sendKeys("123456789");
        driver.findElement(loginButton).click();

        // Search for the product
        driver.findElement(By.name("search")).sendKeys(searchQuery);
        driver.findElement(By.cssSelector("button[type='button'][class='btn btn-default btn-lg']")).click();

    }

    @DataProvider(name = "successLogin")
    public Object[][] getData(){
        return new Object[][]{
                {"clarusway@gmail.com","123456789"},};}

    @DataProvider(name = "searchQueries")
    public Object[][] searchQueriesProvider() {
        return new Object[][]{
                {"Mac"},
                {"iPad"},
                {"Samsung"}
        };
    }


}
