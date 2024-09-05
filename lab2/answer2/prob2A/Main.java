package prob2A;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("John");
        student.getGradeReport().setGrade("A");
        System.out.println("prob2A.Student name:  " + student.getGradeReport().getStudent() + ", grade: " + student.getGradeReport().getGrade());

        // Navigate from grade report.
        GradeReport gradeReport = student.getGradeReport();
        System.out.println(gradeReport.getStudent());

    }
}