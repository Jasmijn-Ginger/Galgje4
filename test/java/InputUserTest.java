import org.junit.jupiter.api.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;


public class InputUserTest {

    private static final PrintStream standardOut = System.out;
    private static final InputStream standardIn = System.in;

    @AfterAll
    public static void reset(){
        System.setOut(standardOut);
        System.setIn(standardIn);
    }

//nog manier vinden om te resetten. Kom er niet uit.
    void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }



    @Test
    void givenName_whenReadFromInput_thenReturnCorrectResult() {
        provideInput("a");
        String input = InputUser.getInputUser();
        Assertions.assertEquals("A", input);
    }

    @Test
    void getAnswerTest(){
        provideInput("yes");
        String input = InputUser.getAnswer();
        Assertions.assertEquals("YES", input);
    }
}
