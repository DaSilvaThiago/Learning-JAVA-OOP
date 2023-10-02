import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Person p1 = new Person("Thiago", 22);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.print("new name: ");
        String newName = sc.nextLine();
        p1.setName(newName);
        System.out.print("new age: ");
        int newAge = sc.nextInt();
        p1.setAge(newAge);
        System.out.println(p1.toString());
        sc.close();
    }
}
    