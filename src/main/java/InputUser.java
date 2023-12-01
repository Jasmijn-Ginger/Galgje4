import java.util.Scanner;

public class InputUser {

    private static Scanner scanner = new Scanner(System.in);

    public static String getInputUser() {
        System.out.println("Which letter do you want to guess? ");
        String input = scanner.next();
        return input.toUpperCase();
    }

    public static String getAnswer() {
        System.out.println("Do you want to play again? yes/no ");
        String input = scanner.next();
        return input.toUpperCase();
    }



}
