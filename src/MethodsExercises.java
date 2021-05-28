import java.util.Scanner;

public class MethodsExercises {


    // 1. Basic Arithmetic
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // loop refactor
//    public static int multiply(int num1, int num2) {
//        int total = 0;
//        for (int i = 0; i < num2; ++i) {
//            total += num1;
//        }
//        return total;
//    }

    //Working on recursion refactor
//    public static int multiply(int num1, int num2) {
//        if (num1 == 0 || num2 == 0) {
//            return 0;
//        } else if ()
//
//    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int remainder(int num1, int num2) {
        return num1 % num2;
    }
    //////////////////////////////

    // 2. Create a method that validates that user input is in a certain range

//    public static int getInteger(int min, int max){
//    }


    public static int getInteger(int min, int max) {
        System.out.printf("Enter a number between %d and %d:%n", min, max);
        Scanner scanner = new Scanner(System.in);
        int userInputNum = scanner.nextInt();
        if (userInputNum > max || userInputNum < min) {
            System.out.println("Invalid input, Try again!");
            return getInteger(min, max);
        } else {
            return userInputNum;
        }
    }

    public static long calculateFactorial(int num) {
        Scanner scanner = new Scanner(System.in);
        String outPut = num + "! = ";
        long fact = num;
        for (int i = 1; i < num; ++i) {
            outPut += i + " x ";
            fact *= i;
        }
        outPut += num + " = " + fact;
        System.out.println(outPut);
        System.out.println("Would you like to enter another number? Reply yes or no.");
        String userReply = scanner.next();
        if (userReply.equalsIgnoreCase("yes")) {
            calculateFactorial(getInteger(1, 10));
        }
        return fact;
    }

    public static int randomNum(int num) {
        int randomInt = (int) (Math.random() * num) + 1;
        return randomInt;
    }

    public static int diceCreator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create a pair of dice!\nHow many sides you would like your dice to have.");
        int numOfSides = scanner.nextInt();
        return numOfSides;
    }

    public static int diceRoll(int num, int num2) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Create a pair of dice!\nEnter how many sides you would like your dice to have.");
        int numOfSides = num;
        String userReply = "";
        if (num2 == 0) {
            System.out.printf("Would you like to roll your %d sided dice?%nReply yes to roll!%n", numOfSides);
            userReply = scanner.next();
        }

        if (userReply.equalsIgnoreCase("yes") || num2 == 1) {
            int die1 = randomNum(numOfSides);
            int die2 = randomNum(numOfSides);
            System.out.println("ROLLINNNNNGGG");
            System.out.printf("Your dice rolled %d and %d! Totaling %d.%n", die1 , die2, die1 + die2);
        }
        System.out.println("Would you like to roll the dice again?\nReply yes to roll again.");
        userReply = scanner.next();
        if (userReply.equalsIgnoreCase("yes")) {
            diceRoll(numOfSides, 1);
        }
        return 0;
    }

    public static void main(String[] args) {

        diceRoll(diceCreator(), 0);
//        System.out.println(randomNum(5));
//        System.out.println(randomNum(5));
//        System.out.println(randomNum(5));
//        System.out.println(randomNum(5));
//        int userInput = getInteger(1, 10);
//        calculateFactorial(userInput);
//        System.out.println(add(2, 3));
//        System.out.println(subtract(3, 2));
//        System.out.println(multiply(3, 2));
//        System.out.println(divide(9, 9));
//        System.out.println(remainder(0, 9));
    }
}
