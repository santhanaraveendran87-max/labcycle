class StudentGetterSetter {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        StudentGetterSetter s = new StudentGetterSetter();

        s.setName("Maya");
        s.setAge(19);

        System.out.println("Student Name : " + s.getName());
        System.out.println("Age : " + s.getAge());
    }
}