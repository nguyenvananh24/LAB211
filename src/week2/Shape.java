package week2;

abstract class Shape {

    public abstract double getPerimeter();

    public abstract double getArea();

    public abstract void printResult();
}

class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void printResult() {
        System.out.println("-----Retangle------");
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
    }
}

class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public boolean isTrangle() {
        return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }

    @Override
    public double getPerimeter() {
        if (!isTrangle()) {
            return 0;
        }
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        if (!isTrangle()) {
            return 0;
        }
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public void printResult() {
        System.out.println("-----Triangle-----");
        System.out.println("Side A: " + sideA);
        System.out.println("Side B: " + sideB);
        System.out.println("Side C: " + sideC);
        if (!isTrangle()) {
            System.out.println("This is not a triangle");
            return;
        }
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {return radius;}

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void printResult() {
        System.out.println("-----Circle-------");
        System.out.println("Radius: " + radius);
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
    }
}
