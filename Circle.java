public class Circle implements Shape {

    double radius = 5;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Area = " + c.area());
        System.out.println("Perimeter = " + c.perimeter());
    }
}