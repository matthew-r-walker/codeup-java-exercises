package shapes;

public class ShapesTest {

    public static void main(String[] args) {

//        Rectangle box1 = new Rectangle(5,4);
//        System.out.printf("Rectangle length is: %.2f width is: %.2f%n", box1.length, box1.width);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());

        Measurable myShape = new Rectangle(5, 10);
        Measurable myShape2 = new Square(5);

        // This will not compile because getLength is not defined within the Measurable interface
//        System.out.println(myShape.getLength());


        System.out.println(myShape.getArea());
        System.out.println(myShape2.getArea());

        System.out.println(myShape.getPerimeter());
        System.out.println(myShape2.getPerimeter());






    }
}
