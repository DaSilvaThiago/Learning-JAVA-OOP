import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //instantiate new person
        Person p1 = new Person("Thiago", "Solteiro", "12.332.156-2", "123.621.189-32", "14/10/2000", "Developer");
        Person p2 = new Person("Jose", "Casado", "22.342.766-3", "543.345.122-22", "12/07/1986", "Developer");
        //instantiate an schedule pass a person by parameter
        Schedule p = new Schedule(p1);
        p.setContacts(p2);
        //find the person by the name
            //System.out.println(p.getContactByName("Thiago"));
        //find the person by the work
            //System.out.println(p.getWork("Developer"));
        //return all the list
            System.out.println(p.toString());
        sc.close();
    }
}
    