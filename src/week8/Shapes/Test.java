package week8.Shapes;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape[] shapes = new Shape[6];

        System.out.print("Enter radius of circle: ");
        double circleRadius = scanner.nextDouble();
        shapes[0] = new Circle(circleRadius);

        System.out.print("Enter side of square: ");
        double squareSide = scanner.nextDouble();
        shapes[1] = new Square(squareSide);

        System.out.print("Enter base of triangle: ");
        double triangleBase = scanner.nextDouble();
        System.out.print("Enter height of triangle: ");
        double triangleHeight = scanner.nextDouble();
        shapes[2] = new Triangle(triangleBase, triangleHeight);

        System.out.print("Enter radius of sphere: ");
        double sphereRadius = scanner.nextDouble();
        shapes[3] = new Sphere(sphereRadius);

        System.out.print("Enter edge of tetrahedron: ");
        double tetraEdge = scanner.nextDouble();
        shapes[4] = new Tetrahedron(tetraEdge);

        System.out.print("Enter side of cube: ");
        double cubeSide = scanner.nextDouble();
        shapes[5] = new Cube(cubeSide);

        System.out.println("\n=== Shape Info ===");
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.printf("Area: %.2f\n", shape.getArea());

            if (shape instanceof Threedimention) {
                Threedimention tds = (Threedimention) shape;
                System.out.printf("Volume: %.2f\n", tds.getVolume());
            }
            System.out.println();
        }

    }
    
}
