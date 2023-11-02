import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PlayGalgjeTest {


    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

//    @Test
//    public void testMessage(){
//        PlayGalgje playGalgje = new PlayGalgje();
//        playGalgje.InitializeGame();
//        Assertions.assertEquals("Welkom bij Galgje. Je kan 10 fouten maken om het woord te raden. Succes!", outputStreamCaptor.toString().trim());
//
//    }

}