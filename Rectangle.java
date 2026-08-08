class Rectangle {

    int length;
    int breadth;

    // Default constructor
    Rectangle() {
        length = 1;
        breadth = 1;
    }

    // Parameterized constructor
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return length * breadth;
    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(8, 5);

        System.out.println("Rectangle 1 Area = " + r1.area());
        System.out.println("Rectangle 2 Area = " + r2.area());
    }
}