import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class GameMasterDisplayTest {
    private final PrintStream standardOut = System.out;
    private final InputStream standardIn = System.in;
    private static final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

//Zelfde probleem als in InputUserTest. Test op zichzelf doet het, maar niet via class.

    public String givenGalgjeWord = "groen";
    GameMaster gameMaster = new GameMaster(givenGalgjeWord);

//    void provideInput(String data) {
//        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
//
//    }
//
//    @Test
//    void givenName_whenReadFromInput_thenReturnCorrectResult() {
//        provideInput();
//        String input = InputUser.getInputUser();
//        Assertions.assertEquals("A", input);
//    }

    @BeforeAll
    static void setup() {
//        try (
//                InputStream inputStream = Main.class.getClassLoader()
//                        .getResourceAsStream("successcenario.txt")) {
            ByteArrayInputStream testIn = new ByteArrayInputStream("g\r\nr\r\no\r\ne\r\nn".getBytes());
            System.setIn(testIn);

//        }
//        catch(Exception e){}
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
        System.setIn(standardIn);
    }

    @Test
    void testInputStream(){
        Scanner myReader = new Scanner(System.in);
        Assertions.assertEquals("g", myReader.next());
        Assertions.assertEquals("r", myReader.next());
        Assertions.assertEquals("o", myReader.next());
    }

    @Test
    void test(){
        gameMaster.displayWord();
        Assertions.assertTrue(outputStreamCaptor.toString().contains("Gefeliciteerd"));
    }
}
