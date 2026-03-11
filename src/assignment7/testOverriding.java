package assignment7;



import java.util.Scanner;


interface  PaymentGateWay
{

    abstract void processPayment(float amount);


}


class NetBanking implements PaymentGateWay
{

    String bankname;



    public  void processPayment(float amount)
    {
        System.out.println(" payment of "+ amount + " processed using netbanking ");
    }

}

class UPI implements PaymentGateWay
{
    int upiId;



    public void processPayment(float amount)
    {
        System.out.println(" payment of "+ amount + " processed using UPI ");
    }
}


public class  testOverriding
{



    public PaymentGateWay  hello(String cname)
    {

        if(cname.equals("UPI"))
        {
            return new UPI();
        }else if(cname.equals("NetBanking"))
        {
            return new NetBanking();
        }else
            return null;





    }


    public static void main(String[] args)

    {

        PaymentGateWay p;

        Scanner s = new Scanner(System.in);
        String cname = s.next();
        testOverriding t = new testOverriding();

        p=t.hello(cname);
        p.processPayment(3000);





    }


}
