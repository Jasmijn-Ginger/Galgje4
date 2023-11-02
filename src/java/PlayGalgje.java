public class PlayGalgje {

    public void InitializeGame() {
        GalgjeWord galgjeWord = new GalgjeWord();
        galgjeWord.createGalgjeWord(galgjeWord.random_int, GalgjeWord.listOfWords);

        GameMaster gameMaster = new GameMaster(GalgjeWord.wordToBeGuessed);

        System.out.println(gameMaster.welcomMessage());
        gameMaster.displayWord();
    }
}
