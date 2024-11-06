package entites;

import java.util.ArrayList;

public class Subject {
    private int id;
    private String name;
    private String book;
    private Teacher teacher;
    private ArrayList<Student> students;

    public Subject(String name, String book, Teacher teacher) {
        this.name = name;
        this.book = book;
        this.teacher = teacher;
        this.students = new ArrayList();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

}
