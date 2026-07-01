// Rectangle class
class rectangle {
    int length;
    int width;

    int findArea() {
        return length * width;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        rectangle rect = new rectangle();

        rect.length = 10;
        rect.width = 5;

        System.out.println("Length: " + rect.length);
        System.out.println("Width: " + rect.width);
        System.out.println("Area of Rectangle = " + rect.findArea());
    }
}