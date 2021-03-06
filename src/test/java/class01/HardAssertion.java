package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssertion {
    //go to syntax login
    //enter wrong credentials
    //verify the message is "invalid credentials"
    WebDriver driver;

    @BeforeMethod
    public void OpenBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    }

    @Test
    public void verifyCredentials() {
        String expectedText = "Invalid credentials 123";//so the test fails
        WebElement userName = driver.findElement(By.id("txtUsername"));
        boolean displayed = userName.isDisplayed();
        userName.sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("123456");
        driver.findElement(By.id("btnLogin")).click();
        String text = driver.findElement(By.id("spanMessage")).getText();
        //first assertion compare the two strings2
        Assert.assertEquals(text, expectedText);//comes from testNG
        //assert if username text box is displayed
        //assertion if it is actually displayed or not
        System.out.println("Hello World");
        Assert.assertTrue(displayed);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

}
