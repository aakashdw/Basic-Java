package hellojava;

public class BankAccount {

    int account_number;

    String customer_name;
    int balance;

    public BankAccount(int account_number, String customer_name, int balance) {
        this.account_number = account_number;
        this.customer_name = customer_name;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Enter valid amount");
            return;
        }
                    balance = balance + amount;
        
    }

    public void withdraw(int amount) {
        if (amount < 0) {
            System.out.println("Enter valid amount");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance  ");
            return;
        }
        balance = balance - amount;

    }

    public String toString() {
        if (balance < 0) {
            return String.format("Account_Number =%s, Customer_Name= %s, Balance= %s ", account_number, customer_name, balance);
        } else {
            return String.format("Account_Number =%s, Customer_Name= %s, Balance= %s ", account_number, customer_name, balance);
        }

    }

    public static void main(String[] args) {

        BankAccount ba1 = new BankAccount(101, "Aakash", 1000);

        System.out.println(ba1);

        ba1.deposit(0);

        System.out.println(ba1);
        ba1.withdraw(2000);
        System.out.println(ba1);

    }

}
