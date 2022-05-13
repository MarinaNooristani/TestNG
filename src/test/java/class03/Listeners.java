package class03;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("The test case that failed is : "+result.getName());
    }
    //now we need a connection between LoginTest class and Listener class
    //in testNG through xml we can make this connection so that it listens to that particular testcase
    @Override
    public  void onTestSuccess(ITestResult result){
        System.out.println("The test case that passed is : "+result.getName());
    }
}
