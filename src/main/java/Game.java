public class Game {
    //Als er nog empty lines zitten in het galgjewoordDisplay en er meer dan 0 fouten over zijn, is de game still on
    public boolean gameStillOn(int triesLeft, char[] word){
        if (triesLeft>0 && new String(word).contains("_")){
            return true;
        }
        return false;
    }

    public void gameWon() {
        System.out.println("Gefeliciteerd je hebt gewonnen! Het woord was: " + GalgjeWord.wordToBeGuessed);
    }

    public void gameLost() {
        System.out.println("Helaas, je hebt verloren. Het woord was: " + GalgjeWord.wordToBeGuessed);
    }


}
