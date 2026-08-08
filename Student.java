class StudentThis{

    String name;
    int age;

    StudentThis(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {

        StudentThis s = new StudentThis("Anu", 20);
        s.display();
    }
}