public class Rectangle implements Shape {

    double length = 8;
    double width = 5;

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}