package week8.Shapes;

public class Circle extends Twodimention {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + getArea() +
                '}';
    }
}
