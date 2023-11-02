public class Main {

    public static void main(String[] args) {
//        PlayGalgje playGalgje = new PlayGalgje();
//        //Start nieuw galgje
//        playGalgje.InitializeGame();
//        //Als user antwoord dat die nogmaals wil spelen, wordt nieuwe game opgestart
//        if (InputUser.getAnswer().equals("YES")){
//            playGalgje.InitializeGame();
//        }
//        //Als user antwoord dat die niet nogmaals wil spelen, wordt game afgesloten en boodschap getoond
//        if (InputUser.getAnswer().equals("NO")){
//            System.out.println("Byebye");
//        }


        GalgjeWord galgjeWord = new GalgjeWord();
        galgjeWord.createGalgjeWord();
        System.out.println(galgjeWord.lijst);
    }

}
