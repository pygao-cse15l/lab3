import static org.junit.Assert.assertArrayEquals;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class FileTest {
    @Test
    public void testGetFiles() throws IOException {
        File input = new File("/Users/petergao/Documents/GitHub/classes/cse15l/lab3/D1");
        File[] ex = {new File("/Users/petergao/Documents/GitHub/classes/cse15l/lab3/D1/F1.txt"), 
        new File("/Users/petergao/Documents/GitHub/classes/cse15l/lab3/D1/D2/F2.txt")};

        assertArrayEquals(ex, FileExample.getFiles(input).toArray());
    }
}
