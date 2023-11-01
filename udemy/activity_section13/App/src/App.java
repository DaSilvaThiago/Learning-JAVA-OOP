import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entitiesEnum.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthday = sc.nextLine();

        System.out.println("Enter order data: ");
        System.out.print("Status:" );
        String status = sc.nextLine();

        Order order = new Order(OrderStatus.valueOf(status), new Client(name, email, LocalDate.parse(birthday, dtf)));

        System.out.print("How many items to this order? ");
        int its = sc.nextInt();
        for (int i = 1; i <= its; i++) {
            System.out.println("Enter #"+ i +" item data:");
            sc.nextLine();
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            order.addItem(new OrderItem(quantity, productPrice, new Product(productName, productPrice)));
        }

        System.out.println("ORDER SUMMARY: ");
        System.out.println("Order moment: " + order.getMoment());
        System.out.println("Order status: " + order.getOrderStatus());
        System.out.println("Client: " + order.getClient().toString());
        System.out.println("Order items: ");
        for (OrderItem item : order.getItems()) {
            System.out.print(item.toString() + "\n");
        }
        System.out.println("Total price: $" + order.total());

        sc.close();
    }
}
