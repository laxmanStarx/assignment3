package assignment5;

//Design a superclass FoodOrder with the following instance variables:
//        •	orderId
//•	customerName
//The superclass should contain a method calculateBill(double price).
//Create the following subclasses:
//        •	DineInOrder
//•	TakeAwayOrder
//•	HomeDeliveryOrder
//Requirements:
//        •	Each subclass should override the calculateBill() method.
//        •	The bill calculation logic should differ based on the order type (service charge, packaging charge, delivery charge, etc.).
//        •	Display order details, customer name, order type, and final bill amount.

class FoodOrder{
    int orderId;
    String customerName;

    FoodOrder(int orderId,String customerName){
        this.orderId = orderId;
        this.customerName = customerName;
    }
    public void calculateBill(double price){
        System.out.println("OrderId: "+ orderId);
        System.out.println("customerName: "+ customerName);
    }
}

class DiningOut extends FoodOrder{
    long serviceCharge;
    DiningOut(int orderId, String customerName, long serviceCharge){
        super(orderId, customerName);

        this.serviceCharge = serviceCharge;
    }
    public void calculateBill(double price){
        System.out.println("orderId: "+ orderId);
        System.out.println("CustomerName: "+ customerName);
        System.out.println("serviceCharge: "+ serviceCharge);


    }


}



class TakeAwayOrder extends FoodOrder{

    double packagingCharge;
    TakeAwayOrder(int orderId, String customerName,double packagingCharge){
        super(orderId,customerName);
        this.packagingCharge = packagingCharge;
    }

    public void calculateBill(double price){

        System.out.println("orderId: "+ orderId);
        System.out.println("CustomerName: "+ customerName);
        System.out.println("serviceCharge: "+ packagingCharge);
        System.out.println("total Price: " + price);

    }

}


class HomeDeliveryOrder extends FoodOrder{

    long deliveryCharge;
    HomeDeliveryOrder(int orderId, String customerName,long deliveryCharge){
        super(orderId,customerName);
        this.deliveryCharge = deliveryCharge;
    }

    public void calculateBill(double price){

        System.out.println("orderId: "+ orderId);
        System.out.println("CustomerName: "+ customerName);
        System.out.println("serviceCharge: "+ deliveryCharge);

    }


}
















public class OnlineFoodmain {
    public static void main(String[] args) {
        FoodOrder f1 = new DiningOut(2002,"Rajesh",890);
        FoodOrder f2 = new TakeAwayOrder(9009,"Harita",908);
        FoodOrder f3 = new HomeDeliveryOrder(9876,"Sai", 890);
        f1.calculateBill(789);
        f2.calculateBill(5600);
        f3.calculateBill(780);
    }
}
