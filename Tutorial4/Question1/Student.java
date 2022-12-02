package Tutorial4.Question1;

public class Student implements Printable {

    private String studentName = "";
    String grades[] = new String[5];

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String[] getGrades() {
        return grades;
    }

    public void setGrades(String[] grades) {
        this.grades = grades;
    }

    @Override
    public void print() {
        System.out.println(studentName);
        for (String g : grades) {
            System.out.println(g + ", ");

        }
    }
}
