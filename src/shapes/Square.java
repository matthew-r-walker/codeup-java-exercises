package shapes;

public class Square extends Rectangle {

    // Assigns side the length from our passed in side from
    private double side = length;

    // Calls the rectangle constructor from the super class
    public Square(double side) {
        super(side, side);
    }

    // Overrides the super class getArea method
    @Override
    public double getArea() {
        System.out.println("The area of this square is:");
        return side * side;
    }
    //Overrides the super class getPerimeter method
    @Override
    public double getPerimeter() {
        System.out.println("The perimeter of this square is:");
        return 4 * side;
    }
}
