import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class FindMaxTest {
    FindMax testObject = new FindMax();
    @Test
    void FindMaxTest(){
        int testMaximum = testObject.findMaximum(56,13,35);
        Assert.assertEquals(28,testMaximum);
    }


}
