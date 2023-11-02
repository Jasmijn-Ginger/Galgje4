import java.util.Scanner;

public class InputUser {

    public static String getInputUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which letter do you want to guess? ");
        String input = scanner.next();
        return input.toUpperCase();
    }

    public static String getAnswer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to play again? yes/no ");
        String input = scanner.next();
        return input.toUpperCase();
    }



}
