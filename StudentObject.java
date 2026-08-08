class StudentObject {

    String name;
    int rollNo;

    StudentObject(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display(StudentObject s) {
        System.out.println("Student Name : " + s.name);
        System.out.println("Roll No : " + s.rollNo);
    }

    public static void main(String[] args) {

        StudentObject s = new StudentObject("Neha", 25);

        s.display(s);
    }
}