import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NumAListTest {
    @Test
    public void constructor3Test(){
        int[] testArr = {1, 2, 3};
        NumAList aList = new NumAList(testArr);
        testArr[0] = 0;
        assertEquals(1, aList.get(0));
    }
}