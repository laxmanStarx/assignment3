package assignment4;



//Problem Statement
//A bank has different types of accounts.
//Create a base class Account
//Account (Parent Class)
//        •	Variables: accountNumber, customerName
//•	Method: displayAccountInfo()
//SavingsAccount (Child Class)
//•	Variable: interestRate
//•	Method: calculateInterest()
//CurrentAccount (Child Class)
//•	Variable: overdraftLimit
//•	Method: displayOverdraftLimit()


import java.util.Scanner;

class Account{

    long accountNumber;
    String customerName;


    Account(long accountNumber, String customerName){
        this.accountNumber = accountNumber;
        this.customerName = customerName;
//        this.displayAccountInfo();
    }

    public void displayAccountInfo(){
        System.out.println("Account Number " + accountNumber);
        System.out.println("customerName" + customerName);
    }

}


class SavingAccount extends Account{

    long interestRate;

    SavingAccount(long accountNumber,String customerName, long interestRate){
        super(accountNumber,customerName);
        this.interestRate = interestRate;
//        this.calculateInterest();

    }
    public void calculateInterest(){
        System.out.println(interestRate + "%");
    }





}


class CurrentAccount extends Account{
    long overdraftunit;
    CurrentAccount(long accountNumber,String customerName,long overdraftunit){
        super(accountNumber,customerName);
        this.overdraftunit = overdraftunit;
//        this.displayOverdraftLimit();

    }
    public void displayOverdraftLimit(){
        System.out.println("overdraftunit " + overdraftunit);
    }

}


public class BankSystem {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long accountNumber = sc.nextLong();
//        String customerName = sc.next();
//        long interestRate = sc.nextLong();
//        long overdraftunit = sc.nextLong();
        CurrentAccount c1 = new CurrentAccount( 2002,"lakhan",5000);
        SavingAccount d1 = new SavingAccount( 3002, "ramesh",  10000);
        c1.displayOverdraftLimit();
        c1.displayAccountInfo();
        d1.displayAccountInfo();
        d1.calculateInterest();



    }



}
