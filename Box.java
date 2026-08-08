class Box {

    int length;
    int breadth;
    int height;

    Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    int volume() {
        return length * breadth * height;
    }

    void compare(Box b1, Box b2) {

        if (b1.volume() > b2.volume()) {
            System.out.println("Larger Box Volume = " + b1.volume());
        } else {
            System.out.println("Larger Box Volume = " + b2.volume());
        }
    }

    public static void main(String[] args) {

        Box b1 = new Box(3, 4, 5);
        Box b2 = new Box(5, 4, 6);

        b1.compare(b1, b2);
    }
}