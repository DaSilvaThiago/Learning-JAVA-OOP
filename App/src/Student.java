public class Student extends Person {
    private String course;
    private int enrollment;

    Student(String course, int enrollment, String name, String civilState, String rg, String cpf, String birthday, String work) {
        super(name, civilState, rg, cpf, birthday, work);
        this.course = course;
        setEnrollment(enrollment);
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
        if (enrollment >= 1 && enrollment <= 5) {
            this.enrollment = enrollment;
        } else {
            throw new IllegalArgumentException("Ano de matrícula deve estar entre 1 e 5.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\r\n" +
                "course: " + course + "\r\n" +
                "enrollment: " + enrollment;
    }
}
