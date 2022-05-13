package class02;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing2 {
    @BeforeSuite
    public void beforeSuite2() {
        System.out.println("i am another before suite method");
    }

    @BeforeTest
    public void beforeTest2() {
        System.out.println("i am before test in another class");
    }

    @Test
    public void testb() {
        System.out.println("Hey1234 beautiful people");
    }

    @Test
    public void testa() {
        System.out.println("Hello5678 best batch ever");
    }
}
