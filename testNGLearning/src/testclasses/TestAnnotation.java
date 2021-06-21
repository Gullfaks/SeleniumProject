package testclasses;

import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestAnnotation {

    @Test
    public void atestMethod2() { //Will run this as first tet as a overrun 1
        System.out.println("Running --> testMethod2");

    }

    @Test
    public void testMethod3() {
        System.out.println("Running --> testMethod3");

    }

    @Test
    public void testMethod1() {
        SomeClassToTest obj = new SomeClassToTest();
        int result = obj.sumNumbers(1,2);
        System.out.println("Running --> testMethod1");

    }
}
