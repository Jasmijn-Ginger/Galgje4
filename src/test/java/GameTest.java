import org.junit.jupiter.api.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class GameTest {
    private static final PrintStream standardOut = System.out;
    private static final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeAll
    public static void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterAll
    public static void tearDown() {
        System.setOut(standardOut);
    }

    @BeforeEach
    public void clearOutputStreamBuffer(){
        outputStreamCaptor.reset();
    }

    Game game = new Game();
    @Test
    public void gameWonTest(){
        //When
        game.gameWon();
        //Then
        Assertions.assertEquals("Gefeliciteerd je hebt gewonnen! Het woord was: " + GalgjeWord.wordToBeGuessed, outputStreamCaptor.toString().trim());
        Assertions.assertNotEquals("verloren", outputStreamCaptor.toString().trim());

    }

    @Test
    public void gameLostTest(){
        //When
        game.gameLost();
        //Then
        Assertions.assertEquals("Helaas, je hebt verloren. Het woord was: " + GalgjeWord.wordToBeGuessed, outputStreamCaptor.toString().trim());
        Assertions.assertNotEquals("gewonnen", outputStreamCaptor.toString().trim());
    }

    @Test
    public void gameStillOnTest(){
        Assertions.assertTrue(game.gameStillOn(5, "gr_en".toCharArray()));
        Assertions.assertTrue(game.gameStillOn(1, "_____".toCharArray()));
        Assertions.assertFalse(game.gameStillOn(0, "_____".toCharArray()));
        Assertions.assertFalse(game.gameStillOn(6, "groen".toCharArray()));
    }

}
