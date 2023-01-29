import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 4,3,2,1 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 1,2,3,4 }, input1);
	}



  @Test
  public void averageWithoutLowest() {
    double[] input1 = {5,5,5, 5};
    //assertArrayEquals(new double = 5, ArrayExamples.averageWithoutLowest(input1));
    assertEquals(5.0, ArrayExamples.averageWithoutLowest(input1) );
  }


}
