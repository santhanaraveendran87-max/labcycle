public class StudentReturn {

    String name;
    int mark;

    StudentReturn(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    static StudentReturn getStudentReturn() {
        StudentReturn s = new StudentReturn("Arun", 87);
        return s;
    }

    public static void main(String[] args) {

        StudentReturn s = StudentReturn.getStudentReturn();

        System.out.println("Student Name : " + s.name);
        System.out.println("Mark : " + s.mark);
    }
}