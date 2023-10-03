import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Person p1 = new Person("Thiago", "Solteiro", "12.332.156-2", "123.621.189-32", "14/10/2000");
        System.out.println(p1.getAge());
        System.out.println(p1.toString());
        sc.close();
    }
}
    