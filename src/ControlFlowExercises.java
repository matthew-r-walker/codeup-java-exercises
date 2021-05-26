import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userResponse = "";
        String yes = "yes";
        do {
            System.out.println("Please enter a number.");
            int userInputNum = scanner.nextInt();

            String table = "The number you have entered is: " + userInputNum + "\n\n" +
                    "Here is your table!\n\n" +
                    "number | squared | cubed\n" +
                    "------ | ------- | -----\n";

            for (int i = 1; i <= userInputNum; ++i) {
                table += i + "      | " + i * i + "       | " + i * i * i + "\n";
            }
            System.out.println(table);
            System.out.println("Would you like to continue?\nEnter yes to continue or no to stop.");
            userResponse = scanner.next();
        } while (userResponse.equals(yes));
    }
}
