package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(5,4);
        System.out.printf("Rectangle length is: %f width is: %f%n", box1.length, box1.width);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Rectangle box2 = new Square(5);
        System.out.printf("Square side length is: %f%n", box2.length);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

    }
}
