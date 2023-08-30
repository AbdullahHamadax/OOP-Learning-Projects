import java.util.*;
public class Subject {
    private String code;
    private String name;
    private int sNo=0;
    private Exam exam;
    private ArrayList<Student> students = new ArrayList<Student>();

    public Subject(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student, double score) {
        if (students.size() < 5) {
            students.add(student);
            student.enrollCourse(this, score);
        }
    }
}
