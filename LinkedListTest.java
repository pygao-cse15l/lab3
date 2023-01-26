import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTest {
    @Test
    public void testMultipleAppend() {
        LinkedList list = new LinkedList();
        list.append(0);
        list.append(1);
        list.append(2);

        String out = "0 1 2 ";

        assertEquals(out, list.toString());
    }
}
