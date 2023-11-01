package application;

// import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
// import java.util.Scanner;

import entities.Comment;
// import entities.Department;
// import entities.HourContract;
import entities.Post;
// import entities.Worker;
// import entitiesEnum.WorkerLevel;

public class App {
    public static void main(String[] args) throws Exception {
        DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        Post post01 = new Post(LocalDateTime.parse("10/10/2000 18:43:23", data), "Traveling to Nwe Zeeland", "I'm going to visit this wonderful country!", 11);
        post01.addComment(new Comment("Have a nice trip!"));
        post01.addComment(new Comment("Wow that's awesome!"));
        System.out.println(post01.toString());

        
































// activity 01

        // Scanner sc = new Scanner(System.in);
        // DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // System.out.print("Enter department's name: ");
        // String departmentName = sc.nextLine();
        // System.out.println("Enter worker data:");
        // System.out.print("Name: ");
        // String name = sc.nextLine();
        // System.out.print("Level: ");
        // String level = sc.nextLine();
        // System.out.print("Base salary: ");
        // double salary = sc.nextDouble();
        // sc.nextLine();
        // Worker worker = new Worker(name, WorkerLevel.valueOf(level), salary, new Department(departmentName));

        // System.out.print("How many contracts to this worker? ");
        // int contracts = sc.nextInt();
        // sc.nextLine();

        // for (int i = 1; i <= contracts; i++) {
        //     System.out.println("Enter contract #" + i + " data:");
        //     System.out.print("Date (DD/MM/YYYY): ");
        //     LocalDate date = LocalDate.parse(sc.next(), fmt);
        //     System.out.print("Value per hour: ");
        //     double valuePerHour = sc.nextDouble();
        //     System.out.print("Duration (hours): ");
        //     int duration = sc.nextInt();
        //     worker.addContract(new HourContract(date, valuePerHour, duration));
        // }
        // sc.nextLine();
        // System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        // String incomeDate = sc.nextLine();
        // int incomeMonth = Integer.parseInt(incomeDate.substring(0, 2));
        // int incomeYear = Integer.parseInt(incomeDate.substring(3));
        // System.out.println("Name: " + worker.getName());
        // System.out.println("Department: " + worker.getDepartment().getName());
        // System.out.print("Income for " + incomeDate + ": " + worker.income(incomeYear, incomeMonth));
        // sc.close();








    // learning

        // Order order = new Order(2010, new Date(), OrderStatus.PENDING_PAYMENT);

        // OrderStatus os1 = OrderStatus.PROCESSING;
        // OrderStatus os2 = OrderStatus.valueOf("PROCESSING");

        // System.out.println(order);
        // System.out.println(os1);
        // System.out.println(os2);
    }
}
