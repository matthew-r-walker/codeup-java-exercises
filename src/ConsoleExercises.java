import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number.");
        int userInputNum = scanner.nextInt();
        System.out.printf("Your number is: %s%n", userInputNum);

        System.out.println("Enter three words.");
        String firstUserWord = scanner.next();
        String secondUserWord = scanner.next();
        String thirdUserWord = scanner.next();
        System.out.printf("Your first word is %s%nYour second word is %s%nYour third word is %s%n", firstUserWord, secondUserWord, thirdUserWord);

        System.out.println("Enter a sentence.");
        scanner.nextLine();
        String userSentence = scanner.nextLine();
        System.out.printf("The sentence you entered is: %s%n", userSentence);


        System.out.println("What is the length, width and height of your room?");
        String userInputRoomStr = scanner.nextLine();
        String[] userNums = userInputRoomStr.split(" ");
        float userInputNum1 = Float.parseFloat(userNums[0]);
        float userInputNum2 = Float.parseFloat(userNums[1]);
        float userInputNum3 = Float.parseFloat(userNums[2]);
        Float userInputRoomArea = userInputNum1 * userInputNum2;
        Float userInputRoomVolume = userInputNum1 * userInputNum2 * userInputNum3;
        Float userInputRoomPerimeter = (userInputNum1 * 2) + (userInputNum2 * 2);
        System.out.printf("Your room perimeter is: %.2f%nYour room area is: %.2f%nYour room volume is %.2f%n", userInputRoomPerimeter, userInputRoomArea, userInputRoomVolume);

    }
}
