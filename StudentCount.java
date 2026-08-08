class StudentCount {

    static int count = 0;

    StudentCount() {
        count++;
    }

    public static void main(String[] args) {

        StudentCount s1 = new StudentCount();
        StudentCount s2 = new StudentCount();
        StudentCount s3 = new StudentCount();

        System.out.println("Objects Created : " + count);
    }
}