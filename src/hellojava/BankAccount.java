package hellojava;

import java.util.Scanner;

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
            System.out.println(" You should not deposite Rs : " + amount);
            return;
        }
        balance = balance + amount;
        BankAccount ba1 = new BankAccount(101, "Aakash", 1000);
        ba1.deposit(-100);

    }

    public void withdraw(int amount) {//Method declaration
        if (amount <= 0) {
            System.out.println("You should not withdwar Rs : " + amount);
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance  ");
            return;
        }
        balance = balance - amount;

        BankAccount ba2 = new BankAccount(102, "Aakash", 2000);
        ba2.withdraw(3000);

    }

    public String toString() {
        if (balance < 0) {
            return String.format("Account_Number =%s, Customer_Name= %s, Balance= %s ", account_number, customer_name, balance);
        } else {
            return String.format("Account_Number =%s, Customer_Name= %s, Balance= %s ", account_number, customer_name, balance);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println(" 0 - Exit");
            System.out.println(" 1 - Create Account");
            System.out.println(" 2 - Deposit");
            System.out.println(" 3 - Withdraw ");

            int option = Integer.parseInt(input.nextLine());
            switch(option)
            {
                case 0:
                  return;
                
                case 1:
                    System.out.println("Create");
                    break;
                 case 2:
                    System.out.println(" Deposit");
                    break;
                    
                case 3:
                    System.out.println(" Withdraw");
                    break;
                default:
                    System.out.println(" Invalid");
                
            }
        }
    }
}
