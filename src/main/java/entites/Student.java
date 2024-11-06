//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package entites;

import java.util.ArrayList;
import java.util.Iterator;

public class Student extends Person implements Stutestic {
    private ArrayList<Grade> grades = new ArrayList();

    public Student(String name, int berthDate, Boolean gender) {
        super(name, berthDate, gender);
    }

    public ArrayList<Grade> getGrades() {
        return this.grades;
    }

    public void addGrade(Grade grade) {
        this.grades.add(grade);
    }

    public double avreag() {
        double avg = 0.0;

        Grade i;
        for(Iterator var4 = this.grades.iterator(); var4.hasNext(); avg += i.getScore()) {
            i = (Grade)var4.next();
        }

        avg /= (double)this.grades.size();
        return avg;
    }

    public double max() {
        double maxv = ((Grade)this.grades.get(0)).getScore();
        Iterator var4 = this.grades.iterator();

        while(var4.hasNext()) {
            Grade i = (Grade)var4.next();
            if (maxv < i.getScore()) {
                maxv = i.getScore();
            }
        }

        return maxv;
    }

    public double min() {
        double minv = ((Grade)this.grades.get(0)).getScore();
        Iterator var4 = this.grades.iterator();

        while(var4.hasNext()) {
            Grade i = (Grade)var4.next();
            if (minv > i.getScore()) {
                minv = i.getScore();
            }
        }

        return minv;
    }
}
