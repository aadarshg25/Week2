import java.util.Scanner;

class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        CircleDetails circle = new CircleDetails(radius);

        // area and circumference
        double areaOfCircle = circle.areaOfCircle();
        double circumferenceOfCircle = circle.circumferenceOfCircle();

        System.out.println("Area of Circle is: " + areaOfCircle);
        System.out.println("Circumference of Circle is: " + circumferenceOfCircle);

        input.close();
    }
}

class CircleDetails {

    private double radius;

    // Constructor
    CircleDetails(double radius) {
        this.radius = radius;
    }

    // area of the circle
    public double areaOfCircle() {
        return Math.PI * radius * radius;
    }

    // circumference of the circle
    public double circumferenceOfCircle() {
        return 2 * Math.PI * radius;
    }
}
