import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMaxTest {




    @Test
    void FindMaxWithGeneric() {

        FindMax testObject = new FindMax(20,30,60,70,15,5);
        int integerMaximum = (int) testObject.findMaximum();
        Assert.assertEquals(integerMaximum,70);

        FindMax doubleTestObject = new FindMax(12.2678,12.2679,12.2677,12.789,12.2675,12.2673);
        double doubleMaximum = (double) doubleTestObject.findMaximum();
        Assertions.assertEquals(doubleMaximum,12.789);

        FindMax stringTestObject = new FindMax("Shreyas Iyyer","Prithvi Shaw","Rishbah Pant","Jadeza","Kohli","ABD");
        String stringMaximum = (String) stringTestObject.findMaximum();
        Assert.assertEquals("ABD",stringMaximum);

    }
}