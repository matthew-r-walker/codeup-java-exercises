import java.util.Scanner;

public class HighLow {

    public static int randomNum() {
        int randomInt = (int) (Math.random() * 100) + 1;
        return randomInt;
    }
    public static int counter = 0;
    public static void guessThisInt(int randNum) {
//        System.out.println("This random num is " + randNum);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the random number!");
        int userGuess = scanner.nextInt();
        if (userGuess > randNum) {
            System.out.println("LOWER");
            ++counter;
            System.out.printf("Guesses: %d%n", counter);
            guessThisInt(randNum);
        } else if (userGuess < randNum) {
            System.out.println("HIGHER");
            ++counter;
            System.out.printf("Guesses: %d%n", counter);
            guessThisInt(randNum);
        } else if (userGuess == randNum) {
            System.out.println("GOOD GUESS!");
            System.out.printf("You got it in %d guesses!%n", counter);
        }
    }

    public static void main(String[] args) {
        guessThisInt(randomNum());

    }
}
