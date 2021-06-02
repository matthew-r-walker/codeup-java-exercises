package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Enter a sentence.");
        String input = scanner.nextLine();
        return input;
    }
    public boolean yesNo() {
        System.out.println("Enter yes or no");
        String input = scanner.next();
        if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }
    public int getInt(){
        System.out.println("Enter a number.");
        int userInputNum = scanner.nextInt();
        return userInputNum;
    }
    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d:%n", min, max);
        int userInputNum = scanner.nextInt();
        if (userInputNum > max || userInputNum < min) {
            System.out.println("Invalid input, Try again!");
            return getInt(min, max);
        } else {
            return userInputNum;
        }
    }
    public double getDouble(){
        System.out.println("Enter a number with a decimal.");
        double userInputNum = scanner.nextDouble();
        return userInputNum;
    }
    public double getDouble(double min, double max) {
        System.out.printf("Enter a number with a decimal between %f and %f:%n", min, max);
        double userInputNum = scanner.nextDouble();
        if (userInputNum > max || userInputNum < min) {
            System.out.println("Invalid input, Try again!");
            return getDouble(min, max);
        } else {
            return userInputNum;
        }
    }

}