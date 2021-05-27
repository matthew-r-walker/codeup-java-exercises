import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        System.out.println("Meet Bob, you can ask him questions, yell at him or say nothing to him.\nReply quit to stop talking to Bob.\nWhat do you want to say to Bob?");
        do {
        userInput = scanner.nextLine();
        if (userInput.endsWith("?")) {
            System.out.println("Sure.");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.equals("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }
            } while (!userInput.equalsIgnoreCase("quit"));
        System.out.println("BYE!!!");
    }
}
