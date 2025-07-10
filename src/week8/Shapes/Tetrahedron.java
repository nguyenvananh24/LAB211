package week8.Shapes;

public class Tetrahedron extends Threedimention {
    private double side;

    public Tetrahedron(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * side * side;
    }

    @Override
    protected double getVolume() {
        return (Math.pow(side, 3) / (6 * Math.sqrt(2)));
    }

    @Override
    public String toString() {
        return "Tetrahedron{" +
                "side=" + side +
                ", area=" + getArea() +
                ", volume=" + getVolume() +
                '}';
    }

    
}
