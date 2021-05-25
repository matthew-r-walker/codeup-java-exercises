import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int userInputNum = scanner.nextInt();

        String table =  "What number would you like to go up to? "+ userInputNum +"\n\n" +
            "Here is your table!\n\n" +
            "number | squared | cubed\n" +
            "------ | ------- | -----\n";

        for (int i = 1; i <= userInputNum; ++i) {
            table += i +"      | "+ i*i +"       | "+ i*i*i +"\n";
        }
        System.out.println(table);

    }
}
