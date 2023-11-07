import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Person person = new Person("Thiago", "Solteiro", "12.332.156-2", "123.621.189-32", "14/10/2000", "Mecânico");
        Employe employe = new Employe(1245.23, "Senor", "ti", "Jose", "Casado", "123.234.644-6", "456.745-56",
                "21/03/1989", "Developer");
        Student student = new Student("TSI", 12345, "Maria", "Solteira", "09.655.654-1", "234.875.634-54", "19/06/2002",
                "Engenheiro");
        Schedule mySchedule = new Schedule(person);
        mySchedule.setEmployes(employe);
        mySchedule.setStudents(student);

        System.out.println(mySchedule.toString());
        sc.close();
    }
}
