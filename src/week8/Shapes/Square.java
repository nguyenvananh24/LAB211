package week8.Shapes;

public class Square extends Twodimention {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + getArea() +
                '}';
    }
}
