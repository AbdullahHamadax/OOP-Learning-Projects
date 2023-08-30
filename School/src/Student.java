import java.util.*;
class Student extends Person {
    private ArrayList<Subject> s = new ArrayList<>();
    private ArrayList<Double> g = new ArrayList<>();

    public Student(int i, int age, String name, String email) {
        super(age, name, email);
    }

    public void enrollCourse(Subject subject, double score) {
        s.add(subject);
        g.add(score);
    }

    public String[] getCourseNames() {
        String[] courseNames = new String[s.size()];
        for (int i = 0; i < s.size(); i++) {
            courseNames[i] = s.get(i).getName();
        }
        return courseNames;
    }
    public boolean isEnrolled(Subject subject){
        for (int i = 0; i < s.size(); i++) {
            if(s.get(i).getCode().equals(subject.getCode())) return true;
        }
        return false;
    }


    public void setScore(int c, double s) {
        g.set(c, s);
    }
    public String[] getFinalGrades() {
        String[] finalGrades = new String[s.size()];
        for (int i = 0; i < s.size(); i++) {
            finalGrades[i] = Grades.calculateGradeLetter(g.get(i));
        }
        return finalGrades;
    }
    public String getFinalGrade() {
        double sum = 0;
        for (int i = 0; i < g.size(); i++) {
            sum += g.get(i);
        }
        return Grades.calculateGradeLetter(sum / g.size());
    }
}
