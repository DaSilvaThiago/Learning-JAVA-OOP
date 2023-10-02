import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main object = new Main();
        System.out.println(object);
        int options = 0;
        do {
            System.out.println("[1]Show quantity in stock.\r\n" +
                    "[2]Add product in stock.\r\n" +
                    "[3]witdhdraw product stock.\r\n" +
                    "[4]Change product name.\r\n" +
                    "[5]Show deatils of product.\r\n" +
                    "[0]Out.");
            options = sc.nextInt();
            switch (options) {
                case 1:
                    System.out.println(object.getQuantity());
                    break;
                case 2:
                    int x = sc.nextInt();
                    object.addProduct(x);
                    break;
                case 3:
                    int x2 = sc.nextInt();
                    System.out.println(object.withDraw(x2));
                    break;
                case 4:
                    String newName = sc.next();
                    System.out.println(object.updateName(newName));
                case 5:
                    System.out.println(object);
            }
        } while (options != 0);
        sc.close();
    }
}
