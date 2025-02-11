import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class amitTest {

    @Test
    void testMain() throws IOException {
        String input = "2\n3\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        amit.main(new String[]{});

        String expectedOutput = " enter number\n enter power value\npower =2\npower =4\npower =8\n";
        assertEquals(expectedOutput, out.toString());
    }
}