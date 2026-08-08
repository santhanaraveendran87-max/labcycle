class AreaDemo {

    int area(int side) {
        return side * side;
    }

    int area(int length, int breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {

        AreaDemo a = new AreaDemo();

        System.out.println("Area of Square = " + a.area(6));
        System.out.println("Area of Rectangle = " + a.area(8, 4));
    }
}