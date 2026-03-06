class PaymentGateway {

    String accountNumber;
    String accountHolderName;

    PaymentGateway(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    void processPayment(double amount) {
        System.out.println("Processing payment...");
    }
}


class CreditCardPayment extends PaymentGateway {

    CreditCardPayment(String accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Payment Mode: Credit Card");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Amount: " + amount);
        System.out.println("Credit Card Payment Successful");
    }
}


class UPIPayment extends PaymentGateway {

    UPIPayment(String accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Payment Mode: UPI");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Amount: " + amount);
        System.out.println("UPI Payment Successful");
    }
}


class NetBankingPayment extends PaymentGateway {

    NetBankingPayment(String accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Payment Mode: Net Banking");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Amount: " + amount);
        System.out.println("Net Banking Payment Successful");
    }
}


public class main2 {

    public static void main(String[] args) {

        PaymentGateway p;

        // UPCASTING
        p = new UPIPayment("1234567890", "Rahul");

        // DOWNCASTING
        ((UPIPayment) p).processPayment(5000);

        System.out.println("---------------------");

        p = new CreditCardPayment("9876543210", "Amit");

        ((CreditCardPayment) p).processPayment(10000);

        System.out.println("---------------------");

        p = new NetBankingPayment("4567891230", "Priya");

        ((NetBankingPayment) p).processPayment(7000);
    }
}