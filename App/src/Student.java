public class Student extends Person {
    private String course;
    private int enrollment;

    Student(String course, int enrollment, String name, String civilState, String rg, String cpf, String birthday, String work){
        super(name, civilState, rg, cpf, birthday, work);
        this.course = course;
        this.enrollment = enrollment;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    @Override
    public String toString() {
        return super.toString() + "\r\n" +
        "course: " + course + "\r\n" +
        "enrollment: " + enrollment;
    }
}
