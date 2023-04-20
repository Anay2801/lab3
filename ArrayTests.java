import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace1() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed1() {
    int[] input2 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input2));
  }

@Test
  public void testReversedError2() {
    int[] input3 = {1,2,3,4,5};
    assertArrayEquals(new int[]{5,4,3,2,1}, ArrayExamples.reversed(input3));
  }


@Test
  public void testReversed2() {
    int[] input4 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input4));
  }


@Test
  public void testAverageWithoutLowest1() {
    double[] input5 = {1.0,2.0,3.0};
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input5));
  }

@Test
  public void testAverageWithoutLowest2() {
    double[] input6 = {1.0};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input6));
  }


@Test
  public void testAverageWithoutLowest3() {
    double[] input7 = {};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input7));
  }
}