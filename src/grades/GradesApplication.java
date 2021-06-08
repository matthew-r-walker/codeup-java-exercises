package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static Scanner sc = new Scanner(System.in);

    public static boolean hasNotSearched = true;

    public static void getUserInfo(HashMap<String, Student> map) {
        if (hasNotSearched) {
            System.out.println("Welcome!\n");
            System.out.println("Here are the GitHub usernames of our students:\n");
            System.out.printf("%s%n%n",map.keySet());
        }
        System.out.println("What student would you like information on?");
        String userChoice = sc.nextLine();
        if (map.containsKey(userChoice)) {
            System.out.printf("Name: %s - GitHub Username: %s%n", map.get(userChoice).getName(), userChoice);
            System.out.printf("Current Average: %.1f%n",map.get(userChoice).getGradeAverage());
        } else {
            System.out.println("Sorry, no student with the GitHub user name of " + "\"" + userChoice + "\".");
        }
        System.out.println("Would you like to see another student? y/n?");
        userChoice = sc.nextLine();
        if (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")){
            hasNotSearched = false;
            getUserInfo(map);
        } else {
            System.out.println("Goodbye!");
        }
    }

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student cody = new Student("Cody");
        cody.addGrade(70);
        cody.addGrade(75);
        cody.addGrade(80);
        Student jim = new Student("Jim");
        jim.addGrade(80);
        jim.addGrade(90);
        jim.addGrade(100);
        Student bill = new Student("Bill");
        bill.addGrade(75);
        bill.addGrade(73);
        bill.addGrade(85);
        Student phil = new Student("Phil");
        phil.addGrade(70);
        phil.addGrade(73);
        phil.addGrade(74);
        students.put("cody-the-duck", cody);
        students.put("jimbo", jim);
        students.put("bill-mccoder", bill);
        students.put("philbug", phil);


        getUserInfo(students);
    }
}
