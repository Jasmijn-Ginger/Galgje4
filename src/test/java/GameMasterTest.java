import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GameMasterTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();


    public String givenGalgjeWord = "groen";
    GameMaster gameMaster = new GameMaster(givenGalgjeWord);

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void displayEmptyLines(){
        //Given
        char[] expectedOutcome = {'_', '_', '_', '_', '_'};
        gameMaster.emptyLines();
        //When
        char [] result = gameMaster.emptyLines();
        //Then
        Assertions.assertEquals(new String(expectedOutcome), new String(result));
    }

    @Test
    public void trueLetterInWordTest(){
        Assertions.assertTrue(gameMaster.letterInWord("O"));
        Assertions.assertFalse(gameMaster.letterInWord("o"));
    }

    @Test
    void falseLetterInWordTest(){
        gameMaster.letterInWord("a");
        Assertions.assertEquals("Too bad, the letter you chose is not in the word. Try again", outputStreamCaptor.toString().trim());
    }

    @Test
    void welcomeMessageTest(){
        Assertions.assertEquals("Welkom bij Galgje. Je kan 10 fouten maken om het woord te raden. Succes!", gameMaster.welcomMessage());
    }




}
