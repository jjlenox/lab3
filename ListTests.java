import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 4,3,2,1 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 1,2,3,4 }, input1);
	}


}
