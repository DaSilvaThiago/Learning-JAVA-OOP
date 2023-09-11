public class BankAccount {
    private final int accountNumber;
    private String name;
    private double amountInAccount;

    public BankAccount(int accountNumber, String name){
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public BankAccount(int accountNumber, String name, double initialDeposit){
        this.accountNumber = accountNumber;
        this.name = name;
        deposit(initialDeposit);
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getAmountInAccount(){
        return amountInAccount;
    }

    public void deposit(double value){
        this.amountInAccount += value;
    }

    public void withDraw(double value){
        this.amountInAccount -= (value + 5.00);
    }

    public String toString(){
        return "Account " + getAccountNumber() + ", Holder: " + getName() + ", Balance: $ " + getAmountInAccount();
    }
}
