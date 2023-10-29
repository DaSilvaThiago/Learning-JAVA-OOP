
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thiago.dsilva10
 */
public class Schedule {
    private List<Person> contacts = new ArrayList<>();
    private List<Employe> employes = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private List<Person> foundPerson = new ArrayList<>();
    private List<Employe> foundEmploye = new ArrayList<>();
    private List<Student> foundStudent = new ArrayList<>();

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

    public String getContactByName(String name) {
        for (Person person : contacts) {
            if (person.getName().equals(name.trim())) {
                this.foundPerson.add(person);
            }
        }
        for (Employe employe : employes) {
            if (employe.getName().equals(name)) {
                this.foundEmploye.add(employe);
            }
        }
        for (Student student : students) {
            if (student.getName().equals(name)) {
                this.foundStudent.add(student);
            }
        }
        if (foundPerson != null) {
            return foundPerson.toString();
        } else if (foundEmploye != null) {
            return foundEmploye.toString();
        } else if (foundStudent != null) {
            return foundStudent.toString();
        } else {
            return "Person or Employe not found!";
        }
    }

    public String getEmployeByDepartment(String department) {
        for (Employe employe : employes) {
            if (employe.getDepartment().equals(department.trim())) {
                this.foundEmploye.add(employe);
            }
        }
        if (foundEmploye != null) {
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
