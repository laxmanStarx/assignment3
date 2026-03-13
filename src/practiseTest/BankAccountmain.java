package practiseTest;

//Create a class BankAccount with attributes: accountNumber, accountHolderName, balance.
//•	Initialize values using a constructor and this keyword.
//•	Create an inner class Transaction.
//        •	Business Logic: Deposit and Withdraw amount, update balance.
//•	Write the main() method in a separate class BankApp


import java.util.Scanner;

class BankAccount{
    int accountNumber;
    String accountHolderName;
    int balance;
    BankAccount(int accountNumber, String accountHolderName, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

        public void display_detail(){
            System.out.println("Your accountNumber is: "+ accountNumber);
            System.out.println("Your accountHolderName is: "+ accountHolderName);
            System.out.println(balance);
        }


    class Transaction{

        int Deposit = 8900;
        public void calc_Amount() {
            Scanner sc = new Scanner(System.in);

            int new_balance = balance + Deposit;
            System.out.println("Enter the amount you want to withdraw");
            int WithDrawl_amount = sc.nextInt();
            int remain_balance = new_balance - WithDrawl_amount;
            System.out.println("Your new balance is: "+ new_balance);
            System.out.println("your remaing amount is "+ remain_balance);
        }

//       public void display_details(){
//           System.out.println("Your deposit is : "+ Deposit);
//
//
//       }
    }
}

public class BankAccountmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accountNumber = sc.nextInt();
        String accountHolderName = sc.next();
         int balance = sc.nextInt();

        BankAccount b1 = new BankAccount(accountNumber,accountHolderName,balance);
        BankAccount.Transaction t1 = b1. new Transaction();
        b1.display_detail();
        t1.calc_Amount();

    }
}
