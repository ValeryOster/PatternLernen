package stedition.enums;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class Student {
    private String student;
    private Faculty faculty;

    public Student(String student, Faculty faculty) {
        this.student = student;
        this.faculty = faculty;
    }

    public String getStudent() {
        return student;
    }

    public Faculty getFaculty() {
        return faculty;
    }
}
