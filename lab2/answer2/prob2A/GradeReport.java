package prob2A;

public class GradeReport {
    private String grade;
    private Student student;

    // Package level
    GradeReport(Student student) {
        this.student = student;
    }

    public String getGrade() {
        return grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return grade;
    }
}
