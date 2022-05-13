package class02;

import org.testng.annotations.*;

public class Testing {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("I am before suite..");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("I am after suite..");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("I am before test :)");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("I am after test :)");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("this is my before class method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("this is my after class method");
    }


    @BeforeMethod
    public void before() {
        System.out.println("this is my before method");
    }

    @AfterMethod
    public void after() {
        System.out.println("this is my after method");
    }

    @Test
    public void test() {
        System.out.println("Hey beautiful people");
    }

    @Test
    public void test2() {
        System.out.println("Hello best batch ever");
    }


}
