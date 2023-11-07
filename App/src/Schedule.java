import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<Person> contacts = new ArrayList<>();
    private List<Employe> employes = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public Schedule(Person person) {
        this.contacts.add(person);
    }

    public Schedule(Employe employe) {
        this.employes.add(employe);
    }

    public Schedule(Student student) {
        this.students.add(student);
    }

    public List<Person> getContacts() {
        return this.contacts;
    }

    public List<Employe> getEmployes() {
        return this.employes;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public List<Student> getStudentsInLastYear() {
        List<Student> lastYearStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getEnrollment() == 5) {
                lastYearStudents.add(student);
            }
        }
        return lastYearStudents;
    }

    public double calcularMediaIdade() {
        double somaIdades = 0;
        for (Person contact : contacts) {
            somaIdades += contact.getAge();
        }
        return somaIdades / contacts.size();
    }

    public String getContactByName(String name) {
        List<Person> foundPerson = new ArrayList<>();
        List<Employe> foundEmploye = new ArrayList<>();
        List<Student> foundStudent = new ArrayList<>();

        for (Person person : contacts) {
            if (person.getName().equals(name.trim())) {
                foundPerson.add(person);
            }
        }
        for (Employe employe : employes) {
            if (employe.getName().equals(name)) {
                foundEmploye.add(employe);
            }
        }
        for (Student student : students) {
            if (student.getName().equals(name)) {
                foundStudent.add(student);
            }
        }
        if (!foundPerson.isEmpty()) {
            return foundPerson.toString();
        } else if (!foundEmploye.isEmpty()) {
            return foundEmploye.toString();
        } else if (!foundStudent.isEmpty()) {
            return foundStudent.toString();
        } else {
            return "Person or Employe not found!";
        }
    }

    public String getEmployeByDepartment(String department) {
        List<Employe> foundEmploye = new ArrayList<>();
        for (Employe employe : employes) {
            if (employe.getDepartment().equals(department.trim())) {
                foundEmploye.add(employe);
            }
        }
        if (!foundEmploye.isEmpty()) {
            return foundEmploye.toString();
        } else {
            return "Department not found!";
        }
    }

    public double getAvarageSalary() {
        double sum = 0;
        int qnt = 0;
        for (Employe employe : employes) {
            sum += employe.getSalary();
            qnt++;
        }
        return sum / qnt;
    }

    public String getWork(String work) {
        List<Person> sameWork = new ArrayList<>();
        for (Person person : contacts) {
            if (person.getWork().equals(work)) {
                sameWork.add(person);
            }
        }
        if (!sameWork.isEmpty()) {
            return sameWork.toString();
        } else {
            return "Work not found!";
        }
    }

    public void setContacts(Person p) {
        this.contacts.add(p);
    }

    public void setEmployes(Employe e) {
        this.employes.add(e);
    }

    public void setStudents(Student s) {
        this.students.add(s);
    }

    @Override
    public String toString() {
        return "\r\nPersons: \r\n" + this.getContacts() + "\r\n" +
                "\r\nEmployes: \r\n" + this.getEmployes() + "\r\n" +
                "\r\nStudents: \r\n" + this.getStudents() + "\r\n";
    }
}
