package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    void setLength() {

    }

    @Override
    void setWidth() {

    }

//    protected double length, width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea() {
//        System.out.println("The area of this rectangle is:");
//        return length * width;
//    }
//
//    public double getPerimeter() {
//        System.out.println("The perimeter of this rectangle is:");
//        return (2 * length) + (2 * width);
//    }


}
