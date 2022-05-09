package class01;

import org.testng.annotations.Test;

public class DependsOn {
    @Test
    public void login() {
        System.out.println("This is login");//it passes
        //System.out.println(10 / 0);it fails and skips verificationOfDashboard
    }

    @Test(dependsOnMethods = "login")//it skips this testcase if login fails
    public void verificationOfDashboard() {
        System.out.println("This is dashboard");
    }
}
