package assignment3;

//Create a class Product with attributes: productId, productName, price, quantity.

import java.util.Scanner;

public class ShoppingCart {

    int productId;
    String productName;
    int price;
    int quantity;

    ShoppingCart(int productId, String productName, int price, int quantity){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.display();

    }

    public class Cart{

        public void billtotal() {
            float total_bill = price * quantity;

//            System.out.println("Enter your total price");
//            Scanner sc = new Scanner(System.in);
//            total_bill = sc.nextFloat();
            float discounted = (total_bill / 100) * 90;

            if (total_bill > 5000) {
                System.out.println( " your discount price will be" + discounted);
            }else{
                System.out.println(" sorry we don't have any discount for you" + total_bill);
            }
        }



         }

    public void display(){

        System.out.println("The productId " + productId);
        System.out.println( "The product Name is " +  productName);
        System.out.println("The price would be " + price);
        System.out.println("The quantity be " + quantity);

    }
}


