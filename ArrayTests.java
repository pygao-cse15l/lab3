import static org.junit.Assert.*;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }


  @Test
  public void testReversed2() {
    int[] input1 = { 2, 4 };
    assertArrayEquals(new int[]{ 4, 2 }, ArrayExamples.reversed(input1));
  }


  @Test
  public void testReversedInPlace2() {
    int[] input1 = { 1, 2 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 2, 1 }, input1);
  }


  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = { 1, 1, 1 };
    assertEquals(1, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }
}
