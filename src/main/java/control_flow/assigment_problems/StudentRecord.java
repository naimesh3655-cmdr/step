public class StudentRecord {

    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Divya";
        student.marks = 88;

        System.out.println("Name: " + student.name + " | Marks: " + student.marks);
    }
}

class Student {

    String name;
    int marks;
}