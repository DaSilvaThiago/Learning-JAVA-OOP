import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        System.out.print("Is there an inital deposit (y/n)? ");
        char initalDeposit = sc.next().charAt(0);
        System.out.print((initalDeposit == 'y') ? "Enter initial deposit value: " : "");
        double deposit = (initalDeposit == 'y') ? sc.nextDouble() : 0;
        BankAccount bank = (initalDeposit == 'y') ? new BankAccount(accountNumber, name, deposit) : new BankAccount(accountNumber, name);
        
        System.out.println("Account data: ");
        System.out.println(bank);
        
        System.out.print("Enter a deposit value: ");
        deposit = sc.nextDouble();
        bank.deposit(deposit);
        System.out.println("Updated account data: ");
        System.out.println(bank);

        System.out.print("Enter a withdraw value: ");
        float withdraw = sc.nextFloat();
        bank.withDraw(withdraw);
        System.out.println("Updated account data: ");
        System.out.println(bank);

        sc.close();
    }
}