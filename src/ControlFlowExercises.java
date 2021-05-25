import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // Instead of Fizzbuzz
        /*You have to design the code such that the user has only three tries to guess the correct pin of the account.
        You set the pin as a constant with a final attribute. When correct display "Correct, welcome back."
        When incorrect display "Incorrect, try again.". When user runs out of tries display
        "Sorry but you have been locked out."

            program Starts:
            Please enter pin:
            22132
            Output:
            Incorrect, try again.
            Please enter pin:
            23412
            Output:
            Incorrect, try again.
            Please enter pin:
            12345
            Output:
            Correct, welcome back.
             */
        Scanner scanner = new Scanner(System.in);

        final int PIN = 12345;

        for (int i = 1; i <= 3; ++i) {
            System.out.println("Please enter pin:");
            int userInputPin = scanner.nextInt();
            if (i == 3 && userInputPin != PIN) {
                System.out.println("Sorry but you have been locked out");
            } else if (userInputPin == PIN) {
                System.out.println("Correct, welcome back.");
                i = 3;
            } else if (userInputPin != PIN) {
                System.out.println("Incorrect, try again.");
            }
        }
    }
}
