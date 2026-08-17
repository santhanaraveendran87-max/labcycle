class person{
    String name;
    int age;

    person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Student extends person {
    int rollno;
    double mark;

    Student( String name, int age,int rollno,double mark){
        super(name, age);
        this.rollno = rollno;
        this.mark = mark;
    }

    void display() {
        System.out.println("Student details");
        System.out.println("___________________");
        System.out.println("name : "+name);
        System.out.println("age :"+age);
        System.out.println("rollno :"+rollno);
        System.out.println("mark : "+mark);
    }
}
public class StudentMain{
    public static void main(String[] args){
        Student s = new Student("anu",20,10,50);
        s.display();
    }
}