package grades;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String name;
    private ArrayList<Integer> grades;


    public Student(String name) {
        setName(name);
        grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(Integer...nums) {
        this.grades = new ArrayList<>(Arrays.asList(nums));
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double counter = 0;
        for (int i = 0; i < grades.size(); ++i) {
            counter += grades.get(i);
        }
        return counter / grades.size();
    }

    public static void main(String[] args) {
        Student bob = new Student("Bob");
        bob.setGrades(73, 70, 74);
        bob.addGrade(70);
        bob.addGrade(80);
        bob.addGrade(90);
        System.out.println(bob.getGrades());
        System.out.println(bob.getGradeAverage());
        System.out.println(bob.grades);

    }

}
