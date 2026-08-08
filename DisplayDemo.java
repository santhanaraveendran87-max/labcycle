class DisplayDemo {

    void display(int n) {
        System.out.println("Integer : " + n);
    }

    void display(double n) {
        System.out.println("Double : " + n);
    }

    void display(String text) {
        System.out.println("String : " + text);
    }

    public static void main(String[] args) {

        DisplayDemo d = new DisplayDemo();

        d.display(10);
        d.display(25.6);
        d.display("Java");
    }
}