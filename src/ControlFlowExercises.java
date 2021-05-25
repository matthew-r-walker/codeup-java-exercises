public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 0;
//        do {
//            System.out.printf("The value of i is %s%n", i);
//            i += 2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.printf("The value of i is %s%n", i);
//            i -= 5;
//        } while (i >= -10);

        long i = 2;
        do {
            System.out.printf("The value of i is %s%n", i);
            i *= i;
        } while (i < 1000000);

    }
}
