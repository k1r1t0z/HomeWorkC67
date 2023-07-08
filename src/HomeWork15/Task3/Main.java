package HomeWork15.Task3;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kirill", 701, 2 , 3);
        student.getArrayList().add(new Student("Vasya", 302, 2 ,3));
        student.removeStudent(student);
        student.printStudents(student.getArrayList(), 2);
        System.out.println(student);
    }
}
