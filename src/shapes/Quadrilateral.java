package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    abstract void setLength();

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    abstract void setWidth();

    public Quadrilateral(double length, double width) {
        setLength(length);
        setWidth(width);
    }
}
