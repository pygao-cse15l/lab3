import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import java.util.*;

public class ListTests {
    @Test
    public void testFilter() {
        List<String> input1 = Arrays.asList("a", "b");
        StringChecker input2 = new StringChecker() {
            public boolean checkString(String s) { return true; }
        };
        assertArrayEquals(new String[]{"a", "b"}, ListExamples.filter(input1, input2).toArray());
    }
    @Test
    public void testFilter2() {
        List<String> input1 = Arrays.asList("a", "a");
        StringChecker input2 = new StringChecker() {
            public boolean checkString(String s) { return true; }
        };
        assertArrayEquals(new String[]{"a", "a"}, ListExamples.filter(input1, input2).toArray());
    }

    @Test
    public void testMerge() {
        List<String> input1 = Arrays.asList();
        List<String> input2 = Arrays.asList("b");

        assertArrayEquals(new String[]{"b"}, ListExamples.merge(input1, input2).toArray());
    }
}
