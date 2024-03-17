package sda.tests.homeWork.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sda.utility.TestBase;

public class Task02 extends TestBase {
    @Test
    public void test01(){
        driver.get("https://crossbrowsertesting.github.io/todo-app.html");
        WebElement four =driver.findElement(By.xpath("//input[@name=\"todo-4\"]"));
        WebElement five =driver.findElement(By.xpath("//input[@name=\"todo-5\"]"));
        four.click();
        five.click();

        Assert.assertEquals(driver.findElements(By.xpath("//span[@class=\"done-true\"]")).size(), 2);

        String asd = "sdfg";
        driver.findElement(By.id("todotext")).sendKeys(asd+ Keys.ENTER);
        Assert.assertFalse(driver.findElements(By.xpath("//*[contains(text(),'" + asd + "')]")).isEmpty());
        driver.findElement(By.xpath("//a[contains(text(),'archive')]")).click();
        Assert.assertEquals(driver.findElements(By.xpath("//span[@class=\"done-true\"]")).size(), 0);


    }
}
