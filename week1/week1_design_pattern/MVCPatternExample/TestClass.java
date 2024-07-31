package MVCPatternExample;

public class TestClass {
    public static void main(String[] args) {
        Student st = new Student("yogesh", "123", "A");
        StudentView view = new StudentView();

        StudentController stc = new StudentController(st, view);

        stc.updateView();

        stc.setStudentName("yogesh");
        stc.setStudentId("321");
        stc.setStudentGrade("B");

        stc.updateView();
    }
}
