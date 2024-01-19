import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class CCWCTest {
    @Test
    void testBytesCount() {
        String fileName = "test.txt";
        long expectedBytes = 342190;
        assertEquals(expectedBytes, CCWC.bytesCount(fileName));
    }

    @Test
    void testLineCount() {
        String fileName = "test.txt";
        long expectedLines = 7145;
        assertEquals(expectedLines, CCWC.lineCount(fileName));
    }

    @Test
    void testWordCount() {
        String fileName = "test.txt"; 
        long expectedWords =  58164;
        assertEquals(expectedWords, CCWC.wordCount(fileName));
    }

    @Test
    void testDefaultOption() {
        String fileName = "test.txt"; 

        long expectedBytes =  342190;
        long expectedLines =  7145;
        long expectedWords =  58164;

        String expectedOutput = expectedBytes + " " + expectedLines + " " + expectedWords + " " + fileName;

        
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        CCWC.main(new String[]{fileName});
        System.setOut(System.out);

        assertEquals(expectedOutput, outputStream.toString().trim());
    }
}
