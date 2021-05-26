import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userResponse = "";
        do {
            System.out.println("Please enter a grade number from 0-100");
            int userInputGrade = scanner.nextInt();
            if (userInputGrade >= 88) {
                System.out.println("The grade you entered is: A");
            } else if (userInputGrade >= 80 && userInputGrade <= 87) {
                System.out.println("The grade you entered is: B");
            } else if (userInputGrade >= 67 && userInputGrade <= 79) {
                System.out.println("The grade you entered is: C");
            } else if (userInputGrade >= 60 && userInputGrade <= 66) {
                System.out.println("The grade you entered is: D");
            } else if (userInputGrade >= 0 && userInputGrade <= 59) {
                System.out.println("The grade you entered is: F");
            }
            System.out.println("Would like to continue?\nEnter yes to continue or no to stop.");
            userResponse = scanner.next();
        } while (userResponse.equals("yes"));

    }
}
