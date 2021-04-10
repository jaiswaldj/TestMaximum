import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class FindMaxTest {
    FindMax testObject = new FindMax();
    @Test
    void FindMaxTest(){
        double testMaximum = testObject.findMaximum(12.2258,12.2259,12.2257);
        Assertions.assertEquals(12.2259,testMaximum);
    }


}
