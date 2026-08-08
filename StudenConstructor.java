class StudentConstructor {

    String name;
    int age;

    // Default constructor
    StudentConstructor() {
        System.out.println("Default Constructor");
    }

    // Parameterized constructor
    StudentConstructor(String name, int age) {
        this();
        System.out.println("Parameterized Constructor");

        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {

        StudentConstructor s = new StudentConstructor("Manu", 21);
        s.display();
    }
}