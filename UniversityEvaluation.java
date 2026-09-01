abstract class StudentEvaluation {

    protected String name;
    protected int rollNo;

    // Constructor
    StudentEvaluation(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Concrete method
    void displayDetails() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
    }

    // Abstract methods
    abstract double calculateTotalMarks();

    abstract String displayGrade();
}


// UG Course Evaluation
class UGCourseEvaluation extends StudentEvaluation {

    private double internal;
    private double external;

    UGCourseEvaluation(String name, int rollNo,
                       double internal, double external) {
        super(name, rollNo);
        this.internal = internal;
        this.external = external;
    }

    @Override
    double calculateTotalMarks() {
        return internal + external;
    }

    @Override
    String displayGrade() {

        double total = calculateTotalMarks();

        if (total >= 90)
            return "A+";
        else if (total >= 80)
            return "A";
        else if (total >= 70)
            return "B";
        else if (total >= 60)
            return "C";
        else if (total >= 50)
            return "D";
        else
            return "F";
    }
}


// PG Course Evaluation
class PGCourseEvaluation extends StudentEvaluation {

    private double assignment;
    private double exam;

    PGCourseEvaluation(String name, int rollNo,
                       double assignment, double exam) {
        super(name, rollNo);
        this.assignment = assignment;
        this.exam = exam;
    }

    @Override
    double calculateTotalMarks() {
        return assignment + exam;
    }

    @Override
    String displayGrade() {

        double total = calculateTotalMarks();

        if (total >= 90)
            return "A+";
        else if (total >= 80)
            return "A";
        else if (total >= 70)
            return "B";
        else if (total >= 60)
            return "C";
        else if (total >= 50)
            return "D";
        else
            return "F";
    }
}


// Certificate Course Evaluation
class CertificateCourseEvaluation extends StudentEvaluation {

    private double theory;
    private double practical;

    CertificateCourseEvaluation(String name, int rollNo,
                                double theory, double practical) {
        super(name, rollNo);
        this.theory = theory;
        this.practical = practical;
    }

    @Override
    double calculateTotalMarks() {
        return theory + practical;
    }

    @Override
    String displayGrade() {

        double total = calculateTotalMarks();

        if (total >= 90)
            return "A+";
        else if (total >= 80)
            return "A";
        else if (total >= 70)
            return "B";
        else if (total >= 60)
            return "C";
        else if (total >= 50)
            return "D";
        else
            return "F";
    }
}


// New course type added without modifying abstract class
class DiplomaCourseEvaluation extends StudentEvaluation {

    private double test;
    private double project;

    DiplomaCourseEvaluation(String name, int rollNo,
                            double test, double project) {
        super(name, rollNo);
        this.test = test;
        this.project = project;
    }

    @Override
    double calculateTotalMarks() {
        return test + project;
    }

    @Override
    String displayGrade() {

        double total = calculateTotalMarks();

        if (total >= 90)
            return "A+";
        else if (total >= 80)
            return "A";
        else if (total >= 70)
            return "B";
        else if (total >= 60)
            return "C";
        else if (total >= 50)
            return "D";
        else
            return "F";
    }
}


// Main class
public class UniversityEvaluation {

    public static void main(String[] args) {

        StudentEvaluation[] students = {

                new UGCourseEvaluation("Albin", 101, 35, 55),

                new UGCourseEvaluation("Rahul", 102, 30, 45),

                new PGCourseEvaluation("Anu", 103, 40, 48),

                new CertificateCourseEvaluation("John", 104, 42, 43),

                new DiplomaCourseEvaluation("Meera", 105, 45, 47)
        };

        System.out.println("===== UNIVERSITY EVALUATION SYSTEM =====");

        for (StudentEvaluation student : students) {

            System.out.println("\n-----------------------------");

            student.displayDetails();

            System.out.println("Total Marks  : "
                    + student.calculateTotalMarks());

            System.out.println("Grade        : "
                    + student.displayGrade());
        }
    }
}