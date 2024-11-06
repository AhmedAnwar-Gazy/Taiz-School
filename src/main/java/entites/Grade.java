//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package entites;

public class Grade {
    private Student student;
    private Subject course;
    private double score;

    public Grade(Student student, Subject course, double score) {
        this.student = student;
        this.course = course;
        this.score = score;
    }

    public Student getStudent() {
        return this.student;
    }

    public Subject getCourse() {
        return this.course;
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
