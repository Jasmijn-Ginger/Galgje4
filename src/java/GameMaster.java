import java.util.ArrayList;
import java.util.List;

public class GameMaster {
    String word;

    GameMaster(String word){
        this.word = word;
    }

    Game game = new Game();
    List<String> listGuessedLetters = new ArrayList<>();


//Creeert een aantal lege spaces in het aantal hoe lang het galgjewoord is
    public char[] emptyLines() {
        char[] emptyLines = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            emptyLines[i] = '_';
        }
        return emptyLines;
    }

    public String welcomMessage(){
        return "Welkom bij Galgje. Je kan 10 fouten maken om het woord te raden. Succes!";
    }

//Checkt of de gekozen letter in het galgjewoord zit
    public boolean letterInWord(String letter) {
        if (word.toUpperCase().contains(letter)){
            return true;
        }
        else{
            System.out.println("Too bad, the letter you chose is not in the word. Try again");
            return false;
        }
    }

//
    public void displayWord() {
        int triesLeft = 10;
        char[] display = emptyLines().clone();
        char[] wordArray = word.toUpperCase().toCharArray();
        System.out.println(word);
        //while game stillOn because there are more than 10 tries and there are still letters to be guessed:
        while (game.gameStillOn(triesLeft, display)){
            System.out.println("You have already guessed the following letters: " + String.join(", ",listGuessedLetters));
            System.out.println(display);
            String chosenLetter = InputUser.getInputUser();
            //check if letter in word and replace that space in the displayword with the guessedletter
            if (letterInWord(chosenLetter)) {
                for (int i=0; i<wordArray.length; i++) {
                    if (wordArray[i] == chosenLetter.charAt(0)) {
                        display[i] = chosenLetter.charAt(0);
                    }
                }
                listGuessedLetters.add(chosenLetter);
                System.out.println("You have " + triesLeft + " number of tries left");
            }

            else {
                listGuessedLetters.add(chosenLetter);
                triesLeft--;
                System.out.println("You have " + triesLeft + " number of tries left");
            }
        }
        if (triesLeft == 0){game.gameLost();}
        if (!String.valueOf(display).contains("_")){game.gameWon();}

    }





}
