package week8.Shapes;

public class Sphere extends Threedimention {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    protected double getVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                ", area=" + getArea() +
                ", volume=" + getVolume() +
                '}';
    }
}
