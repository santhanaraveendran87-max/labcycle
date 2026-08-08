class Circle {

    double radius;
    double area;

    Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }

    static Circle calculateArea(double radius) {
        return new Circle(radius);
    }

    public static void main(String[] args) {

        Circle c = Circle.calculateArea(7);

        System.out.println("Radius = " + c.radius);
        System.out.printf("Area = %.2f%n", c.area);
    }
}