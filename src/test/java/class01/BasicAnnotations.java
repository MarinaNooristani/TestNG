package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotations {
    //it is executed based on alphabetical order of method name
    @Test//this annotation will allow us to run the method below
    public void cfirstTest() {//execute 3
        System.out.println("This is my first test case");
    }

    @Test
    public void asecondTest() {//execute 1
        System.out.println("This is my second test case");
    }

    @Test
    public void bthirdTest() {//execute 2
        System.out.println("This is my third test case");
    }

    @BeforeMethod
    public void beforeMethod() {//run 3 times before each @Test
        System.out.println("************** I am Pre condition ************");
    }

    @AfterMethod
    public void afterMethod() {//run 3 times after each @Test
        System.out.println("************** I am Post condition ************");
    }

}
