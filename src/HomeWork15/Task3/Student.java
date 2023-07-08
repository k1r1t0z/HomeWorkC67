package HomeWork15.Task3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int group;
    private int course;
    private int ball;
    ArrayList<Student> arrayList = new ArrayList<>();

    public Student(String name, int group, int course, int ball) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.ball = ball;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Student> arrayList) {
        this.arrayList = arrayList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", ball=" + ball +
                ", arrayList=" + arrayList +
                '}';
    }

    void removeStudent (Student s) {
        if (s.getBall() < 3) {
            arrayList.remove(s);
        } else if (s.getBall() >= 3) {
            s.course++;
        }
    }

    void printStudents(List<Student> students, int course){
        for (Student st:students){
            if (st.course == course){
                System.out.println(st.name + " " + st.course);
            }
        }
    }

}
