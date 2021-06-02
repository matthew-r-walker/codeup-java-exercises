package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input in = new Input();
        Circle circle = new Circle(in.getDouble());
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());

    }
}
