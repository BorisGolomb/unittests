package JUnit;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.transform.Result;

import static org.junit.Assert.assertEquals;

public class MultTest2 extends BaseTest {


    @Test
    public void testMultPositiveNumbers() {
        double result = calculator.mult(3, 2);
        Assert.assertEquals(6, result , 0);

    }
}
