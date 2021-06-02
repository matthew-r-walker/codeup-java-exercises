package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {

        Input in = new Input();
        System.out.println("Enter the radius of a circle.");
        Circle circle = new Circle(in.getDouble());
        System.out.println("The area of your circle is: " + circle.getArea());
        System.out.println("The circumference of your circle is: " + circle.getCircumference());

    }
}
