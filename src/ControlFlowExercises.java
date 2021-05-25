public class ControlFlowExercises {
    public static void main(String[] args) {

        // while loop exercise refactored with a for loop
//        for (int i = 5; i <= 15; ++i) {
//            System.out.print(i);
//        }
        // do while loop exercise refactored with a for loop
//        for (int i = 0; i <= 100; i += 2) {
//            System.out.printf("The value of i is: %s%n", i);
//        }

//        for (int i = 100; i >= 0; i -= 5) {
//            System.out.printf("The value of i is: %s%n", i);
//        }

        for (long i = 2; i < 1000000; i *= i) {
            System.out.printf("The value of i is: %s%n", i);
        }
    }
}
