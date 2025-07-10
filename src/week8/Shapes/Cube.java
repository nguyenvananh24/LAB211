package week8.Shapes;

public class Cube extends Threedimention {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * side * side; 
    }

    @Override
    protected double getVolume() {
        return side * side * side; 
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                ", area=" + getArea() +
                ", volume=" + getVolume() +
                '}';
    }
    
}
