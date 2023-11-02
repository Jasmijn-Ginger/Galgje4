import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GalgjeWordTest {

    GalgjeWord galgjeWord = new GalgjeWord();
    public String[] listOfGivenWords = {"geel", "groen", "blauw", "oranje"};

    @Test
    public void CreateGalgjewordTest(){
        //Given
        int random_int = 2;
        String expectedOutcome = "BLAUW";
        galgjeWord.createGalgjeWord(random_int, listOfGivenWords);
        //When
        String expectedResult = GalgjeWord.wordToBeGuessed;
        //Then
        Assertions.assertEquals(expectedOutcome, expectedResult);
    }

    @Test
    public void CreateGalgjewordTest2(){
        //Given
        int random_int = 0;
        String expectedOutcome = "GEEL";
        galgjeWord.createGalgjeWord(random_int, listOfGivenWords);
        //When
        String expectedResult = GalgjeWord.wordToBeGuessed;
        //Then
        Assertions.assertEquals(expectedOutcome, expectedResult);
    }

    @Test
    public void TestListOfWordsIndex284(){
        //Given
        int random_int = 284;
        String expectedOutcome = "YOURSELF";
        galgjeWord.createGalgjeWord(random_int, GalgjeWord.listOfWords);
        String expectedResult = GalgjeWord.wordToBeGuessed;
        Assertions.assertEquals(expectedOutcome, expectedResult);
    }

    @Test
    public void TestListOfWordsIndex0(){
        int random_int = 0;
        String expectedOutcome = "ADEQUATE";
        galgjeWord.createGalgjeWord(random_int, GalgjeWord.listOfWords);
        String expectedResult = GalgjeWord.wordToBeGuessed;
        Assertions.assertEquals(expectedOutcome, expectedResult);
    }



}
