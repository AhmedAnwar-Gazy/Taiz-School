package entites;

import java.util.ArrayList;

public class Teacher extends Person{
    private String specialty;
    private ArrayList<Subject> courses;

    public Teacher(String name, int berthDate, Boolean gender, String specialty) {
        super(name, berthDate, gender);
        this.specialty = specialty;
        this.courses = new ArrayList();
    }

    public String getSpecialty() {
        return this.specialty;
    }

    public ArrayList<Subject> getCourses() {
        return this.courses;
    }

    public void addCourse(Subject course) {
        this.courses.add(course);
    }
}


